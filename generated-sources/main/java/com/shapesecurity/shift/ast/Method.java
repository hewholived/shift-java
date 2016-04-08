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

public class Method extends MethodDefinition implements Node {

  @NotNull
  public final Boolean isGenerator;

  @NotNull
  public final FormalParameters params;

  @NotNull
  public final FunctionBody body;

  @NotNull
  public final PropertyName name;

  public Method (@NotNull Boolean isGenerator, @NotNull FormalParameters params, @NotNull FunctionBody body, @NotNull PropertyName name)
  {
    super(body, name);
    this.isGenerator = isGenerator;
    this.params = params;
    this.body = body;
    this.name = name;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof Method && this.isGenerator.equals(((Method) object).isGenerator) && this.params.equals(((Method) object).params) && this.body.equals(((Method) object).body) && this.name.equals(((Method) object).name);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "Method");
    code = HashCodeBuilder.put(code, this.isGenerator);
    code = HashCodeBuilder.put(code, this.params);
    code = HashCodeBuilder.put(code, this.body);
    code = HashCodeBuilder.put(code, this.name);
    return code;
  }

  @NotNull
  public Boolean getIsGenerator()
  {
    return this.isGenerator;
  }

  @NotNull
  public FormalParameters getParams()
  {
    return this.params;
  }

  @NotNull
  public FunctionBody getBody()
  {
    return this.body;
  }

  @NotNull
  public PropertyName getName()
  {
    return this.name;
  }

  @NotNull
  public Method setIsGenerator(@NotNull Boolean isGenerator)
  {
    return new Method(isGenerator, this.params, this.body, this.name);
  }

  @NotNull
  public Method setParams(@NotNull FormalParameters params)
  {
    return new Method(this.isGenerator, params, this.body, this.name);
  }

  @NotNull
  public Method setBody(@NotNull FunctionBody body)
  {
    return new Method(this.isGenerator, this.params, body, this.name);
  }

  @NotNull
  public Method setName(@NotNull PropertyName name)
  {
    return new Method(this.isGenerator, this.params, this.body, name);
  }

}