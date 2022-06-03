package com.htp.cb.creator.core.field.util;

import com.htp.cb.creator.core.exp.Expression;
import com.htp.cb.creator.core.exp.Operation;

public class TestData {

    public static Expression createExpression(String name, Operation operation, Object value) {
        return new Expression(name, operation, value);
    }
}
