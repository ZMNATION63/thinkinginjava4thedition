package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class LowPas extends Filter {
    double cutoff;

    // public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input; // Фиктивная обработка
    }
}
