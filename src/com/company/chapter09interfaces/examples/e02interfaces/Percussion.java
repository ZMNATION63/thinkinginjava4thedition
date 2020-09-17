package com.company.chapter09interfaces.examples.e02interfaces;

public class Percussion implements Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + " .adjust()");
    }
}
