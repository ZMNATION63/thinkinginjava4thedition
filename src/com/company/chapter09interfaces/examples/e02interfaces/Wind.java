package com.company.chapter09interfaces.examples.e02interfaces;

public class Wind implements Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + " .adjust()");
    }
}
