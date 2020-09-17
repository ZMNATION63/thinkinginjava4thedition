package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task18;
/*
 * 18. (3) Добавьте в LostMessage.java второй уровень потери исключений, чтобы исключение HoHumException само замещалось третьим исключением.
 * f() - очень важное
 * dispose() - Второстепенное исключение
 *  Третье исключение
 * */

class PoterynnoeIskl {
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } catch (Exception e) {
                    lm.dispose();
                }
            } catch (Exception e) {
                lm.tird();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

