package com.company.chapter18javaio.examples.ex02directorydemo;

import java.io.File;

import static jdk.nashorn.internal.objects.Global.print;

//import net.mindview.util.*;

/**
 * DirectoryDemo.java
 * Пример использования вспомогательного класса Directory.
 * применяются регулярне выражения для выборки элементов
 */
public class DirectoryDemo {
    public static void main(String[] args) {

        // Все каталоги
        System.out.println(Directory.walk(".").dirs);

        // Все файлы, имена которых начинаются с 'T'
        for (File file : Directory.local(".", "T."))
            print(file);
        System.out.println("----------------------");

        // Все файлы Java, имена которых начинаются с 'T' расширение java
        for (File file : Directory.walk(".", "T.*\\.java")) print(file);
        print("======================");

        // Файлы классов, имена которых содержат "2" или "z":
        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) print(file);
    }
}
