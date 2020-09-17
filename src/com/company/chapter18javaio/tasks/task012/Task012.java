package com.company.chapter18javaio.tasks.task012;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 12. (3) Измените упражнение 8, чтобы оно также открывало текстовый файл для записи.
 * Запишите в файл строки из Linkedlist вместе с номерами строк (не пытайтесь
 * использовать классы LineNumber).
 */
public class Task012 {
    public static void main(String[] args) throws IOException {
        String path = "src\\tasks\\task07\\text.txt";
        String line;
        String temp;
        List<String> stringList = new ArrayList<>();
        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }

        System.out.println("Исходный List");
        System.out.println(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            temp = (i + 1) + " " + stringList.get(i);
            stringList.set(i, temp);
        }

        System.out.println(stringList);
    }
}
