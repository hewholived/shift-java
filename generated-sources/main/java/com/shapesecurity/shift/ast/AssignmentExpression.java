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
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public class AssignmentExpression extends Expression implements Node {

    @NotNull
    public final Binding binding;

    @NotNull
    public final Expression expression;

    public AssignmentExpression(@NotNull Binding binding, @NotNull Expression expression) {
        super();
        this.binding = binding;
        this.expression = expression;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof AssignmentExpression && this.binding.equals(((AssignmentExpression) object).binding) &&
               this.expression.equals(((AssignmentExpression) object).expression);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "AssignmentExpression");
        code = HashCodeBuilder.put(code, this.binding);
        code = HashCodeBuilder.put(code, this.expression);
        return code;
    }

    @NotNull
    public Binding getBinding() {
        return this.binding;
    }

    @NotNull
    public AssignmentExpression setBinding(@NotNull Binding binding) {
        return new AssignmentExpression(binding, this.expression);
    }

    @NotNull
    public Expression getExpression() {
        return this.expression;
    }

    @NotNull
    public AssignmentExpression setExpression(@NotNull Expression expression) {
        return new AssignmentExpression(this.binding, expression);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.ASSIGNMENT;
    }

}