package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

public class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию Line: " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}
