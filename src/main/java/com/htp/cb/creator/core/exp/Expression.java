package com.htp.cb.creator.core.exp;

import java.util.Objects;

public final class Expression {

    private final String name;
    private final Operation operation;
    private final Object value;

    public Expression(String name, Operation operation, Object value) {
        this.name = name;
        this.operation = operation;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Operation getOperation() {
        return operation;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Expression that = (Expression) o;

        return Objects.equals(name, that.name)
                && operation == that.operation
                && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, operation, value);
    }

    @Override
    public String toString() {
        return "Expression{" +
                "name='" + name + '\'' +
                ", operation=" + operation +
                ", value=" + value +
                '}';
    }
}
