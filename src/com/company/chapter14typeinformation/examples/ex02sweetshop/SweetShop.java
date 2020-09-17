package com.company.chapter14typeinformation.examples.ex02sweetshop;

/**
 * 7. (3) Измените пример SweetShop.java так, чтобы тип создаваемых объектов определялся аргументом командной строки.
 * Другими словами, если для запуска используется  * командная CTpoKajava SweetShop Candy, то создаются только объекты Candy.
 * Обратите
 * внимание на возможность управления тем, какие объекты Class загружаются программой, через аргумент командной строки.
 * 8« (5) Напишите метод, который получает объект и рекурсивно выводит все классы
 * в иерархии этого объекта.
 * 9. (5) Измените предыдущее упражнение так, чтобы в нем использовался метод Class.
 * getDeclaredFields() для вывода информации о полях класса.
 * <p>
 * 10 . (3) Напишите программу, которая определяет, является ли массив char примитивным типом или «настоящим» объектом
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Внутри main");
        new Candy();
        System.out.println("После создания Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Не может найти Gum");
        }
        System.out.println("После Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("После создания Cookie");
    }
}