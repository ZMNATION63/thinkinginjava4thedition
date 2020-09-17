package com.company.chapter01introductiontoobjects.examples;

//пример СТР 91
//: object/HelloDate.java
/**
 * Первая программа-пример книги.
 * Выводит строку и текущее число.
 * 0author Брюс Эккель
 * 0author www.MindView.net
 * 0version
 * public class HelloDate {
 * /** Точка входа в класс и приложение
 * * gparam args Массив строковых аргументов
 * * 0throws exceptions Исключения не выдаются V
 * public static void main(Stning[] args) {
 * System.out.println("Пpивeт^ сегодня: ")j System.out.println(new Date())j
 * }
 * > Output: (55% match)
 * Привет^ сегодня: yed Oct 05 14:39:36 MDT 2005
 */

import java.util.Date;

public class Main {


    public static void main(String[] args) {

        ShowExample();
        //Поля и методы стр 77 должно быт ьприсвоено значение по умолчанию дял примитивов
        DataOnly data = new DataOnly();
        System.out.println("Поля и методы стр 77: " + "\n " + +data.i + "\n " + data.d + "\n " + data.b);

        //STR 79
        //String str = "Пример фун-ии без возвращаемой переменной стр 79.";
        String str = new String("Пример фун-ии без возвращаемой переменной стр 79.");
        str79(str);
        //STR79
        int i = 2;
        System.out.println("Пример функции с возвращаемой переменной стр 79 i = 2 -> int79(i) = " + int79(i) + ".");

        //Ключевое слово static стр 82
        StaticTest stl = new StaticTest();
        StaticTest st2 = new StaticTest();
        Incrementable inc = new Incrementable();
        System.out.println(inc + " Почему он выкидывает ссылки, а не значения. Ключевое слово static стр 82");
        System.out.println(stl + " Почему он выкидывает ссылки, а не значения. Ключевое слово static стр 82");
        System.out.println(st2 + " Почему он выкидывает ссылки, а не значения. Ключевое слово static стр 82 \n \n");

        //Ваша первая программа на Java СТР 84
        System.out.println("Приветб сегодна: ");
        System.out.println(new Date());
        System.out.println("");
        System.out.println("ShowProperties");
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println("");
    }

    static void ShowExample() {

        System.out.println("примет видимости переменных");
        System.out.println("    {");
        System.out.println("        int x = 12;");
        System.out.println("            {");
        System.out.println("                int x = 47; //ОШИБКА ");
        System.out.println("            }" + "\n ");
        System.out.println("    }" + "\n ");
        System.out.println("{ //страница 75");
        System.out.println("    int x = 12;");
        System.out.println("    {");
        System.out.println("        int q = 96;" + "\n // доступны как x, так и q");
        System.out.println("    }" + "\n // доступно только X \n // q находится \"за пределами видимости\"");
        System.out.println("}");
        System.out.println("");
    }

    static int int79(int k) {
        return k * 2;
    }

    static void str79(String str) {
        System.out.println(str);
    }
}
