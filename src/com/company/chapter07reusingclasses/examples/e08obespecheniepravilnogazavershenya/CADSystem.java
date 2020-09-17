package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

public class CADSystem extends Shape {
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

    void dispose() {
        System.out.println("CADSystem.dispose() ");
        // Завершение осуществляется в порядке,
        // обратном порядку инициализации
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--)
            lines[i].dispose();
        super.dispose();
    }
}
