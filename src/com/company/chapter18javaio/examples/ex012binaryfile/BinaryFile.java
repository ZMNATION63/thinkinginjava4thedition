package com.company.chapter18javaio.examples.ex012binaryfile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Один перегруженный метод получает аргумент File; во втором передается имя файла
 * (аргумент String). Оба метода возвращают полученный массив байтов.
 * Метод available() возвращает размер массива, а эта перегруженная версия метода
 * read() заполняет массив
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(
                new FileInputStream(bFile));
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        } finally {
            bf.close();
        }
    }

    public static byte[]
    read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }
}
