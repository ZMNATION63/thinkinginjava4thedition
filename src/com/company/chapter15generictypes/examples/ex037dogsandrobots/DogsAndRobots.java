package com.company.chapter15generictypes.examples.ex037dogsandrobots;

/**
 * Латентная типизаяция
 * Цель в то Communicate может общаться с объектом класса который был передан в качестве аргумента,
 * ограничение в том, что должны быть реализованы 2 метода в передаваемых классах speac() и sit()
 */
public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(d);
        Communicate.perform(r);
    }
}
