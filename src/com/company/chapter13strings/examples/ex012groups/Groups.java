package com.company.chapter13strings.examples.ex012groups;
/**
 * 12. (5) Измените пример Groups.java так, чтобы в нем подсчитывались все уникальные
 * слова, не начинающиеся с прописной буквы.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble ln the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the lubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    /**
     * \b - граница слова. Это соответствует началу и окончанию слова
     * . соответствует любому персонажу,
     * * соответствует предыдущему символу 0 или более раз,
     * ? делает предыдущий * неживым, поэтому он соответствует как можно меньше символов, чем целая строка
     */
    public static void main(String[] args) {
//        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        Matcher m = Pattern.compile("(?m)\\b[A-Z].*?\\b").matcher(POEM);
        Set<String> set = new HashSet<>();
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++)
//                System.out.println("[" + m.group(j) + "]");
                set.add(m.group(j));
//            System.out.println("");
        }
        System.out.println(set.size() + 1);
    }
}
