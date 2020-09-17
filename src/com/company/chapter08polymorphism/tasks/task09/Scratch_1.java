package com.company.chapter08polymorphism.tasks.task09;


/**
 * 9. (3) Создайте иерархию наследования, используя в качестве основы различные типы
 * грызунов. Базовым классом станет Rodent (грызун), а производными классами будут
 * M ouse (мышь), Hamster (хомяк) и т. п. В базовом классе определите несколько общих
 * методов, которые затем переопределите в производных классах, для того чтобы они
 * производили действие, свойственное конкретному типу объекта. Создайте массив
 * из объектов Rodent, заполните его различными производными типами и вызовите
 * методы базового класса, чтобы увидеть результат работы программы.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Rat rat = new Rat();
        Hamster hamster = new Hamster();

        rat.say();
        mouse.say();
        rat.move();
        mouse.move();

        hamster.say();
        hamster.move();

        Rodent[] arrRoadent = {rat, mouse, hamster};
        for (int i = 0; i < arrRoadent.length; i++) {
            arrRoadent[i].move();
            arrRoadent[i].say();
        }
    }
}