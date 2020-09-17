package com.company.chapter19enumeratedtypes.examples.ex01enumclass;

/**
 * Возможности класса Enum
 * При создании перечисления компилятор генерирует соответствующий класс. Этот класс автоматически наследует от класса java.
 * lang. Enum;
 * Метод ordinal() возвращает значение int, определяющее порядок объявления экземпляров перечисления начиная с нуля.
 * Экземпляры всегда можно безопасно сравнивать соператором ==,аметоды equals() и hashCode() автоматически создаютсяза вас.
 */
enum Shrubbery {GROUND, CRAWLING, HANGING}

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING) + " ");
            System.out.println(s.equals(Shrubbery.CRAWLING) + " ");
            System.out.println(s == Shrubbery.CRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println(".......................");
        }

// Получить значение из перечисления по строковому имени:
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrub);
        }
    }
}
