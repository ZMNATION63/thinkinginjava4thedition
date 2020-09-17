package com.company.chapter13strings.examples.ex010replacing;

import com.company.chapter13strings.examples.ex09splitting.Splitting;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located")); //поиск првого вхождения символа f
        //и сразу замена слова на пример
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
        //замена всех совпадений на пример
    }
}
