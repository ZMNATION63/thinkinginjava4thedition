package com.company.chapter08polymorphism.examples.e05problemapolyaistaticmethods;

public class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Производная версия staticGet()";
    }

    public String dynamicGet() {
        return "Производная версия dynamicGet()";
    }
}
