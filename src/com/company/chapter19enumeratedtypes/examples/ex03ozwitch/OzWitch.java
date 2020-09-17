package com.company.chapter19enumeratedtypes.examples.ex03ozwitch;

/**
 * Пример показывает возмоность вызова метода из перечисления
 * по правиriaMjava перечисление должно начинаться с определения экземпляров. При попытке
 * определить их после методов или полей компилятор выдает ошибку.
 */
public enum OzWitch {
    // Определения экземпляров должны предшествовать
    // определениям методов:
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
            "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;

    // Конструктор должен быть объявлен закрытым
    // или с доступом уровня пакета:
    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values())
            System.out.println(witch + ": " + witch.getDescription());
    }
}