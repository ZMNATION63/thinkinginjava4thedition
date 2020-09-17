package com.company.chapter17containerdetails.examples.ex025countedstning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedStning {
    private static List<String> created =
            new ArrayList<String>();
    private String s;
    private int id = 0;

    public CountedStning(String str) {
        s = str;
        created.add(s);
        // id - общее количество экземпляров данной строки,
// используемых классом CountedString:
        for (String s2 : created)
            if (s2.equals(s))
                id++;
    }

    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    public int hashCode() {
// Очень простая схема:
// вернуть s.hashCode() * id
// по рецепту Джошуа Блоша:
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof CountedStning &&
                s.equals(((CountedStning) o).s) &&
                id == ((CountedStning) o).id;
    }

    public static void main(String[] args) {
        Map<CountedStning, Integer> map =
                new HashMap<CountedStning, Integer>();
        CountedStning[] cs = new CountedStning[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedStning("hi");
            map.put(cs[i], i); // Упаковка int -> Integer
        }
        System.out.println(map);
        for (CountedStning cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }
    }
}

