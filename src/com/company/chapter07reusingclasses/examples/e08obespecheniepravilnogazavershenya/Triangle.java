package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Рисуем треугольник Triangle");
    }

    void dispose() {
        System.out.println("Стираем треугольник Triangle");
        super.dispose();
    }
}
