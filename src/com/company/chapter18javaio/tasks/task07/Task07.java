package com.company.chapter18javaio.tasks.task07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 7. (2) Откройте текстовый файл для построчного чтения. Считывайте из него строки
 * в объект String, который затем помещается в LinkedList. Выведите все строки в обратном порядке средствами класса LinkedList.
 * <p>
 * 8. (1) Измените упражнение 7 так, чтобы имя файла с обрабатываемым текстом передавалось в командной строке
 * <p>
 * 9. (1) Измените упражнение 8 так, чтобы буквы во всех прочитанных строках
 * преобразовывались к верхнему регистру Направьте результат в «устройство» стандартного вывода System.out.
 */
public class Task07 {
    public static void main(String[] args) throws IOException {
        String path = "src\\tasks\\task07\\";
        String line;
        String temp;
        List<String> stringList = new ArrayList<>();
        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя файла для чтения: ");
        path = path + readFileName.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }

        Collections.reverse(stringList);

        List<String> stringList1 = new ArrayList<>(stringList);
        for (int i = 0; i < stringList1.size(); i++) {
            temp = stringList1.get(i).toLowerCase();
            stringList1.set(i, temp);
        }

        System.out.println("Исходный List");
        System.out.println(stringList);

        System.out.println("Модифицированный List");
        System.out.println(stringList1);

        System.out.print("Введите текст для поиска:");

    }
}
