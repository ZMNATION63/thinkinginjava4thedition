package com.company.chapter18javaio.examples.ex06formattedmemoryinput;

import com.company.chapter18javaio.examples.ex04bufferedInputfile.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Для чтения «форматированных» данных применяется класс DatalnputStream, ориентированный
 * на ввод-вывод байтов (а не символов). Это вынуждает нас работать с классами
 * иерархии lnputstream, а не их аналогов на основе класса. Можно прочитать все что угодно
 * (например, файл) в виде байтов через lnputstream
 * кодировка чтения Unicode
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read(
                                    "src\\examples\\ex06formattedmemoryinput\\FormattedMemoryInput.java").getBytes()));
            while (true)
                System.out.print((char) in.readByte());
        } catch (IOException e) {
            System.err.println("End of stream");
        }
    }
}
