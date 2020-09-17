package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task18;

class HoHumException extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }


}