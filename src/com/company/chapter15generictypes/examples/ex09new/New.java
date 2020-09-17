package com.company.chapter15generictypes.examples.ex09new;

import java.util.*;

/**
 * 11. ( 1) Протестируйте пример New.java; создайте собственные классы и убедитесь в том,
 * что класс New правильно работает с ними.
 * <p>
 * Упрощенное создание обобщенных контейнеров
 * за счет использования автоматического определения
 * аргументов-типов.
 */
public class New {
    public static <T> Set<T> tree() {
        return new TreeSet<T>();
    }

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    // Примеры:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();
        Set<Integer> setTree = New.tree();

        System.out.println(sls.getClass());
        System.out.println(ls.getClass());
        System.out.println(lls.getClass());
        System.out.println(ss.getClass());
        System.out.println(qs.getClass());
        System.out.println(setTree.getClass());
    }
}
