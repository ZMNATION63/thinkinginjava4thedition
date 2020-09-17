package com.company.chapter15generictypes.examples.ex037dogsandrobots;

public class Communicate {
    public static <T extends Performs>
    void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}
