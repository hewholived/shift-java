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

public class ContinueStatement extends Statement implements Node {

  @NotNull
  public final Maybe<String> label;

  public ContinueStatement (@NotNull Maybe<String> label)
  {
    super();
    this.label = label;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof ContinueStatement && this.label.equals(((ContinueStatement) object).label);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "ContinueStatement");
    code = HashCodeBuilder.put(code, this.label);
    return code;
  }

  @NotNull
  public Maybe<String> getLabel()
  {
    return this.label;
  }

  @NotNull
  public ContinueStatement setLabel(@NotNull Maybe<String> label)
  {
    return new ContinueStatement(label);
  }

}