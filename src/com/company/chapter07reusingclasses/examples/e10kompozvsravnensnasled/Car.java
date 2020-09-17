package com.company.chapter07reusingclasses.examples.e10kompozvsravnensnasled;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // двухдверная машина

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public void service() {
        System.out.println("Metod service class Car");
    }
}
