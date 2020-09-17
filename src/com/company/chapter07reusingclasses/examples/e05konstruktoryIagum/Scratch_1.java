package com.company.chapter07reusingclasses.examples.e05konstruktoryIagum;

/**
 * Если не вызвать конструктор базового класса в BoardGame(), то компилятор «пожалуется» на то,
 * что не может обнаружить конструктор в форме Game(). Вдобавок, вызов
 * конструктора базового класса должен быть первой командой в конструкторе производного класса.
 * <p>
 * 6. (1) Используя пример Chess.java, докажите утверждения в предыдущем абзаце
 * У Game нет конструктора по умолчанию, соответственно без переопределения конструкторов дочерних
 * классов с явным указание что нужно вызывать тот конструктор который есть в родительском классе
 * не взлетит
 * <p>
 * 7. (1) Измените упражнение 5 так, чтобы классы А и B имели конструкторы с аргументами вместо
 * конструкторов по умолчанию. Напишите конструктор для класса С
 * и проведите всю необходимую инициализацию внутри него.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Chess x = new Chess(11);
    }
}