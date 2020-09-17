package com.company.chapter13strings.tasks.task5;

import java.util.Formatter;

/**
 * 5. (5) Для каждого базового типа преобразования в приведенной таблице напишите
 * самое сложное из возможных выражений форматирования. Другими словами, используйте
 * все возможные форматные спецификаторы, доступные для этого типа преобразования
 */
public class Task5 {
    public static void main(String[] args) {
        Formatter f = new Formatter(); // объявление объекта
        // форматирование текста по формату %S, %c
        f.format("This %s is about %n%S %c", "book", "java", '6');
        System.out.print(f);
        // выравнивание вправо
        f.format("|%30.2f|", 123.123);
        System.out.println(f);
        // выравнивание влево
        // применение флага ‘-‘
        f = new Formatter();
        f.format("|%-10.2f|", 123.123); //Выравнивание по правому краю
        System.out.println(f);
        f = new Formatter();
        f.format("% (d", -1000);

        // применение флага ‘ ‘ и ‘(‘
        System.out.println(f);
        f = new Formatter();
        f.format("%,.4f", 123456789.3455);

        // применение флага ‘,’
        System.out.println(f);
        f = new Formatter();
        f.format("%.2f", 1111.1111111);

        // задание точности представления для чисел
        System.out.println(f);
        f = new Formatter();
        f.format("|%30.16s|", "Now I know class java.util.Formatter");
        // задание точности представления для строк
        System.out.println(f);
        f = new Formatter();
        f.format("|%10.6h|", "Now I know class java.util.Formatter");
        System.out.println(f);

        f = new Formatter();
        f.format("|%10x|", 100500);
        System.out.println(f);

        f = new Formatter();
        f.format("|%-10.4f|", 100.500); //выравнивание по левому краю
        System.out.println(f);

        f = new Formatter();
        f.format("|%b|", 100.500); //выравнивание по левому краю
        System.out.println(f);
    }
}
