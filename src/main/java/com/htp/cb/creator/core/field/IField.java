package com.htp.cb.creator.core.field;

import com.htp.cb.creator.core.expression.Expression;

public interface IField {

    <T> Expression eq(T t);

    <T> Expression notEq(T t);

    <T> Expression prefix(T t);

    <T> Expression suffix(T t);

    <T> Expression round(T t);
}
