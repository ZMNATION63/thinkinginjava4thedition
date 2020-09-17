package com.company.chapter12errorhandlingandexceptions.tasks.task1617;


class Shape {
    Shape(int i) {
        System.out.println("Конструктор Shape");
    }

    void dispose() {
        System.out.println("Метод dispose класс shape");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Рисум круг");
    }

    void dispose() {
        System.out.println("Стираем круг");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Рисуем треугольник");
    }

    void dispose() {
        System.out.println("Стираем треугольник");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию: " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Стираем линию: " + start + ", " + end);
        super.dispose();
    }
}

class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j * j);
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Комбинированный конструктор");
    }

    public void dispose() {
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            throw new RuntimeException();
            //x.dispose();
        } finally {
            System.out.println("!!!Начало блока finally!!!");
            x.dispose();
            System.out.println("!!!Конец блока finally!!!");
        }
    }
}

