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
import com.shapesecurity.shift.ast.operators.Precedence;

public class LiteralBooleanExpression extends Expression implements Node {

  @NotNull
  public final Boolean value;

  public LiteralBooleanExpression (@NotNull Boolean value)
  {
    super();
    this.value = value;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof LiteralBooleanExpression && this.value.equals(((LiteralBooleanExpression) object).value);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "LiteralBooleanExpression");
    code = HashCodeBuilder.put(code, this.value);
    return code;
  }

  @NotNull
  public Boolean getValue()
  {
    return this.value;
  }

  @NotNull
  public LiteralBooleanExpression setValue(@NotNull Boolean value)
  {
    return new LiteralBooleanExpression(value);
  }

  @Override
  @NotNull
  public Precedence getPrecedence()
  {
    return Precedence.PRIMARY;
  }

}