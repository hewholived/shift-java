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

import com.shapesecurity.functional.data.HashCodeBuilder;

import org.jetbrains.annotations.NotNull;

public class Getter extends MethodDefinition implements Node {

    @NotNull
    public final FunctionBody body;

    @NotNull
    public final PropertyName name;

    public Getter(@NotNull FunctionBody body, @NotNull PropertyName name) {
        super(body, name);
        this.body = body;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Getter && this.body.equals(((Getter) object).body) && this.name.equals(
            ((Getter) object).name);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "Getter");
        code = HashCodeBuilder.put(code, this.body);
        code = HashCodeBuilder.put(code, this.name);
        return code;
    }

    @NotNull
    public FunctionBody getBody() {
        return this.body;
    }

    @NotNull
    public Getter setBody(@NotNull FunctionBody body) {
        return new Getter(body, this.name);
    }

    @NotNull
    public PropertyName getName() {
        return this.name;
    }

    @NotNull
    public Getter setName(@NotNull PropertyName name) {
        return new Getter(this.body, name);
    }

}