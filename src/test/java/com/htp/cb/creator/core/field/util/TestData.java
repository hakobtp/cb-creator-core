package com.htp.cb.creator.core.field.util;

import com.htp.cb.creator.core.expression.Expression;
import com.htp.cb.creator.core.expression.Operation;

public class TestData {

    public static Expression createExpression(String name, Operation operation, Object value) {
        return new Expression(name, operation, value);
    }
}
