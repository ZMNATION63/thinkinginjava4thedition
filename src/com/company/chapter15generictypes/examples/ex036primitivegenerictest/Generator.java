package com.company.chapter15generictypes.examples.ex036primitivegenerictest;

import com.company.chapter15generictypes.examples.ex012generators.Generators;

public interface Generator<T> {
    Generators next();
}
