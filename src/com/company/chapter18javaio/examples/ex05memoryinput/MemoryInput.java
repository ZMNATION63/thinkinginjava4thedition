package com.company.chapter18javaio.examples.ex05memoryinput;//package examples.ex05memoryinput;

import com.company.chapter18javaio.examples.ex04bufferedInputfile.BufferedInputFile;

import java.io.IOException;
import java.io.StringReader;

/**
 * Чтение из памяти
 * В этом примере результат String из BufferedInputFile.read() используется для создания класса StringReader.
 * После этого символы читаются методом read(), и каждый следующий символ посылается на консоль.
 */
public class MemoryInput {
    public static void main(String[] args)
            throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src\\examples\\ex05memoryinput\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}
