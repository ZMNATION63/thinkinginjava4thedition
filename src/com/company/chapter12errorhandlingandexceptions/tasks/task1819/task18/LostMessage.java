package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task18;

public class LostMessage {

    void tird() throws ThirdException {//Третье исключение
        throw new ThirdException();
    }

    void f() throws VeryImportantException { //Очень важное исключение!
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException { //Второстепенное исключение
        throw new HoHumException();
    }
}
