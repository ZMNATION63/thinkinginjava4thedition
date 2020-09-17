package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

public class LowPass {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Фиктивная обработка
    }
}
