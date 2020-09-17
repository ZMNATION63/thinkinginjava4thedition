package com.company.chapter18javaio.examples.ex09storingandrecoveringdata;

import java.io.*;

/**
 * открывается файл, буферизованный как для чтения, так и для записи.
 * Надстройки DataOutputStream и DatalnputStream ориентированы на отправку байтов, поэтому для них потребуются
 * потоки OutputStream и lnputStream.
 */
public class StoringAndRecoveringData {
    public static void main(String[] args)
            throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src\\examples\\ex09storingandrecoveringdata\\Data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("src\\examples\\ex09storingandrecoveringdata\\Data.txt")));
        System.out.println(in.readDouble());

        // Только readUTF() правильно восстановит
        // объект String в кодировке UTF для 3ava:
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}