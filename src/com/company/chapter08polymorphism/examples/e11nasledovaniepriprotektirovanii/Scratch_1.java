package com.company.chapter08polymorphism.examples.e11nasledovaniepriprotektirovanii;

/**
 * // Динамическое изменение поведения объекта
 * // с помощью композиций (паттерн проектирования "Состояние”)
 * Унаследованные классы принадлежат к более широким типам родительских классо
 */
class Scratch_1 {
    public static void main(String[] args) {
        Stage stage = new Stage(); //Создали приватного Счастливого актера
        stage.performPlay(); //Вывели через переопределенный метод, Acter.act() класса HappyActer состояние
        stage.change(); // Заменили на новый объект - Грустный актер
        stage.performPlay();//Вывели через переопределенный метод, Acter.act() класса ЫфвActer состояние
    }
}