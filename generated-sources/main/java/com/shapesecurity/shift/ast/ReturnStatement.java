// Generated by shift-java-gen/ast.js

/*
 * Copyright 2016 Shape Security, Inc.
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

public class ReturnStatement implements Statement {
    @NotNull
    public final Maybe<Expression> expression;


    public ReturnStatement (@NotNull Maybe<Expression> expression) {
        this.expression = expression;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof ReturnStatement && this.expression.equals(((ReturnStatement) object).expression);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ReturnStatement");
        code = HashCodeBuilder.put(code, this.expression);
        return code;
    }

}
