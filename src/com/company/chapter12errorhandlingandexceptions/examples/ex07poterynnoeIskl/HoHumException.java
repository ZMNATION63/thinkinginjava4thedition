package com.company.chapter12errorhandlingandexceptions.examples.ex07poterynnoeIskl;

class HoHumException extends Exception {
    public String toString() {
        return "Второстепенное исключение";
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }


}