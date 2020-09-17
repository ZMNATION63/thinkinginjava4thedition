package com.company.chapter14typeinformation.examples.ex011showmethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Методы класса Class getMethods() и getConstructors() возвращают массивы объектов
 * Method и Constructor, которые представляют методы и конструкторы класса. В каждом из
 * этих классов есть методы, позволяющие извлечь и проанализировать имена, аргументы
 * и возвращаемые значения представляемых методов и конструкторов. Однако можно
 * использовать простой метод toString(), как и сделано здесь, чтобы получить строку
 * с полным именем метода.
 */

public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualified.class.name\n" +
                    "То show all methods in class or:\n" +
                    "ShowMethods qualified.class.name word\n" +
                    "То search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods)
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                for (Constructor ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for (Method method : methods)
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for (Constructor ctor : ctors)
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}