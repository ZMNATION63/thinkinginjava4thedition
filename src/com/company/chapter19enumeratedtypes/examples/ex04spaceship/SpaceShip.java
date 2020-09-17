package com.company.chapter19enumeratedtypes.examples.ex04spaceship;

/**
 * занятный способ приведения к строке вывода данных
 * понравился пособ id.char(0) + lower;
 * использоваться имена экземпляров, отформатированные для удобства чтения.
 *
 * @return
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip s : values()) {
            System.out.println(s);
        }
    }
}