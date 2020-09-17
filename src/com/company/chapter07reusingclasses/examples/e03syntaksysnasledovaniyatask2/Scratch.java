package com.company.chapter07reusingclasses.examples.e03syntaksysnasledovaniyatask2;

/**
 * 2. (2) Объявите новый класс, производный от Detergent. Переопределите метод scrub()
 * и добавьте новый метод с именем ste riliz e ()
 * Синтаксис наследования и его свойства
 */
class Scratch {
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
        System.out.println("+++++++++++");

        Detergent x1 = new Detergent();
        x1.dilute();
        x1.apply();
        x1.scrub();
        x1.foam();
        System.out.println(x1);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
        System.out.println("++++++++++++++");
        NewDetergent newDetergent = new NewDetergent();
        newDetergent.scrub();//Вызываем переопределенный метод класса
        // Как обратиться от нового класса к методу родителя
        newDetergent.sterilize();//
    }
}