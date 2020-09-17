package com.company.chapter12errorhandlingandexceptions.examples.ex02loggingexceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogException2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());

    }

    public static void main(String[] args) {
        try {
            logger.log(Level.WARNING, "Начало main, создаем лист с типизацией Integers");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
