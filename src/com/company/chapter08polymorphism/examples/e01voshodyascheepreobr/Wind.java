package com.company.chapter08polymorphism.examples.e01voshodyascheepreobr;

// О бъекты W ind такж е я в л я ю тся о б ъ е к та м и I n s t r u m e n t ,
// п о с к о л ь к у имеют т о т же и н тер ф ей с:
public class Wind extends Instrument {
    //Переопределение метода интерфейса:
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
