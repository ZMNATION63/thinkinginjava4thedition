package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class Upcase extends Processor {
    String process(Object input) { // Ковариантный возвращаемый тип
        return ((String) input).toUpperCase();
    }
}
