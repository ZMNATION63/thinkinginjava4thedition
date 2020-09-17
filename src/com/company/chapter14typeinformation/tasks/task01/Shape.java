package com.company.chapter14typeinformation.tasks.task01;

/**
 * *5. (3) Реализуйте в Shapes.java метод rotate(Shape), который проверяет, не относится
 * * ли фигура к классу Circle (и если относится — не выполняет ли операцию).
 */
abstract class Shape {
    boolean markClass = false;

    void draw() {
        System.out.println(this + ".draw()");
    }

    //выделяем класс Circle
    void mark(Shape shape) {
        if (shape instanceof Circle)
            markClass = true;
    }

    abstract public String toString();

    void rotate(Shape shape) {
        if (shape instanceof Circle) {
            Circle existCircle = (Circle) shape;
            if (existCircle.counter != 0) {
                System.out.println("Класс Circle выполнялся " + existCircle.counter);
            } else {
                System.out.println("Класс Circle ни разу не выполнялся!!!");
            }
        }
    }
}