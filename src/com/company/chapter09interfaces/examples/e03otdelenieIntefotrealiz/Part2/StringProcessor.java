package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz.Part2;

public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s =
            "If she weighs the same as a duck, she's made of wood";
}
