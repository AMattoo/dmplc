#include <boost/lexical_cast.hpp>
#include "SyncSeq.hpp"

/*********************************************************************/
//methods for GlobalStmtTransformer
/*********************************************************************/
void daig::GlobalStmtTransformer::addSubst(const std::string &s,size_t i)
{
  if(substMap.count(s)) {
    std::cerr << "ERROR: substitution mapping for " << s << " exists already!!\n";
    assert(0);
  }
  substMap[s] = i;
}

void daig::GlobalStmtTransformer::delSubst(const std::string &s)
{
  if(!substMap.count(s)) {
    std::cerr << "ERROR: substitution mapping for " << s << " doesn't exist!!\n";
    assert(0);
  }
  substMap.erase(s);
}

void daig::GlobalStmtTransformer::exitAtomic(daig::AtomicStmt &stmt)
{
  res[host] = res[stmt.data];
}

void daig::GlobalStmtTransformer::exitPrivate(daig::PrivateStmt &stmt)
{
  res[host] = res[stmt.data];
}

void daig::GlobalStmtTransformer::exitBlock(daig::BlockStmt &stmt)
{
  StmtList sl;
  BOOST_FOREACH(const Stmt &s,stmt.data) sl.push_back(res[s]);
  res[host] = Stmt(new BlockStmt(sl));
}

void daig::GlobalStmtTransformer::exitAsgn(daig::AsgnStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitIT(daig::ITStmt &stmt) 
{ 
  res[host] = Stmt(new ITStmt(stmt.cond, res[stmt.tbranch]));
}

void daig::GlobalStmtTransformer::exitITE(daig::ITEStmt &stmt) 
{ 
  res[host] = Stmt(new ITEStmt(stmt.cond, res[stmt.tbranch], res[stmt.ebranch]));
}

void daig::GlobalStmtTransformer::exitFor(daig::ForStmt &stmt) 
{ 
  StmtList nin,nup;
  BOOST_FOREACH(const Stmt &s,stmt.init) nin.push_back(res[s]);
  BOOST_FOREACH(const Stmt &s,stmt.update) nup.push_back(res[s]);
  res[host] = Stmt(new ForStmt(nin,stmt.test,nup,res[stmt.body]));
}

void daig::GlobalStmtTransformer::exitWhile(daig::WhileStmt &stmt) 
{ 
  res[host] = Stmt(new WhileStmt(stmt.cond,res[stmt.body]));
}

void daig::GlobalStmtTransformer::exitBreak(daig::BreakStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitCont(daig::ContStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitRet(daig::RetStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitRetVoid(daig::RetVoidStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitCall(daig::CallStmt &stmt) 
{ 
  res[host] = host; 
}

void daig::GlobalStmtTransformer::exitFAN(daig::FANStmt &stmt) 
{ 
  Stmt shost = host;
  StmtList sl;

  for(size_t i = 0;i < nodeNum;++i) {
    addSubst(stmt.id,i);
    visit(stmt.data);
    sl.push_back(res[stmt.data]);
    delSubst(stmt.id);
  }

  res[shost] = Stmt(new daig::BlockStmt(sl));
}

void daig::GlobalStmtTransformer::exitFADNP(daig::FADNPStmt &stmt) 
{ 
  Stmt shost = host;
  StmtList sl;

  for(size_t i1 = 0;i1 < nodeNum;++i1) {
    for(size_t i2 = i1+1;i2 < nodeNum;++i2) {
      addSubst(stmt.id1,i1);
      addSubst(stmt.id2,i2);
      visit(stmt.data);
      sl.push_back(res[stmt.data]);
      delSubst(stmt.id1);
      delSubst(stmt.id2);
    }
  }

  res[shost] = Stmt(new daig::BlockStmt(sl));
}

void daig::GlobalStmtTransformer::exitFAO(daig::FAOStmt &stmt) 
{ res[host] = host; }

void daig::GlobalStmtTransformer::exitFAOL(daig::FAOLStmt &stmt) 
{ res[host] = host; }

void daig::GlobalStmtTransformer::exitFAOH(daig::FAOHStmt &stmt) 
{ res[host] = host; }

/*********************************************************************/
//constructor
/*********************************************************************/
daig::SyncSeq::SyncSeq(daig::DaigBuilder &b,size_t n) : builder(b),nodeNum(n) 
{
  Program &prog = builder.program;
  assert(prog.nodes.size() == 1 && "ERROR: only node type supported!");
}

/*********************************************************************/
//create the global variables
/*********************************************************************/
void daig::SyncSeq::createGlobVars()
{
  Node &node = builder.program.nodes.begin()->second;

  //instantiate node-global variables by replacing dimension #N with
  //nodeNum -- make two copies, one for initial value for a round, and
  //the other for the final value for a round
  std::list<Variable> gvars;
  BOOST_FOREACH(Variables::value_type &v,node.globVars) {
    gvars.push_back(v.second.instDim(nodeNum));
  }
  BOOST_FOREACH(const Variable &v,gvars) {
    cprog.addGlobVar(v.instName("_i"));
    cprog.addGlobVar(v.instName("_f"));
  }

  //instantiate node-local variables by adding _i for each node id i
  BOOST_FOREACH(Variables::value_type &v,node.locVars) {
    for(size_t i = 0;i < nodeNum;++i)
      cprog.addGlobVar(v.second.instName(std::string("_") + 
                                         boost::lexical_cast<std::string>(i)));
  }
}

/*********************************************************************/
//create list of statements that copy new value of var into old value
//of var. append list of statements to res.
/*********************************************************************/
void daig::SyncSeq::createCopyStmts(const Variable &var,StmtList &res,ExprList indx)
{
  //non-array type
  if(var.type->dims.empty()) {
    Expr lhs(new LvalExpr(var.name + "_i",indx));
    Expr rhs(new LvalExpr(var.name + "_f",indx));
    Stmt stmt(new AsgnStmt(lhs,rhs));
    res.push_back(stmt);
    return;
  }

  //array type -- peel off the first dimension and iterate over it
  //recursively
  int dim = *(var.type->dims.begin());
  for(int i = 0;i < dim;++i) {
    ExprList newIndx = indx;
    newIndx.push_back(Expr(new IntExpr(i)));
    Variable newVar = var.decrDim();
    createCopyStmts(newVar,res,newIndx);
  }
}

/*********************************************************************/
//create function that copies global variables back at the end of a
//round
/*********************************************************************/
void daig::SyncSeq::createRoundCopier()
{
  Node &node = builder.program.nodes.begin()->second;
  std::list<daig::Variable> fnParams,fnTemps;
  StmtList fnBody;

  BOOST_FOREACH(Variables::value_type &v,node.globVars) {
    Variable var = v.second.instDim(nodeNum);
    createCopyStmts(var,fnBody,ExprList());
  }

  Function func(daig::voidType(),"round_copier",fnParams,fnTemps,fnBody);
  cprog.addFunction(func);
}

/*********************************************************************/
//create the main function
/*********************************************************************/
void daig::SyncSeq::createMainFunc()
{
  std::list<daig::Variable> mainParams,mainTemps;
  StmtList mainBody,roundBody;

  //call SAFETY()
  Expr callExpr1(new LvalExpr("SAFETY"));
  Stmt callStmt1(new CallStmt(callExpr1,daig::ExprList()));
  roundBody.push_back(callStmt1);

  //call ROUND function of each node
  for(size_t i = 0;i < nodeNum;++i) {
    std::string callName = std::string("ROUND_") + boost::lexical_cast<std::string>(i);
    Expr callExpr(new LvalExpr(callName));
    Stmt callStmt(new CallStmt(callExpr,daig::ExprList()));
    roundBody.push_back(callStmt);
  }

  //call round copier
  Expr callExpr2(new LvalExpr("round_copier"));
  Stmt callStmt2(new CallStmt(callExpr2,daig::ExprList()));
  roundBody.push_back(callStmt2);

  //add call to INIT()
  Expr callExpr3(new LvalExpr("INIT"));
  Stmt callStmt3(new CallStmt(callExpr3,daig::ExprList()));
  mainBody.push_back(callStmt3);

  //add the for statement
  Stmt forBody(new BlockStmt(roundBody));
  mainBody.push_back(Stmt(new ForStmt(StmtList(),ExprList(),StmtList(),forBody)));

  Function mainFunc(daig::voidType(),"main",mainParams,mainTemps,mainBody);
  cprog.addFunction(mainFunc);
}

/*********************************************************************/
//create the INIT() function
/*********************************************************************/
void daig::SyncSeq::createInit()
{
  std::list<daig::Variable> fnParams,fnTemps;
  StmtList fnBody;

  //if no INIT() defined, create an empty one
  daig::Functions::iterator fit = builder.program.funcs.find("INIT");
  if(fit == builder.program.funcs.end()) {
    std::cout << "node does not have a INIT function, creating an empty one ...\n";
    Function func(daig::voidType(),"INIT",fnParams,fnTemps,fnBody);
    cprog.addFunction(func);
    return;
  }

  //transform the body of init
  BOOST_FOREACH(const Stmt &st,fit->second.body) {
    GlobalStmtTransformer gst(nodeNum);
    gst.visit(st);
    fnBody.push_back(gst.res[st]);
  }

  Function func(daig::voidType(),"INIT",fnParams,fnTemps,fnBody);
  cprog.addFunction(func);
}

/*********************************************************************/
//create the SAFETY() function
/*********************************************************************/
void daig::SyncSeq::createSafety()
{
  Node &node = builder.program.nodes.begin()->second;
  std::list<daig::Variable> fnParams,fnTemps;
  StmtList fnBody;

  //if no SAFETY() defined, create an empty one
  daig::Functions::iterator fit = node.funcs.find("SAFETY");
  if(fit == node.funcs.end()) {
    std::cout << "node does not have a SAFETY function, creating an empty one ...\n";
    Function func(daig::voidType(),"SAFETY",fnParams,fnTemps,fnBody);
    cprog.addFunction(func);
    return;
  }


  Function func(daig::voidType(),"SAFETY",fnParams,fnTemps,fnBody);
  cprog.addFunction(func);
}

/*********************************************************************/
//run the sequentialization, generating a C program
/*********************************************************************/
void daig::SyncSeq::run()
{
  std::cout << "Sequentializing with " << nodeNum << " nodes ...\n";

  createGlobVars();
  createRoundCopier();
  createMainFunc();
  createInit();
  createSafety();

  //instantiate functions
}

/*********************************************************************/
//print the sequentialized program
/*********************************************************************/
void daig::SyncSeq::printProgram(std::ostream &os)
{
  cprog.print(os,0);
}

/*********************************************************************/
//end of file
/*********************************************************************/
