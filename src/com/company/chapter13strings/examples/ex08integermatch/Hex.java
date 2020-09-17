package com.company.chapter13strings.examples.ex08integermatch;

public class Hex {
    public static void main(String[] args) {
        System.out.println("-".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+9110".matches("\\+?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}

