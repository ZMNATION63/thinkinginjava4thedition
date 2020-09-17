package com.company.chapter09interfaces.examples.e01abstractclassmethods;

public class Music4 {
    // Работа метода не зависит от фактического типа объекта,
    // поэтому типы, добавленные в систему, будут работать правильно:
    static void tune(Instrument i) {

        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHARP);
        i.play(Note.B_FLAT);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }
}
