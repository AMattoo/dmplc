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

#include <iostream>
#include <stdio.h>
#include <boost/foreach.hpp>
#include "Symbol.h"
#include "Node.h"
#include "Statement.h"

namespace dmpl
{
  void Symbol::use(const SymUser &suser = SymUser(), bool isWrite = false, bool isRemote = false, bool isExpect = false)
  {
    //std::cerr << "Using symbol " << (*this)->getName() << " " << isWrite << " " << isRemote << " " << isExpect << std::endl;
    SymbolAccess sa(isWrite, isRemote, isExpect);
    //std::cerr << "sa: " << sa << std::endl;
    this->usage_summary.set(sa);
    if(suser != NULL)
    {
      SymbolUse &su = suser->findOrAddSymbol(shared_from_this());
      su.info.set(sa);
      //std::cerr << "su: " << su.info << std::endl;

      suser->summary |= su;

      if(suser->recordUse())
        this->users.insert(suser);
    }
  }

  void SymbolUser::inherit(const SymUser &o)
  {
    summary |= o->summary;
    BOOST_FOREACH(const SymbolUse &c, o->allUsedSymbols)
    {
      SymbolUse &t = findOrAddSymbol(c.sym);
      t.info |= c.info;

      if(recordUse())
        c.sym->users.insert(shared_from_this());
    }
  }

  void SymbolUser::analyzeSymbolUsage(Node &n)
  {
    BOOST_FOREACH(const Funcs::value_type &f, n.funcs)
    {
      if(f.second->isThread())
      {
        Context con;
        con.node = &n;
        con.thread = f.second;
        con.curFunc = f.second;
        Sym fsym = Sym(f.second);
        fsym->use();
        f.second->useSymbols(con);
      }
    }
    BOOST_FOREACH(const Stmt &s, n.stmts)
    {
      Context con;
      con.node = &n;
      con.clause = std::dynamic_pointer_cast<CStmt::element_type>(s);
      //std::cerr << s->toString() << std::endl;
      s->useSymbols(con);
    }
  }

  SymbolUser::Context SymbolUser::useSymbols(Context con) {
    BOOST_FOREACH(const SymUser &su, getParents(con))
    {
      su->useSymbols(con);
      inherit(su);
    }
    return con;
  }

  Sym SymbolUser::Context::findSym(const std::string &name)
  {
    BOOST_FOREACH(const SymbolBinder *b, binders)
    {
      Sym v = b->findSym(name);
      if(v)
        return v;
    }
    if(curFunc)
    {
      Var v = curFunc->findVar(name);
      if(v)
        return std::static_pointer_cast<Sym::element_type>(v);
    }
    if(node)
      return node->findSym(name);
    return Sym();
  }

  bool SymbolUser::Context::inExpect()
  {
    return clause != NULL && clause->kind == "expect";
  }
}
