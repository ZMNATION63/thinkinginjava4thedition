package com.company.chapter18javaio.examples.ex08fileoutputshortcut;


import com.company.chapter18javaio.examples.ex04bufferedInputfile.BufferedInputFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * появился вспомогательный конструктор, чтобы вам не приходилось явно проделывать все необходимое каждый раз,
 * когда вы захотите создать текстовый файл и записать в него информацию.
 */
public class FileOutputShortcut {
    static String file = "src\\examples\\ex08fileoutputshortcut\\FileOutputShortcut.out";

    public static void main(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("src\\examples\\ex08fileoutputshortcut\\FileOutputShortcut.java")));

        // Сокращенная запись:
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();

        // Вывод сохраненного файла:
        System.out.println(BufferedInputFile.read(file));
    }
}