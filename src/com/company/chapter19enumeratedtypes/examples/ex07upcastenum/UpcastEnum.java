package com.company.chapter19enumeratedtypes.examples.ex07upcastenum;

/**
 * При восходящем преобразовании перечисления
 * метод values() недоступен.
 */
enum Serch {HITHER, YOU}

public class UpcastEnum {
    public static void main(String[] args) {
        Serch[] vals = Serch.values();
        Enum e = Serch.HITHER;

        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}
