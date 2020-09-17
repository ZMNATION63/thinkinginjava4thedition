package com.company.chapter17containerdetails.tasks.task01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. (2) Создайте инициализатор Collection , который открывает файл и разбивает его
 * на слова при помощи TextFile , после чего использует слова как источник данных
 * для Collection . Покажите, что ваше решение работает.
 */
public class Task1d {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("src/files/textfile.txt")) {

            ArrayList<String> fileDataSet = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                fileDataSet.add(scanner.nextLine());
            }

            for (String c : fileDataSet) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}