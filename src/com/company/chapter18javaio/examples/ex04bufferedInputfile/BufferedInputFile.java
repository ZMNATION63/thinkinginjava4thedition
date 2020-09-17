package com.company.chapter18javaio.examples.ex04bufferedInputfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Данный пример читает фай по строкам
 * имя файла извлекает из String или объекта File
 */
public class BufferedInputFile {

    // Вывод исключений на консоль:
    public static String read(String filename) throws IOException {

        // Чтение по строкам:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;

        /**
         * StringBuilder - читает весь текст включая символы перехода на следующую строку
         * метод readlinr их отбрасывает
         */
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args)
            throws IOException {
        System.out.print(read("src\\examples\\ex04bufferedInputfile\\BufferedInputFile.java"));
    }
}