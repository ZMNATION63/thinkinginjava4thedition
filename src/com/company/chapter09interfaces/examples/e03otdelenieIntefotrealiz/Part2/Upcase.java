package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz.Part2;

public class Upcase extends StringProcessor {
    public String process(Object input) { // Ковариантный возвращаемый тип
        return ((String) input).toUpperCase();
    }
}
