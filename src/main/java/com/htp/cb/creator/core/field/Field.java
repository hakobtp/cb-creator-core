package com.htp.cb.creator.core.field;

import com.htp.cb.creator.core.expression.Expression;
import com.htp.cb.creator.core.expression.Operation;

public final class Field implements IField {

    private final String columnName;

    public Field(String columnName) {
        this.columnName = columnName;
    }

    public static Field of(String columnName) {
        return new Field(columnName);
    }

    public String getColumnName() {
        return columnName;
    }

    @Override
    public <T> Expression eq(T t) {
        return new Expression(columnName, Operation.EQ, t);
    }

    @Override
    public <T> Expression notEq(T t) {
        return new Expression(columnName, Operation.NOT_EQ, t);
    }

    @Override
    public <T> Expression prefix(T t) {
        return new Expression(columnName, Operation.PREFIX, t);
    }

    @Override
    public <T> Expression suffix(T t) {
        return new Expression(columnName, Operation.SUFFIX, t);
    }

    @Override
    public <T> Expression round(T t) {
        return new Expression(columnName, Operation.ROUND, t);
    }
}