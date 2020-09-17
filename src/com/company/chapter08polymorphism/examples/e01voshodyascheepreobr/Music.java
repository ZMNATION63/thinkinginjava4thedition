package com.company.chapter08polymorphism.examples.e01voshodyascheepreobr;

// Н а сл е д о в а н и е и во схо д я щ ее п р е о б р а з о в а н и е
//p a d k a g e p o ly m o r p h is m .m u s ic ;
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune2(Instrument i) {
        i.play(Note.B_FLAT);
    }

    public static void tune3(Instrument i) {
        i.play(Note.C_SHARP);
    }
}
