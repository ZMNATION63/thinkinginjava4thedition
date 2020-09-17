package com.company.chapter07reusingclasses.examples.e11protected;

/**
 * 15. (2) Создайте класс в пакете. Ваш класс должен содержать метод со спецификатором
 * protected. Попытайтесь вызвать метод protected за пределами пакета, и объясните,
 * что происходит. Затем создайте класс, производный от вашего, и вызовите метод
 * protected из другого метода вашего производного класса.
 * <p>
 * Как видите, метод change() имеет доступ к методу set(), поскольку тот объявлен как
 * protected. Также обратите внимание, что метод toString() класса Orc определяется
 * с использованием версии этого метода из базового класса.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 12);
        System.out.println(orc);
        orc.change("Бo6", 19);
        System.out.println(orc);
    }
}