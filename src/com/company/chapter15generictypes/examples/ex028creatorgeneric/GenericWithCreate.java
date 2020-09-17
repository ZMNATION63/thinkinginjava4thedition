package com.company.chapter15generictypes.examples.ex028creatorgeneric;

abstract class GenericWithCreate<T> {
    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}
