package com.company.chapter07reusingclasses.examples.e014neizmenyaemieargumenty;

/**
 * Java позволяет вам объявлять неизменными аргументы метода, с помощью ключевого
 * слова final в списке аргументов. Это значит, что метод не может изменить значение
 * Использование final с аргументами метода.
 */
class Scratch_2 {
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
/**
 * Методы f() и g() показывают, что происходит при передаче методу примитивов
 * с пометкой final: их значение можно прочитать, но изменить его не удастся
 */
