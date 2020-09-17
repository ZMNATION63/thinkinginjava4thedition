package com.company.chapter18javaio.examples.ex03makedirectories;//package examples.ex03makedirectories;

import java.io.File;

/**
 * Использование класса File для создания
 * каталогов и выполнения операций с файлами
 */
public class MakeDirectories {

    /**
     * выводит сообщение об ошибке
     */
    private static void usage() {
        System.err.println(
                "Usage:MakeDirectories pathl ...\n" +
                        "Creates each path\n" +
                        "Usage:MakeDirectories -d pathl ...\n" +
                        "Deletes each path\n" +
                        "Usage:MakeDirectories -r pathl path2\n" +
                        "Renames from pathl to path2");
        System.exit(1);
    }

    /**
     * выводит различную информацию о файле
     *
     * @param f
     */
    private static void fileData(File f) {
        System.out.println(
                "Absolute path: " + f.getAbsolutePath() +
                        "\n Can read: " + f.canRead() +
                        "\n Can write: " + f.canWrite() +
                        "\n getName: " + f.getName() +
                        "\n getParent: " + f.getParent() +
                        "\n getPath: " + f.getPath() +
                        "\n length: " + f.length() +
                        "\n lastModified: " + f.lastModified());
        if (f.isFile())
            System.out.println("It's а file");
        else if (f.isDirectory())
            System.out.println("It's а directory");
    }

    public static void main(String[] args) {
        if (args.length < 1) usage();
        if (args[0].equals("-r")) {
            if (args.length != 3) usage();
            File
                    old = new File(args[1]), rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return; // Выход из main
        }
        int count = 0;
        boolean del = false;
        if (args[0].equals("-d")) {
            count++;
            del = true;
        }
        count--;
        while (++count < args.length) {
            File f = new File(args[count]);
            if (f.exists()) {
                System.out.println(f + " exists");
                if (del) {
                    System.out.println("deleting..." + f);
                    f.delete();
                }
            } else { // Не существует
                if (!del) {
                    f.mkdirs();
                    System.out.println("created " + f);
                }
            }
            fileData(f);
        }
    }
}