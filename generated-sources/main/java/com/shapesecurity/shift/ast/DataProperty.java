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

public class DataProperty extends NamedObjectProperty implements Node {

  @NotNull
  public final Expression expression;

  @NotNull
  public final PropertyName name;

  public DataProperty (@NotNull Expression expression, @NotNull PropertyName name)
  {
    super(name);
    this.expression = expression;
    this.name = name;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof DataProperty && this.expression.equals(((DataProperty) object).expression) && this.name.equals(((DataProperty) object).name);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "DataProperty");
    code = HashCodeBuilder.put(code, this.expression);
    code = HashCodeBuilder.put(code, this.name);
    return code;
  }

  @NotNull
  public Expression getExpression()
  {
    return this.expression;
  }

  @NotNull
  public PropertyName getName()
  {
    return this.name;
  }

  @NotNull
  public DataProperty setExpression(@NotNull Expression expression)
  {
    return new DataProperty(expression, this.name);
  }

  @NotNull
  public DataProperty setName(@NotNull PropertyName name)
  {
    return new DataProperty(this.expression, name);
  }

}