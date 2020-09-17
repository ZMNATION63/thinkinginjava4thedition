package com.company.chapter06accesscontrol.examples.e10dostupkklassamtask8.soups;

public class Soup3 {
    private static int countSoup = 0;

    private Soup3() {
    }


    // (1) Разрешаем создание объектов в статическом методе:
    public static Soup3 makeSoup() {
        Soup3 soup31 = null;

        //сотрим сколько супа мы можем создать
        if (countSoup < 10) {
            soup31 = new Soup3();
            System.out.println("Возвращаем объект Soup3");
            countSoup++;
        } else {
            System.out.println("Превышен лимит супа, ОБОЖРЕШЬСЯ!!! MAX = " + countSoup);
            return null;
        }
        return soup31;
    }

}

