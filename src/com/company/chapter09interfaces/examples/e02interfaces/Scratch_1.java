package com.company.chapter09interfaces.examples.e02interfaces;


import static com.company.chapter09interfaces.examples.e02interfaces.Music5.tuneAll;

class Scratch_1 {
    public static void main(String[] args) {
        // Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()};

        //tuneAll (orchestra);
        tuneAll(orchestra);
    }
}
/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~