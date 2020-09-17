package com.company.chapter08polymorphism.examples.e04rasshiriaemost;

//import com.company.Examples.E01VoshodyascheePreobr.Note;

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()" + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("AdjustingInstrument");
    }


}
