package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}
