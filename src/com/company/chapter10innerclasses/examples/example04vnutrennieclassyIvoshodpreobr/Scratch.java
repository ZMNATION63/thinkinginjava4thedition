package com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr;

/**
 * В класс Parcel4 было добавлено кое-что новое: внутренний класс PContents является
 * закрьггым (объявлен как private), поэтому нигде, кроме как во внешнем для него классе
 * Parcel4, нельзя получить к нему доступ. Класс PDestination объявлен как protected,
 * следовательно, доступ к нему имеют только класс Parcel4, классы из одного пакета
 * с Parcel4
 */
class Scratch {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        ContentsMZ c = p.contents();
        Destination d = p.destination("Tanzanya");
// Обращение к закрытому классу невозможно:
//! Parcel4.PContents pc = p.new PContents();
        System.out.println(d.readLabel());

    }
}