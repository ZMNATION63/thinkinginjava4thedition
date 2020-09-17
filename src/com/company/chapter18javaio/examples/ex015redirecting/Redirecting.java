package com.company.chapter18javaio.examples.ex015redirecting;

import java.io.*;

/**
 * Эта программа присоединяет стандартный ввод к файлу и перенаправляет стандартный
 * ввод и поток для ошибок в другие файлы. Обратите внимание на то, как исходный
 * объект System.out сохраняется в начале программы и восстанавливается перед ее завершением
 * Перенаправление стандартного ввода-вывода основано на байтовом вводе/выводе
 * <p>
 * проблем с кодировкой не возникает
 */
public class Redirecting {
    public static void main(String[] args)
            throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("src\\examples\\ex015redirecting\\Redirecting.java"));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("src\\examples\\ex015redirecting\\test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close(); // Не забудьте!
        System.setOut(console);
    }
}