package com.company.chapter13strings.tasks.task1011;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 10. (2) Определите, будет ли найдено в строке «Java now has regular expressions» совпадение для следующих выражений:
 * ^Java
 * \Bereg.*
 * n.w\s+h(a|i)s
 * s?
 * s*
 * s+
 * S{4}
 * S{1}.
 * S{0,3}
 * <p>
 * 11. (2) Примените регулярное выражение
 * (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 * к строке
 * "Arline ate eight apples and one orange while Anita hadn't any"
 */
public class Task10 {
    static void f(Pattern pat, String str) {
        Matcher matcher1 = pat.matcher(str);

        while (matcher1.find()) {
            int start = matcher1.start();
            int end = matcher1.end();
            System.out.println("Найдено? совпадение " + str.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
    }

    public static String string = "Java now has regular expressions";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Java"); //В начале строки Java
        f(p, string);
        System.out.println("");

        p = Pattern.compile("\\Bereg."); //Не граница слова + ereg + любой символ
        f(p, string);
        System.out.println("");

        p = Pattern.compile("n.w\\s+h(a|i)s");//   n любой симовл w + много разных букв + has или his
        f(p, string);
        System.out.println("");

        p = Pattern.compile("s?"); //Пропуск (пробел, табуляция, новая строка, подача страницы, возврат курсора)
        f(p, string);
        System.out.println("");

        p = Pattern.compile("s*");//Пропуск (пробел, табуляция, новая строка, подача страницы, возврат курсора)
        f(p, string);
        System.out.println("");

        p = Pattern.compile("s+");//Пропуск (пробел, табуляция, новая строка, подача страницы, возврат курсора)
        f(p, string);
        System.out.println("");
        p = Pattern.compile("S{4}"); //Символ, не являющийся пропуском
        f(p, string);
        System.out.println("");
        p = Pattern.compile("S{1}."); //Символ, не являющийся пропуском
        f(p, string);
        System.out.println("");

        p = Pattern.compile("S{0,2}");//Символ, не являющийся пропуском не менее 0 но не более 2 раз ([^\s])
        f(p, string);
        System.out.println("");
    }
}
