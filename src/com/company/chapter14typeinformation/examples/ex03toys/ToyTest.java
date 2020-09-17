package com.company.chapter14typeinformation.examples.ex03toys;

/**
 * 1. (1) В примере ToyTest.java закомментируйте конструктор Toy по умолчанию. Объясните, что при этом происходит.
 * <p>
 * 2. (2) Встройте новый интерфейс в ToyTest.java. Убедитесь в том, что он обнаруживается,
 * а информация о нем выводится программой
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Канноническое имя : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.company.Examples.Ex03Toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("He удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Необходим конструктор по умолчанию:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("He удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
