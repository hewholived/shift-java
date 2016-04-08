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
import com.shapesecurity.functional.data.ImmutableList;

public class SwitchStatementWithDefault extends Statement implements Node {

  @NotNull
  public final Expression discriminant;

  @NotNull
  public final ImmutableList<SwitchCase> preDefaultCases;

  @NotNull
  public final SwitchDefault defaultCase;

  @NotNull
  public final ImmutableList<SwitchCase> postDefaultCases;

  public SwitchStatementWithDefault (@NotNull Expression discriminant, @NotNull ImmutableList<SwitchCase> preDefaultCases, @NotNull SwitchDefault defaultCase, @NotNull ImmutableList<SwitchCase> postDefaultCases)
  {
    super();
    this.discriminant = discriminant;
    this.preDefaultCases = preDefaultCases;
    this.defaultCase = defaultCase;
    this.postDefaultCases = postDefaultCases;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof SwitchStatementWithDefault && this.discriminant.equals(((SwitchStatementWithDefault) object).discriminant) && this.preDefaultCases.equals(((SwitchStatementWithDefault) object).preDefaultCases) && this.defaultCase.equals(((SwitchStatementWithDefault) object).defaultCase) && this.postDefaultCases.equals(((SwitchStatementWithDefault) object).postDefaultCases);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "SwitchStatementWithDefault");
    code = HashCodeBuilder.put(code, this.discriminant);
    code = HashCodeBuilder.put(code, this.preDefaultCases);
    code = HashCodeBuilder.put(code, this.defaultCase);
    code = HashCodeBuilder.put(code, this.postDefaultCases);
    return code;
  }

  @NotNull
  public Expression getDiscriminant()
  {
    return this.discriminant;
  }

  @NotNull
  public ImmutableList<SwitchCase> getPreDefaultCases()
  {
    return this.preDefaultCases;
  }

  @NotNull
  public SwitchDefault getDefaultCase()
  {
    return this.defaultCase;
  }

  @NotNull
  public ImmutableList<SwitchCase> getPostDefaultCases()
  {
    return this.postDefaultCases;
  }

  @NotNull
  public SwitchStatementWithDefault setDiscriminant(@NotNull Expression discriminant)
  {
    return new SwitchStatementWithDefault(discriminant, this.preDefaultCases, this.defaultCase, this.postDefaultCases);
  }

  @NotNull
  public SwitchStatementWithDefault setPreDefaultCases(@NotNull ImmutableList<SwitchCase> preDefaultCases)
  {
    return new SwitchStatementWithDefault(this.discriminant, preDefaultCases, this.defaultCase, this.postDefaultCases);
  }

  @NotNull
  public SwitchStatementWithDefault setDefaultCase(@NotNull SwitchDefault defaultCase)
  {
    return new SwitchStatementWithDefault(this.discriminant, this.preDefaultCases, defaultCase, this.postDefaultCases);
  }

  @NotNull
  public SwitchStatementWithDefault setPostDefaultCases(@NotNull ImmutableList<SwitchCase> postDefaultCases)
  {
    return new SwitchStatementWithDefault(this.discriminant, this.preDefaultCases, this.defaultCase, postDefaultCases);
  }

}