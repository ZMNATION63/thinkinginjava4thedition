package com.company.chapter06accesscontrol.examples.e01;
/*создаем новый пакет в него запихиваем новые кдлассыы
*
* 1. (1) Определите класс в пакете. Создайте экземпляр класса за пределами пакета.
*
* 2. (2) Преобразуйте фрагменты из этого раздела в программу. Убедитесь в том, что
конфликты имен действительно возникают.
*
*3. (2) Создайте два пакета debug и debugoff, содержащие одинаковые классы с методом
debug(). Первая версия выводит на консоль свой аргумент типа String, вторая не
делает ничего. Используйте директиву static import для импортирования класса
в тестовую программу и продемонстрируйте эффект условной компиляции
* */

import java.util.Vector;
//import static com.company.Examples.pac1.Debug;
//import static com.company.Examples.pac2.Debug;

class Scratch_1 {
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();//пример 01 стр 188 показывает прямой вызов класса
        //демострация решения проблемы конфликта имен
        Vector v = new Vector();
        java.util.Vector ve = new java.util.Vector();
        //пользовательские библиотеки стр 194
        System.out.println("+++++++++++");
        System.out.println("Tenepb это стало возможно!");
        System.out.println(100);
        System.out.println(100L);
        System.out.println(3.14159);
        System.out.println("+++++++++++");
    }
}