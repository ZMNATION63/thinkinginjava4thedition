package com.company.chapter18javaio.examples.ex06testeof;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Проверка конца файла при побайтовом чтении
 * кодировка  Unicode
 * количество байтов, которые можно прочитать без блокировки
 */
public class TestEOF {
    public static void main(String[] args)
            throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src\\examples\\ex06testeof\\TestEOF.java")));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}