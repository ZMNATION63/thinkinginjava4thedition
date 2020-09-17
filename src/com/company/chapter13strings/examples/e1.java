package com.company.chapter13strings.examples;

import java.util.Formatter;

/**
 * 4. (3) Измените пример Receipt.java так, чтобы все ширины управлялись одним набором
 * констант. Сделайте так, чтобы ширину вывода можно было изменить, модифицируя
 * одно значение в одном месте.
 * <p>
 * Не догнал как зменить строку!?
 */
class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    //    String format1 = "%-15s %5s %10s\n";
//    String format2 = "%-15.15s %5d %10.2f\n";
//    String format3 = "%-15s %5s %10.2f\n";
    Formatter rin = new Formatter();

    String format1 = "%-15s %5s %10s\n";
    String format2 = "%-15.15s %5d %10.2f\n";
    String format3 = "%-15s %5s %10.2f\n";


    public void printTile() {
        f.format(format1, "Item", "Qty", "Price");
        f.format(format1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(format2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(format3, "Tax", "", total * 0.06);
        f.format(format1, "", "", "-----");
        f.format(format3, "Total", "", total * 1.06);
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