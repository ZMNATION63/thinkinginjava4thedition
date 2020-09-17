/*
package tasks.task01;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

*/
/**
 * 1. (3) Измените программу DirList.java (или одну из ее разновидностей) так, чтобы
 * объект FilenameFilter открывал и читал каждый файл (с использованием класса
 * net.mindview.util.TextFile) и принимал файл на основании того, присутствуют ли
 * в этом файле аргументы командной строки.
 *//*

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        
        if (args.length == 9) list = path.list();
        else
            list = path.list(new DirFilter(args[0]));

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String dirItem : list)
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}*/
