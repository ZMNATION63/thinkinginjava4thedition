package com.company.chapter09interfaces.examples.e01abstractclassmethods;

import static com.company.chapter09interfaces.examples.e01abstractclassmethods.Music4.tuneAll;

class Scratch_1 {
    public static void main(String[] args) {
        // Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()};

        tuneAll(orchestra);
    }
}
