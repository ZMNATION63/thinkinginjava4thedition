package com.company.chapter19enumeratedtypes.examples.ex09enums;

/**
 * Мы установили, что все перечисления расширяют java.lang.Enum.
 * Так KaKjava не поддерживает множественное наследование, это означает,
 * что перечисление не может быть создано посредством наследования
 */
enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, IUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
}
