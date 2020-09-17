package com.company.chapter18javaio.tasks.task05;

import com.company.chapter18javaio.examples.ex02directorydemo.Directory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 5. (1) Измените код ProcessFiles.java так, чтобы вместо фиксированного расширения поиск
 * осуществлялся по регулярному выражению.
 * <p>
 * 6. (5) Используйте ProcessFiles для поиска в заданном поддереве каталогов всех файлов с исходным кодом Java, измененных после конкретной даты.
 */
class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args) {
        try {
            if (args.length == 0) processDirectoryTree(new File("."));
            else
                for (String arg : args) {
                    File fileArg = new File(arg);
                    if (fileArg.isDirectory()) processDirectoryTree(fileArg);
                    else {
// Разрешить пользователю не указывать расширение: if(!arg.endsWith(".*' + ext)) arg += "." + ext; strategy.process(
                        new File(arg).getCanonicalFile();
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void
    processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(
                root.getAbsolutePath(), ".*\\." + ext))
            strategy.process(file.getCanonicalFile());
    }

    /**
     * измени регулярное выражение и получишь искомый результат
     */
    public static void main(String[] args) {
        String regex = "[^\\s]+";
        new ProcessFiles(new Strategy() {
            public void process(File file) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:S");
                Date lastmodilite = new Date(file.lastModified());
                Date etalonDate = new Date(new Date().getTime() - 209800000);
                if (lastmodilite.after(etalonDate))
                    System.out.println(file);
            }
        }, regex).start(args);
    }
}
