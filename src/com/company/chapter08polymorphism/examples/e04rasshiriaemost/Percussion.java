package com.company.chapter08polymorphism.examples.e04rasshiriaemost;

public class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("AdjustingPercussion");
    }
}
