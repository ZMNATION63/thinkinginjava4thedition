package com.company.chapter01introductiontoobjects.tasks.task06;

public class Main {

    public static void main(String[] args) {
        String str = "Все идет в гору!!!";
        System.out.println("str = " + str);
        System.out.println("str.length = " + str.length());
        System.out.println("storage(str) = " + storage(str));
    }

    static int storage(String s) {
        return s.length() * 2;
    }
}
