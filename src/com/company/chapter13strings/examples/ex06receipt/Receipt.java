package com.company.chapter13strings.examples.ex06receipt;
/**
 * Цель -отформатировать строку по маске
 * смотри таблицу
 * https://leodev.ru/blog/java/%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%81%D1%82%D1%80%D0%BE%D0%BA-java/#.Xb_S9TMzbIU
 */

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private Formatter Total = new Formatter(System.out);
    int len = 15;
    String f1 = "%-" + len + "s %" + len + "s %" + len + "s\n"; // "%-15s %5s %10s\n"
    String f2 = "%-" + len + "." + len + "s %" + len + "d %" + len + ".2f\n";  //"%-15.15s %5d %10.2f\n"
    String f3 = "%-" + len + "s %" + len + "s %" + len + ".6" + "s\n";  //"%-15s %5s %10s\n"

    public void printTile() {
        f.format(f1, "Item", "Qty", "Price");
        f.format(f1, "+-------------+", "+----+", "+-------+");
    }

    public void print(String name, int qty, double price) {
        f.format(f2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(f3, "+-------------+", "+----+", "+-------+");
        f.format(f3, "Tax", "", total * 0.06);
        f.format(f3, "+-------------+", "+----+", "+-------+");
        f.format(f3, "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTile();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.10);
        receipt.print("Three Bears of Porridge", 1, 14.29);
        receipt.printTotal();
    }
}