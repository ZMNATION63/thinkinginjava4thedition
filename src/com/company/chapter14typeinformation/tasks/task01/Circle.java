package com.company.chapter14typeinformation.tasks.task01;

class Circle extends Shape {
    static int counter = 0;

    String name;

    Circle() {
        counter++;
    }

    Circle(String name) {
        counter++;
        this.name = name;
    }

    public String toString() {
        String s = " Парамерт  класса  Circle makkClass = " + this.markClass;
        return s;
    }
}
