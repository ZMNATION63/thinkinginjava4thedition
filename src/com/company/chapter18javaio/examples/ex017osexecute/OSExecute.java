package com.company.chapter18javaio.examples.ex017osexecute;

import com.company.chapter18javaio.examples.ex016osexecuteexception.OSExecuteException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Для запуска программы методу OSExecute.command() передается строка command; в ней
 * указывается команда, которая бы использовалась для выполнения программы из консоли
 */
public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String s;

            while ((s = results.readLine()) != null)
                System.out.println(s);
            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));

            // Оповещение o6 ошибках и возврат ненулевого значения
            // вызывающему процессу при возникновении проблем:
            while ((s = errors.readLine()) != null) {
                System.err.println(s);
                err = true;
            }
        } catch (Exception e) {

            // Для системы Windows 2000, которая выдает
            // исключение для командной строки по умолчанию:
            if (!command.startsWith("CMD /С"))
                command("CMD /С " + command);
            else
                throw new RuntimeException(e);
        }
        if (err)
            throw new OSExecuteException("Errors executing " +
                    command);
    }
}
