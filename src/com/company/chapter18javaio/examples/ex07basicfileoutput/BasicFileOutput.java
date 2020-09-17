package com.company.chapter18javaio.examples.ex07basicfileoutput;

import com.company.chapter18javaio.examples.ex04bufferedInputfile.BufferedInputFile;

import java.io.*;

/**
 * Объект FileWriter записывает данные в файл. Буферизация применяется при вводе/
 * выводе практически всегда (попробуйте прочитать файл без нее, и вы увидите,
 * насколько ее отсутствие влияет на производительность — скорость чтения уменьшится в несколько раз),
 * поэтому мы декорируем его в BufferedWriter. После этого подключается
 * PrintWriter, чтобы выполнять форматированный вывод. Ф айлсданны ми, созданный
 * такой конфигурацией ввода-вывода, можно прочитать как обычный текстовый файл
 */
public class BasicFileOutput {
    static String file = "src\\examples\\ex07basicfileoutput\\BasicFileOutput.out";

    public static void main(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("src\\examples\\ex07basicfileoutput\\BasicFileOutput.out")));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();

        // Вывод сохраненного файла:
        System.out.println(BufferedInputFile.read(file));
    }
}