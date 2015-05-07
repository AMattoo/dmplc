/**
 * Copyright (c) 2014 Carnegie Mellon University. All Rights Reserved.

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

 * DM-0001023
**/

#ifndef _DMPL_ATTRIBUTE_H_
#define _DMPL_ATTRIBUTE_H_

/**
 * @file Function.h
 * @author James Edmondson <jedmondson@gmail.com>
 *
 * This file contains a class definition for function definitions.
 **/

#include <vector>
#include <exception>
#include <map>
#include <string>
#include "Expression.h"

namespace dmpl
{
  class Attribute
  {
  public:
    std::string name;

    ExprList paramList;

    Attribute() {}
    Attribute(const std::string &n) : name(n) {}
    Attribute(const std::string &n, const ExprList &p) : name(n),  paramList(p) {}

    Expr requireSingleParam()
    {
      if(paramList.size() != 1)
        throw std::runtime_error("Expected 1 parameter for attribute @" + name +".");
      return paramList.front();
    }
  };

  typedef std::map <std::string, Attribute> Attributes;

  class HasAttributes
  {
  public:
    Attributes attrs;

    virtual std::string getName() const = 0;

    HasAttributes() {}
    HasAttributes(const Attributes &a) : attrs(a) { }

    Attribute *getAttribute(std::string name) {
      if (attrs.count(name) == 0)
        return NULL;
      else
        return &attrs[name];
    }

    Attribute *getAttribute(std::string name, int expectedArgs) {
      if (attrs.count(name) == 0)
        return NULL;
      else if (attrs[name].paramList.size() != expectedArgs)
        return NULL;
      else
        return &attrs[name];
    }

    Attribute &requireAttribute(std::string name) {
      Attribute *ret = getAttribute(name);
      if (ret == NULL)
        throw std::runtime_error("Required attribute @" + name + " not found for " + getName());
      return *ret;
    }

    Attribute &requireAttribute(std::string name, int expectedArgs) {
      if (attrs.count(name) == 0)
        throw std::runtime_error("Required attribute @" + name + " not found for " + getName());
      else if (attrs[name].paramList.size() != expectedArgs)
        throw std::runtime_error("Required attribute @" + name + " for " + getName() +
                " must have " + boost::lexical_cast<std::string>(expectedArgs) + " arguments; has " +
                boost::lexical_cast<std::string>(attrs[name].paramList.size()));
      else
        return attrs[name];
    }

  };
}

#endif // _DMPL_ATTRIBUTE_H_