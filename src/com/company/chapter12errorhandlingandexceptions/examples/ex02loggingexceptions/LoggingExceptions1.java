package com.company.chapter12errorhandlingandexceptions.examples.ex02loggingexceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


public class LoggingExceptions1 {
    public static class LoggingExceptions extends Exception {
        private static Logger logger =
                Logger.getLogger("LoggingException");

        public LoggingExceptions() {
            StringWriter trace = new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }

    }

    public static void main(String[] args) {
        try {
            throw new LoggingExceptions();
        } catch (LoggingExceptions e) {
            System.err.println("Перехвачено " + e);
        }
        try {
            throw new LoggingExceptions();
        } catch (LoggingExceptions e) {
            System.err.println("Перехвачено " + e);
        }
    }
}
/**
 * Статический метод Logger.getLogger() создает объект Logger, связанный с аргументом String (обычно это имя пакета и класс, к которому относится ошибка), который
 * направляет результат в System.err. Простейший способ вывести данные в Logger заключается в вызове метода, соответствующего уровню регистрируемого сообщения;
 * в нашем примере используется метод severe().
 */