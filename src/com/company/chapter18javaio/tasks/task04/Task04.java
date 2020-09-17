package com.company.chapter18javaio.tasks.task04;

import com.company.chapter18javaio.examples.ex02directorydemo.Directory;

/**
 * 4. (2) Используйте вызов Directory.walk() для суммирования размеров всех файлов в дереве каталогов,
 * имена которых соответствуют заданному регулярному-выражению.
 */
public class Task04 {
    public static void main(String[] args) {
        String path = "C:\\Projects\\thinkinginjava4thedition2";
        Directory.TreeInfo a = Directory.walk(path);
        double size = 0;

        for (int i = 0; i < a.files.size(); i++) {
            size = size + a.files.get(i).length();
        }
        System.out.println((size / 1024) / 1024);
    }
}
