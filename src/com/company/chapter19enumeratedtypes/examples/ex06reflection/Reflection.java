package com.company.chapter19enumeratedtypes.examples.ex06reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Как упоминалось ранее, все классы перечислений создаются за вас компилятором и расширяют класс Enum.
 * Но если присмотреться к классу Enum, вы увидите, что метода values() в нем нет, хотя мы его и использовали.
 */
enum Explore {HERE, THERE}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("Analyze " + enumClass + "--------");
        System.out.println("Interface");
        for (Type t : enumClass.getGenericInterfaces()
        ) {
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getGenericInterfaces());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
            System.out.println(methods);
        }
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsALL(Enum)? " +
                exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeALL(): ");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);
    }
}
