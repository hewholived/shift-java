// Generated by shift-java-gen/ast.JSON

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

public class ForInStatement extends IterationStatement {
    @NotNull
    public final VariableDeclarationAssignmentTarget left;

    @NotNull
    public final Expression right;


    public ForInStatement (@NotNull VariableDeclarationAssignmentTarget left, @NotNull Expression right, @NotNull Statement body) {
        super(body);
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof ForInStatement && this.left.equals(((ForInStatement) object).left) && this.right.equals(((ForInStatement) object).right) && this.body.equals(((ForInStatement) object).body);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ForInStatement");
        code = HashCodeBuilder.put(code, this.left);
        code = HashCodeBuilder.put(code, this.right);
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

}
