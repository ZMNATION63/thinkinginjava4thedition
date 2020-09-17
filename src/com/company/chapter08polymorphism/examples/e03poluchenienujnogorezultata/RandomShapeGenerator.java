package com.company.chapter08polymorphism.examples.e03poluchenienujnogorezultata;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(57);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new ClassTask();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 3:
                return new Circle();
        }
    }
}
