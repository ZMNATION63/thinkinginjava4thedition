package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    //  public waveform process(Waveform input) { return input; }
}
