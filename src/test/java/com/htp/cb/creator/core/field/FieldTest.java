package com.htp.cb.creator.core.field;

import com.htp.cb.creator.core.expression.Expression;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.htp.cb.creator.core.expression.Operation.*;
import static com.htp.cb.creator.core.field.util.TestData.createExpression;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldTest {

    @ParameterizedTest(name = "When arguments are:{argumentsWithNames}.")
    @MethodSource("testData")
    void fieldMethodTest(Expression expectedExp, Expression actualExp) {
        assertEquals(expectedExp, actualExp);
    }

    private static Stream<Arguments> testData() {
        final Object value = "John";
        final String columnName = "firstName";
        return Stream.of(
                Arguments.of(createExpression(columnName, EQ, value), Field.of("firstName").eq(value)),
                Arguments.of(createExpression(columnName, NOT_EQ, value), Field.of("firstName").notEq(value)),
                Arguments.of(createExpression(columnName, PREFIX, value), Field.of("firstName").prefix(value)),
                Arguments.of(createExpression(columnName, SUFFIX, value), Field.of("firstName").suffix(value)),
                Arguments.of(createExpression(columnName, ROUND, value), Field.of("firstName").round(value))
        );
    }
}

