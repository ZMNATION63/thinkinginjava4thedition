package com.company.chapter14typeinformation.examples.ex06filledlist;

import java.util.ArrayList;
import java.util.List;

/**
 * используется синтаксис параметризованных ссылок. Он сохраняет ссылку на класс, а потом создает контейнер List с
 * объектами, сгенерированными методом newInstance()
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++)
                result.add(type.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        //Создается лист объектов CountedInteger создание по имени класса  CountedIntege.class который видно в пакете
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}