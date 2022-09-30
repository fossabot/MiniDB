/*
 * Copyright 1999-2012 Alibaba Group.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package miniDB.parser.ast.stmt.ddl;

import miniDB.parser.ast.expression.primary.Identifier;
import miniDB.parser.ast.stmt.SQLStatement;
import miniDB.parser.visitor.Visitor;

/**
 * (created at 2011-8-11)
 *
 * @author <a href="mailto:shuo.qius@alibaba-inc.com">QIU Shuo</a>
 */
public class DescTableStatement implements SQLStatement {

    private final Identifier table;

    public DescTableStatement(Identifier table) {
        if (table == null)
            throw new IllegalArgumentException("table is null for desc table");
        this.table = table;
    }

    public Identifier getTable() {
        return table;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}