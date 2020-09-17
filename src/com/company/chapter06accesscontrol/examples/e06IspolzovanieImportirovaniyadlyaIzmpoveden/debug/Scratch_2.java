package com.company.chapter06accesscontrol.examples.e06IspolzovanieImportirovaniyadlyaIzmpoveden.debug;

/**
 * (2) Создайте два пакета debug и debugoff, содержащие одинаковые классы с методом
 * debug(). Первая версия выводит на консоль свой аргумент типа String, вторая не
 * делает ничего. Используйте директиву static import для импортирования класса
 * в тестовую программу и продемонстрируйте эффект условной компиляции.
 * стр 196
 */

class Scratch_2 {
    public static void main(String[] args) {
        Debug1 debug1 = new Debug1();

        Debug1 debugOff =
                new Debug1();

        debug1.debug();
        debugOff.debug();

    }
}