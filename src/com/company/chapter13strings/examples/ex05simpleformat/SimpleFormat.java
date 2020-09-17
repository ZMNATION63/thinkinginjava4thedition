package com.company.chapter13strings.examples.ex05simpleformat;

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 523456789;
        double у = 5.332542;
// Старый способ:
        System.out.println("Row 1: [" + x + у + "]");
// Новый способ:
        System.out.format("Row 1: [%d %f]\n", x, у);
// или
        System.out.printf("Row 1: [%d %f]\n", x, у);
    }
}