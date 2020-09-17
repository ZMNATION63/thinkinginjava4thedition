package com.company.chapter18javaio.tasks.task02;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. (2) Создайте класс с именем SortedDirList, конструктор которого принимает информацию о пути к файлу и на основе
 * этой информации составляет отсортированный список файлов в указанном каталоге.
 * Создайте два перегруженных  метода list (), один должен возвращать весь список файлов,
 * другой — подмножество списка, соответствующее аргументу (регулярное выражение).
 */
public class SortedDirList {
    String path;
    List<String> pathList;
    List<String> sublist;

    public SortedDirList(String path) {
        this.path = path;
        this.pathList = list(path);
        Collections.sort(this.pathList);
    }

    public List<String> list(String path) {
        File dir = new File(path); //path указывает на директорию
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        List<String> res = new ArrayList<>();

        for (File f : lst) {
            res.add(f.getName());
        }
        return res;
    }

    public List<String> list(String path, String mask) {
        List<String> res = new ArrayList<>();
        this.pathList = list(path);
        this.sublist = new ArrayList<String>();
        Pattern pattern = Pattern.compile(mask);
        for (String s : this.pathList) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String temp = matcher.group();
                this.sublist.add(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String path = "C:\\Projects\\thinkinginjava4thedition2";
        SortedDirList sortedDirList = new SortedDirList(path);
        System.out.println(sortedDirList.pathList);
        sortedDirList.list(path, "Ch(\\w*)");
        System.out.println(sortedDirList.sublist);
    }
}
