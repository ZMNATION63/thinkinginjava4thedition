package com.company.chapter20annotations.examples.ex02simulatingnull;

public @interface Uniqueness {
    Constraints constraints()
            default @Constraints(unique = true);
}
