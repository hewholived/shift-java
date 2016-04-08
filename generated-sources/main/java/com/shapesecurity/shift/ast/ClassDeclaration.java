// Generated by src/generate-spec-java.js 

/*
 * Copyright 2015 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.ast;

import org.jetbrains.annotations.NotNull;
import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.functional.data.Maybe;
import com.shapesecurity.functional.data.ImmutableList;

public class ClassDeclaration extends Statement implements Node, FunctionDeclarationClassDeclarationVariableDeclaration, FunctionDeclarationClassDeclarationExpression, Class {

  @NotNull
  public final BindingIdentifier name;

  @NotNull
  public final Maybe<Expression> _super;

  @NotNull
  public final ImmutableList<ClassElement> elements;

  public ClassDeclaration (@NotNull BindingIdentifier name, @NotNull Maybe<Expression> _super, @NotNull ImmutableList<ClassElement> elements)
  {
    super();
    this.name = name;
    this._super = _super;
    this.elements = elements;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof ClassDeclaration && this.name.equals(((ClassDeclaration) object).name) && this._super.equals(((ClassDeclaration) object)._super) && this.elements.equals(((ClassDeclaration) object).elements);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "ClassDeclaration");
    code = HashCodeBuilder.put(code, this.name);
    code = HashCodeBuilder.put(code, this._super);
    code = HashCodeBuilder.put(code, this.elements);
    return code;
  }

  @NotNull
  public BindingIdentifier getName()
  {
    return this.name;
  }

  @NotNull
  public Maybe<Expression> getSuper()
  {
    return this._super;
  }

  @NotNull
  public ImmutableList<ClassElement> getElements()
  {
    return this.elements;
  }

  @NotNull
  public ClassDeclaration setName(@NotNull BindingIdentifier name)
  {
    return new ClassDeclaration(name, this._super, this.elements);
  }

  @NotNull
  public ClassDeclaration setSuper(@NotNull Maybe<Expression> _super)
  {
    return new ClassDeclaration(this.name, _super, this.elements);
  }

  @NotNull
  public ClassDeclaration setElements(@NotNull ImmutableList<ClassElement> elements)
  {
    return new ClassDeclaration(this.name, this._super, elements);
  }

}