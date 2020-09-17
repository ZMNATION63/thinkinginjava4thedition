package com.company.chapter18javaio.examples.ex010usingrandomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Работасклассом RandomAccessFile напоминает использование комбинации Datalnputstream и DataOutputStream
 * потому что он реализует те же интерфейсы: DataInput и DataOutput
 * У класса RandomAccessFile имеются специализированные
 * методы для записи и чтения примитивов и строк UTF-8.
 * <p>
 * RandomAccessFile практически ничем не связан с иерархией библиотеки ввода-вывода Java, если не считать реализации интерфейсов
 * Datalnput и DataOutput..
 */
public class UsingRandomAccessFile {
    static String file = "src\\examples\\ex010usingrandomaccessfile\\rtest.dat";

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 7; i++)
            System.out.println(
                    "Value " + i + ": " + rf.readDouble());
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args)
            throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for (int i = 0; i < 7; i++)
            rf.writeDouble(i * 1.414);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5 * 8);
//        rf.seek(0);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
