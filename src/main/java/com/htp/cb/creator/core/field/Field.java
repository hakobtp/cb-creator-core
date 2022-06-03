package com.htp.cb.creator.core.field;

import com.htp.cb.creator.core.exp.Expression;
import com.htp.cb.creator.core.exp.Operation;

public final class Field implements IField {

    private final String name;

    public Field(String name) {
        this.name = name;
    }

    public static Field of(String name) {
        return new Field(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public <T> Expression eq(T t) {
        return new Expression(name, Operation.EQ, t);
    }

    @Override
    public <T> Expression notEq(T t) {
        return new Expression(name, Operation.NOT_EQ, t);
    }

    @Override
    public <T> Expression prefix(T t) {
        return new Expression(name, Operation.PREFIX, t);
    }

    @Override
    public <T> Expression suffix(T t) {
        return new Expression(name, Operation.SUFFIX, t);
    }

    @Override
    public <T> Expression round(T t) {
        return new Expression(name, Operation.ROUND, t);
    }
}