package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task19;

class VeryImportantException extends Exception {
    public String toString() {
        return "Очень важное исключение!";
    }
}