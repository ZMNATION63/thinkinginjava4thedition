package com.company.chapter09interfaces.examples.e02interfaces;

public class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }

    @Override
    public String toString() {
        return "Brass ";
    }
}
