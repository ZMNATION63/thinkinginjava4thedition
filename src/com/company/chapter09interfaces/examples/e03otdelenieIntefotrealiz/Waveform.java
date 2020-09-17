package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }

}
