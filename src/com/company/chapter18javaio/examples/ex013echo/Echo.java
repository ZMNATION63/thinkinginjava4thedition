package com.company.chapter18javaio.examples.ex013echo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Демонстрация ввода данных в BufferedReader и мнгновенный вывод в терминал
 */
public class Echo {
    public static void main(String[] args)
            throws IOException {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0)
            System.out.println(s);
// Пустая строка или Ctrl-Z завершает работу програгты.
    }
}