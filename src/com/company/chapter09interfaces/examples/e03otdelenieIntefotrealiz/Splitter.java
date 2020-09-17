package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

import java.util.Arrays;

public class Splitter extends Processor {
    String process(Object input) {
// Аргумент sp lit() используется для разбиения строки
        return Arrays.toString(((String) input).split(" "));
    }
}
