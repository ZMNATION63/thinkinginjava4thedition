package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

public class Shape {
    Shape(int i) {
        System.out.println("Коснструктор Shape");
    }

    void dispose() {
        System.out.println("Завершение Shape");
    }
}
