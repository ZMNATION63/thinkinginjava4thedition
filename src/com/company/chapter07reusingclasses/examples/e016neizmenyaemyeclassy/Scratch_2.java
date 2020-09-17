package com.company.chapter07reusingclasses.examples.e016neizmenyaemyeclassy;

/**
 * Объяв ляя класс неизм енным (записывая в его определении клю чевое слово final) ,
 * вы показы ваете, что не собираетесь использовать этот класс в качестве базового п ри
 * наследовании и запрещаете это делать другим.
 */
class Scratch_2 {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}