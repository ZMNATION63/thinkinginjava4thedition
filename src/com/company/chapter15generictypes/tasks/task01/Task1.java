package com.company.chapter15generictypes.tasks.task01;

//import com.company.Examples.Ex01Automobile.Automobile;

import com.company.chapter15generictypes.examples.ex01automobile.Automobile;

/**
 * 2. (1) Создайте класс для хранения трех объектов одного типа, с методами сохранения
 * и выборки этих объектов и конструктором для инициализации всех трех объектов.
 */
public class Task1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        HolderTypes<String> str1 = new HolderTypes<>("Mishka", "Lubit", "Knijki");
        HolderTypes<Integer> int1 = new HolderTypes<>(23, 9, 1987);
        Automobile automobile; // = new Automobile();
        Class<?> aClass = Class.forName("com.company.Examples.Ex01Automobile.Automobile");
        automobile = (Automobile) aClass.newInstance();

        HolderTypes<Automobile> auto = new HolderTypes<>(automobile, automobile, automobile);
        System.out.println(auto);
        System.out.println(automobile);
        System.out.println(aClass.getName());
        System.out.println(str1);
        System.out.println(int1);
    }
}
