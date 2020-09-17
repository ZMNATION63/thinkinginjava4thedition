package com.company.chapter13strings;

public class Main {

    public static void main(String[] args) {
        String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";


        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

    }
}
