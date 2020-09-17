package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task19;

public class LostMessage {


    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }


}
