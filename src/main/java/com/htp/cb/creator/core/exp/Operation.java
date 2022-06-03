package com.htp.cb.creator.core.exp;

public enum Operation {
    EQ,
    NOT_EQ,
    PREFIX, //LIKE '%a'
    SUFFIX, //LIKE 'a%'
    ROUND,  //LIKE '%or%'
}
