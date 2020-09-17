package com.company.chapter13strings.examples.ex011finding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+") //Буквы верх низ цыфры + куча букв
                .matcher("Evening is full of the linnet's wings");
        while (m.find())
            System.out.println(m.group() + " ");
        System.out.println();

        int i = 0;
        while (m.find(i)) {
            System.out.println(m.group() + " ");
            i++;
        }
    }
}