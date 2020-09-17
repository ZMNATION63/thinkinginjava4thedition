package com.company.chapter08polymorphism.examples.e04rasshiriaemost;

public class Brass extends Wind {
    void play(Note n) {
        System.out.println("8rass.play()" + n);
    }

    void adjust() {
        System.out.println("AdjustingBrass");
    }

}
