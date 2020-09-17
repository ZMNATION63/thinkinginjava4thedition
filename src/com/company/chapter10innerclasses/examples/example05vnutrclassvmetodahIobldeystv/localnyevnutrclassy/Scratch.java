package com.company.chapter10innerclasses.examples.example05vnutrclassvmetodahIobldeystv.localnyevnutrclassy;

import com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr.Destination;

/**
 * Первый пример демонстрирует создание всего класса в области действия метода
 * (вместо области действия другого класса). Такая конструкция называется локальным
 * внутренним классом:
 */

//import com.company.Examples.Example04VnutrennieClassyIVoshodPreobr.Destination;

class Scratch {
    public static class Parcel5 {
        public Destination destination(String s) {
            class PDestination implements Destination {
                private String label;

                private PDestination(String whereTo) {
                    label = whereTo;
                }

                public String readLabel() {
                    return label;
                }
            }
            return new

                    PDestination(s);
        }

        public static void main(String[] args) {
            Parcel5 p = new Parcel5();
            Destination d = p.destination("Танзания");
            System.out.println(d.readLabel());
        }
    }
}