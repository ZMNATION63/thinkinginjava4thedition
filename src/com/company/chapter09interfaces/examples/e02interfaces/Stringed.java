package com.company.chapter09interfaces.examples.e02interfaces;

public class Stringed implements Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + " .adjust()");
    }
}
