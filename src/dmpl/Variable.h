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

#ifndef _DMPL_VARIABLE_
#define _DMPL_VARIABLE_

/**
 * @file Variable.h
 * @author James Edmondson <jedmondson@gmail.com>
 *
 * This file contains a class definition for the DMPL model of computation.
 **/

#include <map>
#include <string>
#include "Type.h"
#include "Symbol.h"


namespace dmpl
{
  /**
    * @class Variable
    * @brief A variable
    */
  class Variable : public Symbol
  {
  public:

    /**
     * The variable name
     **/
    std::string name;

    virtual std::string getName() const { return name; }
    
    /**
     * The variable type
     **/
    Type type;

    virtual const Type &getType() { return type; }
    
    /**
     * The variable scope
     **/
    int scope;

    virtual int getScope() { return scope; }

    Func owner;

    FuncList readers;
    FuncList writers;

    //constructors
    Variable() {}
    Variable(const std::string &n);
    Variable(const std::string &n,const Type &t);
    Variable(const std::string &n,const Dims &d);

    //convert to string
    std::string toString() const;

    /**
     * Prints variable information
     * @param  indent  spaces to indent printout
     **/
    void print (std::ostream &os,unsigned int indent);

    ///return a copy but instantiate dimension #N with nodeNum
    Var instDim(size_t nodeNum) const;

    ///return a copy but change name to name+ext
    Var instName(std::string ext) const;

    ///return a copy with one less dimension
    Var decrDim() const;
  };

  inline Var Sym::asVar()
  {
    return boost::dynamic_pointer_cast<Var::element_type>(*this);
  }
}



#endif // _DMPL_VARIABLE_