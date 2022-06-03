package com.htp.cb.creator.core.expression;

import java.util.Objects;

public final class Expression {

    private final String columnName;
    private final Operation operation;
    private final Object value;

    public Expression(String columnName, Operation operation, Object value) {
        this.columnName = columnName;
        this.operation = operation;
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
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

        return Objects.equals(columnName, that.columnName)
                && operation == that.operation
                && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, operation, value);
    }

    @Override
    public String toString() {
        return "Expression{" +
                "columnName='" + columnName + '\'' +
                ", operation=" + operation +
                ", value=" + value +
                '}';
    }
}
