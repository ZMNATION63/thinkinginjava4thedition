package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
