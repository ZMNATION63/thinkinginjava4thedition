package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task18;

public class ThirdException extends Exception {
    public String toString() {
        return "Третье исключение";
    }

    void tird() throws ThirdException {
        throw new ThirdException();
    }
}
