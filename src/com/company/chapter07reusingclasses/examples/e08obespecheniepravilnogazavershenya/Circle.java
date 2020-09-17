package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Рисуем окружность Circle");
    }

    void dispose() {
        System.out.println("Стираем окружность Circle");
        super.dispose();
    }
}
