package com.company.chapter12errorhandlingandexceptions.tasks.task1819.task19;
/*
 *   19. (2) Исправьте недостаток LostMessage.java, защитив вызов в блоке finally.
 *
 * */

class PoterynnoeIskl {
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();//потеряли исключеине которое создается в этом методе,
                //увидили что создается исключение и не пошли смотреть, а что же оно выполняет
                //по сути нужно обрабатывать исключения в методах где они моогут появиться, самый крайний вариант
                //Обработка в main методе, но здесь можно попасть в эту ситуацию и долго понимать в чем дело
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

