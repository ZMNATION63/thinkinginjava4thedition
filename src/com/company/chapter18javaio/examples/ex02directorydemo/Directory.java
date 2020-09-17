package com.company.chapter18javaio.examples.ex02directorydemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Читает директорию
 * создает 2 списка, файлы и директории
 * Использует анонимный класс
 */
public final class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[]

    local(String path, final String regex) {
        return local(new File(path), regex);
    }

    // Кортеж для возвращения пары объектов:
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        // The default iterable element is the file list:
        public Iterator<File> iterator() {
            return files.iterator();
        }

        /**
         * добавляет все элементы в поля класса
         *
         * @param other
         */
        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    public static TreeInfo
    walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo
    walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    /**
     * @param start
     * @return
     */
    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    /**
     * Проход по дереву каталогов с добавлением в списки файлов и диреткорий
     * тип списков File
     *
     * @param startDir
     * @param regex
     * @return TreeInfo
     */
    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else //  файл
                if (item.getName().matches(regex)) result.files.add(item);
        }
        return result;
    }

    // Простая проверка:
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println(walk("."));
        else
            for (String arg : args)
                System.out.println(walk(arg));
    }
}