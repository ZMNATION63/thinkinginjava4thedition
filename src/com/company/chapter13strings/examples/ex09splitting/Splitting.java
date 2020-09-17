package com.company.chapter13strings.examples.ex09splitting;

import java.util.Arrays;

public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herringf";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" "); // Выражение может не содержать специальных символов
        split("\\W+"); // Разбиение по символам, не являющимся символами слов
        split("n\\W+"); // Буква 'n', за которой следуют символы,
// не являющиеся символами слов, в выводе убивает символ который указан в качестве разделителя
    }
}
