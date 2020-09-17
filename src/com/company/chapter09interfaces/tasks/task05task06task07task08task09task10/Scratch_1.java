package com.company.chapter09interfaces.tasks.task05task06task07task08task09task10;


/**
 * 5. (2) Создайте интерфейс, содержащий три метода, в отдельном пакете. Реализуйте
 * этот интерфейс в другом пакете.
 * <p>
 * 6. (2) Докажите, что все методы интерфейса автоматически являются открытыми
 * (public).
 * <p>
 * 8. (2) В программе Sandwich.java из главы 8 создайте интерфейс с именем FastFood
 * (с подходящими методами); измените класс Sandwich так, чтобы он реализовал
 * этот интерфейс
 * <p>
 * 10. (3) Измените программу Music5.java, добавив в нее интерфейс Playable. Переместите
 * объявление play() из класса Instrument в интерфейс Playable. Добавьте Playable
 * к производным классам, включив его в список implements. Измените метод tune()
 * так, чтобы в аргументе ему передавался интерфейс Playable, а не класс Instrument.
 */
class Scratch_1 {
    public static void main(String[] args) {
        ImplInter i = new ImplInter();
        System.out.println(i.mishasInter());
        i.plusplus(512);
        i.shows();
    }
}