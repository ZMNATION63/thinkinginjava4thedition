package com.company.chapter19enumeratedtypes.examples.ex02spiciness;

import static com.company.chapter19enumeratedtypes.examples.ex02spiciness.Spiciness.*;

/**
 * Простой пример создания объекта из перечисляемого типа
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
