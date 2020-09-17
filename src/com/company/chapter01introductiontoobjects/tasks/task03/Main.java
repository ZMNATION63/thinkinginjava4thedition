package com.company.chapter01introductiontoobjects.tasks.task03;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет Мир, сегодня: ");
        System.out.println(new Date());
        ATypeName at = new ATypeName();
        System.out.println("ATypeName: " + at.d);
    }
}
