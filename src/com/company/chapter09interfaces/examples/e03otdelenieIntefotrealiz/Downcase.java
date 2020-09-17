package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class Downcase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }

}
