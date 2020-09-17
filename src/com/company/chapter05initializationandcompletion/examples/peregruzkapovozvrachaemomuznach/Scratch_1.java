package com.company.chapter05initializationandcompletion.examples.peregruzkapovozvrachaemomuznach;

/**
 * 3. (1) Создайте класс с конструктором по умолчанию (без параметров), который выводит на экран сообщение.
 * Создайте объект этого класса.
 * <p>
 * 4. Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий
 * в качестве параметра строку (String) и распечатывающий ее вместе с сообщением.
 */
class Scratch_1 {
    public static void main(String[] args) {
        new Bird2();
        System.out.println();
        System.out.println(new Bird2("2. ").strBird);
    }
}