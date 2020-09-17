package com.company.chapter18javaio.examples.ex014changesystemout;

import java.io.PrintWriter;

/**
 * Стандартный вывод 5ystem.out является объектом PrintStream, который, в свою очередь,
 * является производным от базового ^accaOutputStream. В классе PrintWriter имеется
 * конструктор, который принимает в качестве аргумента выходной поток OutputStream.
 * Таким образом, при помощи этого конструктора можно преобразовать поток стандартного вывода System.out
 * в символьно-ориентированный поток PrintWriter:
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");
    }
}