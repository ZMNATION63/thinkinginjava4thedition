package com.company.chapter07reusingclasses.examples.e03syntaksysnasledovaniyatask2;


public class Detergent extends Cleanser {
    //Изменяемметод:
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//Вызываем метод базового класса
    }

    // Добавляем новые методы к интерфейсу:
    public void foam() {
        append(" foam()");
    }
}
