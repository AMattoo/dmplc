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


#include <string.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include <string>
#include <boost/algorithm/string.hpp>
#include "DmplBuilder.hpp"
#include "dmpl/gams/GAMSBuilder.hpp"
#include "dmpl/gams/AnalyzerBuilder.hpp"
#include "SyncSeqDbl.hpp"
#include "SyncSeqDblInd.hpp"
#include "SyncSeqDblParam.hpp"
#include "SyncSeqDblIndParam.hpp"

/*********************************************************************/
//options
/*********************************************************************/

//-- wrap in anonymous namespace to avoid name clashes
namespace
{
  //-- dmplc version
  const std::string version("0.2");
  
  //-- names of files to parse
  std::list<std::string> file_names;
  
  //-- output file name. empty means stdout.
  std::string out_file;
  
  //-- name of target thunk to dump from the DMPL file.
  std::string madara_target ("GNU_CPP");

  //-- deadline for madara to filter out old packets
  int madara_deadline (1);

  //-- parse and print the DMPL file
  bool do_print = false;

  //-- whether to target SVCOMP format when sequentialization
  bool seq_svcomp = false;
  
  //-- sequentialize for verification via bounded model checking
  bool do_seq = false;
  
  //-- sequentialize for checking inductive invariants for bounded model
  //-- checking
  bool do_seq_ind = false;

  //-- sequentialize for parameterized verification via bounded and
  //-- unbounded model checking
  bool do_seq_param = false;

  //-- sequentialize for checking inductive invariants for
  //-- parameterized verification via bounded and unbounded model
  //-- checking
  bool do_seq_ind_param = false;
  
  //-- number of rounds to sequentialize for (-1 means infinity)
  int round_num = -1;
  
  //-- the list of descriptors for roles to verify against. a role
  //-- desciptor is X:Y:n where X is the name of the node, Y is the name
  //-- of a role inside it, and n is the number of such roles. node id's
  //-- will be assigned in the order in which the roles are specified.
  std::list<std::string> roleDescs;

  //-- list of descriptors that map nodes to groups, in increasing id order
  std::list<std::string> groupDescs;

  //-- list of descriptors that map group-variables to groups
  std::list<std::string> varGroups;
  
  //-- generate code against the GAMS platform
  bool do_gams = false;
  
  //-- generate code to check and log "expect" statements
  bool do_expect = false;
  
  //-- generate "expect" log analyzer
  bool do_analyzer = false;
  
  //-- print debug messages
  bool debug = false;
  
  //-- name of the require property to verify
  std::string reqProp; 
  
  //-- the type of thread scheduler to use
  dmpl::SchedType schedType = dmpl::NON_RT;
  
  //-- constant definitions supplied via command line
  std::map<std::string, std::string> const_def;
}

/*********************************************************************/
//function declarations
/*********************************************************************/
void parse_options (int argc, char **argv);
void usage (char *cmd);
void addProcesses(dmpl::Program &program);
void createNodeGroupMap(dmpl::Program &program);
void createVarGroupMap(dmpl::Program &program);

/*********************************************************************/
//the main function
/*********************************************************************/
int main (int argc, char **argv)
{
  //-- print version and command line options
  std::cout << "DMPLC Version " << version << '\n';
  std::list<std::string> cmdLine;
  for(int i = 0;i < argc;++i) cmdLine.push_back(argv[i]);
  std::cout << "Command line:";
  for(const std::string &c : cmdLine) std::cout << ' ' << c;
  std::cout << '\n';

  //-- parse arguments
  parse_options (argc, argv);

  //create the program and fill in the processes
  dmpl::DmplBuilder builder (version, cmdLine, file_names, const_def, debug);
  builder.run ();

  //print the program
  if (do_print)
  {
    if (out_file.empty ())
    {
      builder.printProgram (std::cout);
    }
    else
    {
      std::ofstream os (out_file.c_str ());
      builder.printProgram (os);
      os.close ();
    }
    return 0;
  }

  //-- add processes based on roles
  addProcesses(builder.program);

  //-- create maps from nodes and variables to groups
  createNodeGroupMap(builder.program);
  createVarGroupMap(builder.program);

  //-- initialize nodesInGroup map
  builder.program.initNodesInGroup();
  
  //right now, we're just using a realize flag to indicate madara
  //generation
  if (do_gams)
  {
    //create a madara builder instance of the dmpl builder parse
    dmpl::CodeGenerator *gams_builder
      = new dmpl::gams::GAMSBuilder (builder, madara_target, madara_deadline, schedType, do_expect);

    //build the generated code
    gams_builder->build ();

    //print the generated code
    if (out_file.empty ())
      gams_builder->print (std::cout);
    else
    {
      std::ofstream os (out_file.c_str ());
      gams_builder->print (os);
      os.close ();
    }

    //cleanup
    delete gams_builder;
  }
  else if(do_analyzer)
  {
    //create a madara builder instance of the dmpl builder parse
    dmpl::gams::AnalyzerBuilder *ana_builder = new dmpl::gams::AnalyzerBuilder (builder, madara_target);

    //build the generated code
    ana_builder->build ();

    //print the generated code
    if (out_file.empty ())
      ana_builder->print (std::cout);
    else {
      std::ofstream os (out_file.c_str ());
      ana_builder->print (os);
      os.close ();
    }

    //cleanup
    delete ana_builder;
  }

  //-- if doing sequentialization
  if(do_seq || do_seq_ind || do_seq_param || do_seq_ind_param) {
    //the C program produced by sequentialization
    dmpl::CProgram cprog;
  
    //sequentialize
    if (do_seq) {    
      dmpl::SyncSeqDbl syncSeqDbl (builder, reqProp, round_num, seq_svcomp);
      syncSeqDbl.run ();
      cprog = syncSeqDbl.cprog;
    }

    //sequentialize for inductive check
    if (do_seq_ind) {
      dmpl::SyncSeqDblInd syncSeqDblInd (builder, reqProp, round_num, seq_svcomp);
      syncSeqDblInd.run ();
      cprog = syncSeqDblInd.cprog;
    }

    //sequentialize for paramaterized verification
    if (do_seq_param) {
      dmpl::SyncSeqDblParam syncSeqDblParam (builder, reqProp, round_num, seq_svcomp);
      syncSeqDblParam.run ();
      cprog = syncSeqDblParam.cprog;
    }

    //sequentialize for paramaterized inductive verification
    if (do_seq_ind_param) {
      dmpl::SyncSeqDblIndParam syncSeqDblIndParam (builder, reqProp, round_num, seq_svcomp);
      syncSeqDblIndParam.run ();
      cprog = syncSeqDblIndParam.cprog;
    }

    //print result
    if (out_file.empty ())
      cprog.print (std::cout, 0);
    else {
      std::ofstream os (out_file.c_str ());
      cprog.print (os, 0);
      os.close ();
    }
  }

  //all done
  return 0;
}

/*********************************************************************/
//parse command line options and populate global variables
/*********************************************************************/
void parse_options (int argc, char **argv)
{
  for (int i = 1; i < argc; ++i)
  {
    std::string arg1 (argv[i]);

    if (arg1 == "-d" || arg1 == "--debug")
    {
      debug = true;
    }
    else if (arg1 == "-h" || arg1 == "--help")
    {
      usage (argv[0]);
    }
    else if (arg1 == "-o" || arg1 == "--out")
    {
      if (i + 1 < argc)
      {
        out_file = argv[i + 1];
      }
      else
      {
        std::cerr << "ERROR: output file (-o|--out) must have file name\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-p" || arg1 == "--print")
    {
      do_print = true;
    }
    else if (arg1 == "--roles")
    {
      if (i + 1 < argc)
      {
        roleDescs.push_back(argv[i + 1]);
      }
      else
      {
        std::cerr << "ERROR: role desciptors (--roles) must have value (e.g. --roles uav:Uav:3)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "--groups")
    {
      if (i + 1 < argc)
      {
        groupDescs.push_back(argv[i + 1]);
      }
      else
      {
        std::cerr << "ERROR: node->group assignment (--groups) must have value (e.g. --groups Team1+Coord=3)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "--var-groups")
    {
      if (i + 1 < argc)
      {
        varGroups.push_back(argv[i + 1]);
      }
      else
      {
        std::cerr << "ERROR: variable->group assignment (--var-groups) must have value (e.g. --var-groups x+y=Team1+Coord)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-rp" || arg1 == "--reqProp")
    {
      if (i + 1 < argc) reqProp = argv[i+1]; 
      else
      {
        std::cerr << "ERROR: require property (-rp|--reqProp) must have value (e.g. -rp NoCollision)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-a" || arg1 == "--analyzer")
    {
      do_analyzer = true;
    }
    else if (arg1 == "-g" || arg1 == "--gams")
    {
      do_gams = true;
    }
    else if (arg1 == "-e" || arg1 == "--expect")
    {
      do_expect = true;
    }
    else if (arg1 == "-cg" || arg1 == "--cube-grid")
    {
      if (i + 1 < argc)
      {
        const_def["X"] = argv[i + 1];
        const_def["Y"] = argv[i + 1];
        const_def["Z"] = argv[i + 1];
      }
      else
      {
        std::cerr << "ERROR: Cube Grid Size (-cg|--cube-grid) must have a value!!\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-X" || arg1 == "--grid-x")
    {
      if (i + 1 < argc) const_def["X"] = argv[i + 1];
      else {
        std::cerr << "ERROR: Cube Grid X Size (-X|--grid-x) must have a value!!\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-Y" || arg1 == "--grid-y")
    {
      if (i + 1 < argc) const_def["Y"] = argv[i + 1];
      else {
        std::cerr << "ERROR: Cube Grid Y Size (-Y|--grid-y) must have a value!!\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-Z" || arg1 == "--grid-z")
    {
      if (i + 1 < argc) const_def["Z"] = argv[i + 1];
      else {
        std::cerr << "ERROR: Cube Grid Z Size (-Z|--grid-z) must have a value!!\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "--map")
    {
      if (i + 1 < argc)
      {
        if(std::string(argv[i+1]) == "tiny") {
          const_def["TopY"] = "0.5";
          const_def["LeftX"] = "-0.5";
          const_def["BottomY"] = "-0.5";
          const_def["RightX"] = "0.5";
          const_def["TopZ"] = "1.5";
          const_def["BottomZ"] = "0.0";
        } else if(std::string(argv[i+1]) == "small") {
          const_def["TopY"] = "2.25";
          const_def["LeftX"] = "-2.25";
          const_def["BottomY"] = "-2.25";
          const_def["RightX"] = "2.25";
          const_def["TopZ"] = "2.5";
          const_def["BottomZ"] = "0.0";
        } else if(std::string(argv[i+1]) == "large") {
          const_def["TopY"] = "13";
          const_def["LeftX"] = "-12.5";
          const_def["BottomY"] = "-6";
          const_def["RightX"] = "6.5";
          const_def["TopZ"] = "2.5";
          const_def["BottomZ"] = "0.0";
        } else {
          std::cerr << "ERROR: Map Size (--map) must be small or large!!\n";
          usage (argv[0]);
        }
      }
      else
      {
        std::cerr << "ERROR: Map Size (--map) must have a value!!\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-pf" || arg1 == "--platform")
    {
      if (i + 1 < argc)
      {
        madara_target = argv[i + 1];
      }
      else
      {
        std::cerr << "ERROR: Target platform (-pf|--platform) must have a target (e.g. -t WIN_CPP)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1 == "-dl" || arg1 == "--deadline")
    {
      if (i + 1 < argc)
      {
        madara_deadline = atoi(argv[i + 1]);
      }
      else
      {
        std::cerr << "ERROR: Deadline (-dl|--deadline) must have a value (e.g. -dl 2)\n";
        usage (argv[0]);
      }
      ++i;
    }
#if MZSRM==1
    else if (arg1 == "-mz" || arg1 == "--mzsrm")
    {
      schedType = dmpl::MZSRM;
    }
#endif
    else if (arg1 == "-svc" || arg1 == "--svcomp")
      seq_svcomp = true;
    else if (arg1 == "-s" || arg1 == "--seq")
    {
      do_seq = true;
    }
    else if (arg1 == "-si" || arg1 == "--seq-ind")
    {
      do_seq_ind = true;
    }
    else if (arg1 == "-sp" || arg1 == "--seq-param")
    {
      do_seq_param = true;
    }
    else if (arg1 == "-sip" || arg1 == "--seq-ind-param")
    {
      do_seq_ind_param = true;
    }
    else if (arg1 == "-r" || arg1 == "--rounds")
    {
      if (i + 1 < argc)
      {
        std::stringstream buffer (argv[i + 1]);
        buffer >> round_num;
      }
      else
      {
        std::cerr << "ERROR: Number of rounds (-r|--rounds) must have a ";
        std::cerr << " number of rounds (e.g. -r 5)\n";
        usage (argv[0]);
      }
      ++i;
    }
    else if (arg1.substr (0,3) == "--D")
    {
      //extract constant and value from constant=value
      std::string var_name = arg1.substr (3);
      
      if (i + 1 < argc && var_name.size () > 0)
      {
        std::string value;
        std::stringstream buffer (argv[i + 1]);
        buffer >> value;
        const_def[var_name] = value;
      }
      else
      {
        std::cerr << "ERROR: Constant value (via --D) must have a ";
        std::cerr << " name and a value (e.g. --Dmy_const 5)\n";
        usage (argv[0]);
      }
      ++i;

    }
    else if (arg1.c_str()[0] == '-') {
      std::cerr << "ERROR: illegal argument " << arg1 << '\n';
      usage(argv[0]);
    }
    else if (arg1.size() < 6 || strcmp(arg1.c_str() + (arg1.size() - 5), ".dmpl")) {
      std::cerr << "ERROR: illegal DMPL file name " << arg1 << " must be of the form X.dmpl!!\n";
      usage(argv[0]);
    }
    else
    {
      file_names.push_back(std::string (argv[i]));
    }
  }

  //-- sanity checks
  if (file_names.empty ()) {
    std::cerr << "ERROR: no DMPL file names specified!!\n";
    usage (argv[0]);
  }

  //-- X, Y and Z must be defined
  if(do_gams || do_seq || do_seq_ind || do_seq_param || do_seq_ind_param) {
    for(const std::string &d : { "X", "Y", "Z" }) {
      if(const_def.find(d) == const_def.end()) {
        std::cerr << "ERROR: no " << d << " dimension specified!!\n";
        usage (argv[0]);
      }
    }
  }

  //-- if generating code X, Y and Z must be defined
  if(do_gams) {
    for(const std::string &d : { "TopY", "BottomY", "LeftX", "RightX", "TopZ", "BottomZ" }) {
      if(const_def.find(d) == const_def.end()) {
        std::cerr << "ERROR: map coordinate " << d << " unspecified!!\n";
        usage (argv[0]);
      }
    }
  }
}

/*********************************************************************/
//print usage and exit
/*********************************************************************/
void usage (char *cmd)
{
  std::cerr << "Usage : " << cmd << " <options optionval> filename [filename ...]\n";
  std::cerr << "Options :\n";
  std::cerr << "  -d|--debug                 print debugging information\n";
  std::cerr << "  -h|--help                  print help and usage\n";
  std::cerr << "  -o|--out file              output file, default is stdout\n";
  std::cerr << "  -p|--print                 parse and print DASL file\n";
  std::cerr << "  --roles X:Y:n[:X:Y:n]*     list of roles descriptors specified as X:Y:n, where\n";
  std::cerr << "                             X=node name, Y=role name\n";
  std::cerr << "                             n=number of nodes with role Y\n";
  std::cerr << "                             NOTE: nodes are listed in order of increasing id\n";
  std::cerr << "  --groups X=n[:X=n]*        list of group assignments X=n, where\n";
  std::cerr << "                             X=plus separated non-empty group list\n";
  std::cerr << "                             n=number of nodes assigned to groups in X\n";
  std::cerr << "                             NOTE: nodes are listed in order of increasing id\n";
  std::cerr << "  --var-groups X=Y[:X=Y]*    list of variable-group assignments X=Y, where\n";
  std::cerr << "                             X=plus separated non-empty group-variable list\n";
  std::cerr << "                             Y=plus separated non-empty group list\n";
  std::cerr << "                             NOTE: this means all vars in X are assigned to groups in Y\n";
  std::cerr << "  -rp|--reqProp name         name of require property to verify\n";
  std::cerr << "  -a|--analyzer              generate C++ for expect log analyzer\n";
  std::cerr << "  -g|--gams                  generate C++/GAMS code to run\n";
  std::cerr << "  -e|--expect                check and log 'expect' statements\n";
  std::cerr << "  -cg|--cube-grid s          specify number of cells on each side of a cubic grid\n";
  std::cerr << "  -X|--grid-x s              specify number of cells on X dimension of grid\n";
  std::cerr << "  -Y|--grid-y s              specify number of cells on Y dimension of grid\n";
  std::cerr << "  -Z|--grid-z s              specify number of cells on Z dimension of grid\n";
  std::cerr << "  --map s                    specify map size (small|large)\n";
  std::cerr << "  -pf|--platform p           specify a target platform\n";
  std::cerr << "  -dl|--deadline d           specify a deadline for MADARA to drop old packets\n";
  std::cerr << "                             deadline of -1 (i.e., -dl -1) means no deadline\n";
  std::cerr << "                             Available platforms: WIN_CPP, GNU_CPP (default)\n";
#if MZSRM==1
  std::cerr << "  -mz|--mzsrm                generate code that targets MZSRM scheduler\n";
#endif
  std::cerr << "  -svc|--svcomp              sequentialized code should target SVCOMP format\n";
  std::cerr << "  -s|--seq                   generate sequentialized code to verify\n";
  std::cerr << "  -si|--seq-ind              generate sequentialized code to verify inductiveness\n";
  std::cerr << "  -sp|--seq-param            generate sequentialized code for paramaterized verification\n";
  std::cerr << "  -sip|--seq-ind-param       generate sequentialized code for paramaterized inductive verification\n";
  std::cerr << "  -r|--rounds rounds         number of verification rounds\n";
  std::cerr << "  --D<const_name> value      set a const to a value\n";
  exit (1);
}

/*********************************************************************/
//-- add processes to the program based on role descriptors supplied
//-- via the command line. a role descriptor is of the form
//-- X:Y:n[:X:Y:n...] where X is a node name, Y is a role name, and n
//-- is the number of roles
/*********************************************************************/
void addProcesses(dmpl::Program &program)
{
  program.processes.clear ();
  dmpl::NodeId nodeId = 0;

  for(const std::string &rd : roleDescs) {
    std::vector<std::string> comps;
    boost::split(comps, rd, [](char c) { return c==':';});

    if(comps.size() % 3)
        throw std::runtime_error("ERROR: illegal role descriptor " + rd + " : must be X:Y:n[:X:Y:n]*!!");
    
    for(size_t i = 0;i < comps.size();) {
      const std::string &nodeName = comps[i++];
      const std::string &roleName = comps[i++];

      int roleNum = atoi(comps[i++].c_str());
      if(roleNum <= 0)
        throw std::runtime_error("ERROR: illegal role descriptor " + rd + " : must be X:Y:n[:X:Y:n]*!!");

      for(int j = 0;j < roleNum;++j)
        program.addProcess(nodeName, roleName, nodeId++);
    }
  }

  if(program.processes.empty())
    throw std::runtime_error("ERROR: no roles specified!!");
}

/*********************************************************************/
//-- create mapping from nodes to groups by parsing descriptors
//-- supplied via command line
/*********************************************************************/
void createNodeGroupMap(dmpl::Program &program)
{
  size_t nodeId = 0;
  program.node2Groups.resize(program.processes.size());
  
  for(const std::string &gds : groupDescs) {
    std::vector<std::string> gdsComps;
    boost::split(gdsComps, gds, [](char c) { return c==':';});

    for(const std::string &gd : gdsComps) {
      std::vector<std::string> gdComps;
      boost::split(gdComps, gd, [](char c) { return c=='=';});
      if(gdComps.size() != 2)
        throw std::runtime_error("ERROR: illegal group descriptor " + gd + " : must be X=n!!");

      std::vector<std::string> groups;
      boost::split(groups, gdComps[0], [](char c) { return c=='+';});

      int roleNum = atoi(gdComps[1].c_str());
      if(roleNum <= 0)
        throw std::runtime_error("ERROR: illegal group descriptor " + gd + " : must be X=n!!");

      for(size_t i = 0;i < roleNum;++i,++nodeId) {
        if(nodeId >= program.node2Groups.size())
          throw std::runtime_error("ERROR: groups assigned to too many nodes, there are " +
                                   std::to_string(program.node2Groups.size()) + " nodes!!");

        for(const std::string &group : groups) {
          if(!group.empty()) {
            //std::cout << "node : " << nodeId << " ==> group " << group << '\n';
            program.node2Groups[nodeId].insert(group);
          }
        }
      }
    }
  }
}

/*********************************************************************/
//-- create mapping from variables to groups by parsing descriptors
//-- supplied via command line
/*********************************************************************/
void createVarGroupMap(dmpl::Program &program)
{
  size_t nodeId = 0;
  
  for(const std::string &vgs : varGroups) {
    std::vector<std::string> vgsComps;
    boost::split(vgsComps, vgs, [](char c) { return c==':';});

    for(const std::string &vg : vgsComps) {
      std::vector<std::string> vgComps;
      boost::split(vgComps, vg, [](char c) { return c=='=';});
      if(vgComps.size() != 2)
        throw std::runtime_error("ERROR: illegal var-group descriptor " + vg + " : must be X=Y!!");

      std::vector<std::string> vars;
      boost::split(vars, vgComps[0], [](char c) { return c=='+';});

      std::vector<std::string> groups;
      boost::split(groups, vgComps[1], [](char c) { return c=='+';});

      for(const std::string &var : vars) {
        if(var.empty()) continue;
        for(const std::string &group : groups) {
          if(group.empty()) continue;
          //std::cout << "variable : " << var << " ==> group " << group << '\n';
          program.var2Groups[var].insert(group);
        }
      }
    }
  }
}

/*********************************************************************/
//end of dmplc.cpp
/*********************************************************************/
