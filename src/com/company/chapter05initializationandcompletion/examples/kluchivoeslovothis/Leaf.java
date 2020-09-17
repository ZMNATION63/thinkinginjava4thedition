package com.company.chapter05initializationandcompletion.examples.kluchivoeslovothis;

class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }
}
