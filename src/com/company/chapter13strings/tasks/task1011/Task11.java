package com.company.chapter13strings.tasks.task1011;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * * 11. (2) Примените регулярное выражение
 * * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 * * к строке
 * * "Arline ate eight apples and one orange while Anita hadn't any"
 */
public class Task11 {
    static String str = "Arline ate eight apples and one orange while Anita hadn't any";

    static void f(Pattern pat, String str) {
        Matcher matcher1 = pat.matcher(str);

        while (matcher1.find()) {
            int start = matcher1.start();
            int end = matcher1.end();
            System.out.println("Найдено? совпадение " + str.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        f(pattern, str);

    }
}
