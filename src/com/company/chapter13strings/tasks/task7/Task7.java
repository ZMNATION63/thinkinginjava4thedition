package com.company.chapter13strings.tasks.task7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 7. (5) Взяв за основу документацию java.util.regex.Pattern, напишите и протестируйте регулярное выражение,
 * которое проверяет, что предложение начинается с прописной буквы и завершается точкой.
 * <p>
 * 8. (2) Разбейте строку Splitting.knights по словам «the» или «уои».
 * <p>
 * 9. (3) Взяв за основу документацию java.util.regex.Pattern, замените все гласные в Splitting.knights подчеркиваниями.
 */
public class Task7 {
    static void f(Pattern pat, String str) {
        Matcher matcher1 = pat.matcher(str);

        while (matcher1.find()) {
            int start = matcher1.start();
            int end = matcher1.end();
            System.out.println("Найдено? совпадение " + str.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
    }

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herringf";
    public static String str = "first one you must learn more harder!";


    public static void main(String[] args) {
        String s = knights;
        System.out.println(Arrays.toString(knights.split(" you\\s")));//split("n\\W+");
        System.out.println(Arrays.toString(knights.split(" the\\s")));//split("n\\W+");
        System.out.println(s.replaceAll("[AEIOUaeiou]", "_"));

        Pattern pattern = Pattern.compile("^\\p{Lower}|\\p{Punct}$");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено? совпадение " + str.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
        System.out.println("");
        Pattern pattern1 = Pattern.compile("\\p{Punct}$");
        f(pattern1, str);

    }

}
