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

#include "Role.h"
#include "Program.h"
#include <iostream>

void
dmpl::RoleClass::mergeWith(const Role &other)
{
  RoleClass &oth = *other;

  if (abstract && !oth.abstract)
    abstract = false;

  if (name == "")
    name = oth.name;
  else if (name != oth.name)
    throw std::runtime_error("Cannot merge roles of differing names: " + name + " and " + oth.name);

  BOOST_FOREACH(const Vars::value_type &v, oth.globVars)
  {
    if(globVars.count(v.second->name) == 0)
      globVars[v.second->name] = v.second;
    else if(globVars[v.second->name]->type != v.second->type)
      throw std::runtime_error("Collision while merging role globals: " + v.second->name + " in " + name);
  }

  BOOST_FOREACH(const Vars::value_type &v, oth.locVars)
  {
    if(locVars.count(v.second->name) == 0)
      locVars[v.second->name] = v.second;
    else if(locVars[v.second->name]->type != v.second->type)
      throw std::runtime_error("Collision while merging role locals: " + v.second->name + " in " + name);
  }

  BOOST_FOREACH(const Funcs::value_type &f, oth.funcs)
  {
    if(funcs.count(f.second->name) == 0)
      funcs[f.second->name] = f.second;
    else
      funcs[f.second->name]->mergeWith(f.second);
  }

  BOOST_FOREACH(const Attributes::value_type &a, oth.attrs)
  {
    if(attrs.count(a.second.name) == 0)
      attrs[a.second.name] = a.second;
    else if (attrs[a.second.name].paramList != a.second.paramList)
      throw std::runtime_error("Cannot merge role with attributes of differing parameters: @" + a.second.name + " in " + name);
  }
}

void
dmpl::RoleClass::print (std::ostream &os,unsigned int indent)
{
  std::string spacer (indent, ' ');

  os << spacer << "ROLE " << name;
  os << "\n" << spacer << "{\n";  

  for (dmpl::Vars::iterator i = globVars.begin ();i != globVars.end (); ++i)
    os << spacer << "  GLOBAL " << i->second->toString() << ";\n";
  os << "\n";

  for (dmpl::Vars::iterator i = locVars.begin ();i != locVars.end (); ++i)
    os << spacer << "  LOCAL " << i->second->toString() << ";\n";
  os << "\n";

  for (dmpl::Funcs::iterator i = funcs.begin ();i != funcs.end (); ++i)
    i->second->print (os,indent+2);
  os << "\n";

  os << spacer << "}\n\n";

}

dmpl::Func
dmpl::RoleClass::findFunc(const std::string& name) const
{
  Funcs::const_iterator ret = funcs.find(name);
  if(ret != funcs.end())
    return ret->second;
  return node->findFunc(name);
}