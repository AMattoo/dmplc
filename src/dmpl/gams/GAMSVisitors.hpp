/**
 * Copyright (c) 2015 Carnegie Mellon University. All Rights Reserved.

 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:

 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following acknowledgments
 * and disclaimers.

 * 2. Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution.

 * 3. The names "Carnegie Mellon University," "SEI" and/or "Software
 * Engineering Institute" shall not be used to endorse or promote
 * products derived from this software without prior written
 * permission. For written permission, please contact
 * permission@sei.cmu.edu.

 * 4. Products derived from this software may not be called "SEI" nor
 * may "SEI" appear in their names without prior written permission of
 * permission@sei.cmu.edu.

 * 5. Redistributions of any form whatsoever must retain the following
 * acknowledgment:

 * This material is based upon work funded and supported by the
 * Department of Defense under Contract No. FA8721-05-C-0003 with
 * Carnegie Mellon University for the operation of the Software
 * Engineering Institute, a federally funded research and development
 * center.

 * Any opinions, findings and conclusions or recommendations expressed
 * in this material are those of the author(s) and do not necessarily
 * reflect the views of the United States Department of Defense.

 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE
 * ENGINEERING INSTITUTE MATERIAL IS FURNISHED ON AN "AS-IS"
 * BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND,
 * EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING, BUT NOT
 * LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE
 * MELLON UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH
 * RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT
 * INFRINGEMENT.

 * This material has been approved for public release and unlimited
 * distribution.

 * DM-0002494
**/


#ifndef __GAMS_VISITORS_HPP__
#define __GAMS_VISITORS_HPP__

#include <iostream>
#include <sstream>
#include "dmplc/DmplBuilder.hpp"
#include "dmpl/Visitor.h"
#include "dmpl/Function.h"
#include "dmpl/Node.h"

namespace dmpl
{
  namespace madara
  {
    /*******************************************************************/
    //-- Visitor that converts DMPL to GAMS-Targeted C++ Code
    /*******************************************************************/
    class GAMSCompiler : public Visitor
    {
    public:
      /**
       * Constructor
       * @param  builder   the source for building a program
       * @param  buffer    the buffer being used to create the program text
       **/
      GAMSCompiler (const Func & function, const Node & node,
                    const Func & thread,
                    DmplBuilder & builder, std::stringstream & buffer,
                    bool do_expect, bool do_analyzer);
      
      //-- construct a map from node ids to node ids that they should
      //-- iterate over given a specific type of iteration construct
      //-- (EXISTS_LOWER, EXISTS_HIGHER, etc.)
      std::map< NodeId,std::set<NodeId> > iterIdMap(Expression &expr);

      //-- a common handler for exists_lower, exists_higher, and exists_other
      void exitEXHLO (Expression & expression);

      /**
       * Returns whether or not to visit the Integer's subfields first.
       * @param  expr   the integer expression
       **/
      virtual bool enterInt(IntExpr &expr);

      /**
       * Visits an integer
       * @param  expr   the integer to visit
       **/
      virtual void exitInt(IntExpr &expr);

      /**
       * Returns whether or not to visit the double's subfields first.
       * @param  expr   the double expression
       **/
      virtual bool enterDouble(DoubleExpr &expr);

      /**
       * Visits a double
       * @param  expr   the double to visit
       **/
      virtual void exitDouble(DoubleExpr &expr);

      //-- visitors for string expressions
      virtual bool enterString(StringExpr &expr);
      virtual void exitString(StringExpr &expr);

      /**
       * Returns whether or not to visit a variable's subfields first
       * @param  expr   the variable expression
       **/
      virtual bool enterLval(LvalExpr &expr);

      /**
       * Visits a variable
       * @param  expr   the variable to visit
       **/
      virtual void exitLval(LvalExpr &expr);

      /**
       * Returns whether or not to visit a comparison's subfields first
       * @param  expr   the comparison expression
       **/
      virtual bool enterComp(CompExpr &expr);

      /**
       * Visits a comparison
       * @param  expr   the comparison to visit
       **/
      virtual void exitComp(CompExpr &expr);

      /**
       * Returns whether or not to visit a function call's subfields first
       * @param  expr   the function call expression
       **/
      virtual bool enterCall(CallExpr &expr);

      /**
       * Visits a function call
       * @param  expr   the function call to visit
       **/
      virtual void exitCall(CallExpr &expr);

      /**
       * Returns whether or not to visit a there exists other's subfields first
       * @param  expr   the there exists other's expression
       **/
      virtual bool enterEXO(EXOExpr &expr);

      /**
       * Visits a there exists other
       * @param  expr   the there exists other to visit
       **/
      virtual void exitEXO(EXOExpr &expr);

      /**
       * Returns whether or not to visit a there exists higher id's subfields
       * first
       * @param  expr   the there exists higher id expression
       **/
      virtual bool enterEXH(EXHExpr &expr);

      /**
       * Visits a there exists higher id expression
       * @param  expr   the there exists higher id expression to visit
       **/
      virtual void exitEXH(EXHExpr &expr);

      /**
       * Returns whether or not to visit a there exists lower id's subfields
       * first
       * @param  expr   the there exists lower id expression
       **/
      virtual bool enterEXL(EXLExpr &expr);

      /**
       * Visits a there exists lower id expression
       * @param  expr   the there exists lower id expression to visit
       **/
      virtual void exitEXL(EXLExpr &expr);
    
      /**
       * Returns whether or not to visit a private block's subfields first
       * @param  expr   the private block's statement
       **/
      virtual bool enterPrivate(PrivateStmt &stmt);

      /**
       * Visits a private block
       * @param  stmt   the private block statement to visit
       **/
      virtual void exitPrivate(PrivateStmt &stmt);
    
      /**
       * Returns whether or not to visit a block's subfields first. Blocks
       * are usually the bodies of control structures.
       * @param  stmt   the block's statement
       **/
      virtual bool enterBlock(BlockStmt &stmt);

      /**
       * Visits a block. These are usually the body of control structures.
       * @param  stmt   the private block statement to visit
       **/
      virtual void exitBlock(BlockStmt &stmt);
    
      /**
       * Returns whether or not to visit an assignment's subfields first.
       * @param  stmt   the assignment statement
       **/
      virtual bool enterAsgn(AsgnStmt &stmt);

      /**
       * Visits an assignment.
       * @param  stmt   the assignment statement
       **/
      virtual void exitAsgn(AsgnStmt &stmt);
    
      /**
       * Returns whether or not to visit an if/then's subfields first.
       * @param  stmt   the if/then statement
       **/
      virtual bool enterCond(CondStmt &stmt);

      /**
       * Visits an if/then statement.
       * @param  stmt   the if/then statement
       **/
      virtual void exitCond(CondStmt &stmt);
    
      /**
       * Returns whether or not to visit a for loop's subfields first.
       * @param  stmt   the for loop statement
       **/
      virtual bool enterFor(ForStmt &stmt);

      /**
       * Visits a for loop statement.
       * @param  stmt   the for loop statement
       **/
      virtual void exitFor(ForStmt &stmt);
    
      /**
       * Returns whether or not to visit a while loop's subfields first.
       * @param  stmt   the while loop statement
       **/
      virtual bool enterWhile(WhileStmt &stmt);

      /**
       * Visits a while loop statement.
       * @param  stmt   the while loop statement
       **/
      virtual void exitWhile(WhileStmt &stmt);
    
      /**
       * Returns whether or not to visit a break statement's subfields first.
       * @param  stmt   the break statement
       **/
      virtual bool enterBreak(BreakStmt &stmt);

      /**
       * Visits a break statement.
       * @param  stmt   the break statement
       **/
      virtual void exitBreak(BreakStmt &stmt);
    
      /**
       * Returns whether or not to visit a continue statement's subfields first.
       * @param  stmt   the continue statement
       **/
      virtual bool enterCont(ContStmt &stmt);

      /**
       * Visits a continue statement.
       * @param  stmt   the continue statement
       **/
      virtual void exitCont(ContStmt &stmt);
    
      /**
       * Returns whether or not to visit a return statement's subfields first.
       * @param  stmt   the return statement
       **/
      virtual bool enterRet(RetStmt &stmt);

      /**
       * Visits a return statement.
       * @param  stmt   the return statement
       **/
      virtual void exitRet(RetStmt &stmt);
    
      /**
       * Returns whether or not to visit a return void statement's subfields first.
       * @param  stmt   the return void statement
       **/
      virtual bool enterRetVoid(RetVoidStmt &stmt);

      /**
       * Visits a return void statement.
       * @param  stmt   the return void statement
       **/
      virtual void exitRetVoid(RetVoidStmt &stmt);
    
      /**
       * Returns whether or not to visit a function call's subfields first.
       * @param  stmt   the function call
       **/
      virtual bool enterCall(CallStmt &stmt);

      /**
       * Visits a function call.
       * @param  stmt   the function call
       **/
      virtual void exitCall(CallStmt &stmt);
    
      /**
       * Returns whether or not to visit a for all node statement's subfields.
       * @param  stmt   the for all node statement
       **/
      virtual bool enterFAN(FANStmt &stmt);

      /**
       * Visits a for all node statement.
       * @param  stmt   the for all node statement
       **/
      virtual void exitFAN(FANStmt &stmt);
    
      /**
       * Returns whether or not to visit a for all distinct node pair statement's
       * subfields.
       * @param  stmt   the for all distinct node pair statement
       **/
      virtual bool enterFADNP(FADNPStmt &stmt);

      /**
       * Visits a for all distinct node pair statement.
       * @param  stmt   the for all distinct node pair statement
       **/
      virtual void exitFADNP(FADNPStmt &stmt);
    
      /**
       * Returns whether or not to visit a for all other nodes statement's
       * subfields.
       * @param  stmt   the for all other nodes statement
       **/
      virtual bool enterFAO(FAOStmt &stmt);

      /**
       * Visits a for all other nodes statement.
       * @param  stmt   the for all other nodes statement
       **/
      virtual void exitFAO(FAOStmt &stmt);
    
      /**
       * Returns whether or not to visit a for all other lower nodes statement's
       * subfields.
       * @param  stmt   the for all other lower nodes statement
       **/
      virtual bool enterFAOL(FAOLStmt &stmt);

      /**
       * Visits a for all other lower nodes statement.
       * @param  stmt   the for all other lower nodes statement
       **/
      virtual void exitFAOL(FAOLStmt &stmt);
    
      /**
       * Returns whether or not to visit a for all other higher nodes statement's
       * subfields.
       * @param  stmt   the for all other higher nodes statement
       **/
      virtual bool enterFAOH(FAOHStmt &stmt);

      /**
       * Visits a for all other higher nodes statement.
       * @param  stmt   the for all other higher nodes statement
       **/
      virtual void exitFAOH(FAOHStmt &stmt);

      //-- whether or not to visit forall_await statement's subfields
      virtual bool enterAwaitForall(AwaitForallStmt &stmt);
      
      //-- visit forall_await statement's subfields
      virtual void exitAwaitForall(AwaitForallStmt &stmt);
      
      /// set of referred role names
      std::set<std::string> refRoles;

    private:
      
      /// current function
      Func function_;

      /// current thread
      Func thread_;

      /// current node
      const Node & node_;

      /// the result of the DASL parsing function
      DmplBuilder & builder_;

      /// character buffer for holding results of build
      std::stringstream & buffer_;

      ///whether we are generating code for VREP
      //bool do_vrep_;

      ///whether we are generating code with an expect logger
      bool do_expect_;
      
      ///whether we are generating code for expect log analyzer
      bool do_analyzer_;

      /// space indentation
      size_t indentation_;

      /// special identifier map, generally used by dmpl specific functions
      std::map <Var, int> id_map_;

      /// keep track of if we are in an ongoing assignment operation
      AsgnStmt * assignment_;
    };
    
    /*******************************************************************/
    //-- Visitor that gathers various kinds of information (e.g., set
    //-- of global and group variables accessed) about statements and
    //-- expressions.
    /*******************************************************************/
    struct GAMSInfoCollector : public Visitor
    {
    public:
      /**
       * Constructor
       **/
      GAMSInfoCollector () {}
      
      /**
       * Visits a variable
       * @param  expr   the variable to visit
       **/
      virtual void exitLval(LvalExpr &expr);

      //-- id variable. useful when we are looking for expressions of
      //-- the form X@id
      std::string idVar;

      //-- set of encountered lvals of the form X[..]@idVar. here we
      //-- only collect the X's, i.e., the base variables, ignoring
      //-- potential indices
      std::set<std::string> idVarVars;
    };
  } // namespace madara
} //namespace dmpl

#endif //__GAMS_VISITORS_HPP__
