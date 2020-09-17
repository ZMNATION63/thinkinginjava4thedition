/*
package com.company.chapter06accesscontrol.examples.e10dostupkklassamtask8;

*/
/**
 * Спецификаторы доступа для классов.
 * Использование конструкторов, объявленных private,
 * делает класс недоступным при создании объектов.
 * 8. (4) По образцу примера Lunch.java создайте класс с именем ConnectionManager,
 * который управляет фиксированным массивом объектов Connection. Программистклиент
 * не должен напрямую создавать объекты Connection, а может получать их
 * только с помощью статического метода в классе ConnectionManager. Когда запас
 * объектов у класса ConnectionManager будет исчерпан, он должен вернуть ссылку
 * null. Протестируйте классы в методе main().
 *//*


import com.company.Examples.E10DostupKKlassamTask8.Soups.Soup1;
import com.company.Examples.E10DostupKKlassamTask8.Soups.Soup3;

import static misha.newpac.Print.printplus;

class Scratch {
    public static void main(String[] args) {
        Soup1 s = Soup1.makeSoup ();
        printplus ();
        // (2) Создаем один статический объект
        // и по требованию возвращаем ссылку на него,
        Soup3[] arrSoup = new Soup3[15];
        for (int i = 0; i < 12; i++) {
            arrSoup[i] = Soup3.makeSoup ();
        }
        for (Soup3 x : arrSoup) {
            System.out.println (x);
        }
        Soup3 sqw = Soup3.makeSoup ();
        //System.out.println (sqw);
    }
}*/
