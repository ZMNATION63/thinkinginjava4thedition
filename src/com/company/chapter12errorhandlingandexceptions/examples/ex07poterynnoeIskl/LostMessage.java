package com.company.chapter12errorhandlingandexceptions.examples.ex07poterynnoeIskl;

public class LostMessage {


    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }


}
