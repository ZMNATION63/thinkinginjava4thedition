package com.company.chapter05initializationandcompletion.examples.usloviegotovnosty;

/**
 * Использование finalize() для выявления объекта,
 * не осуществившего необходимой финализации.
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Ошибка: checkedOut");
    }
}

class Scratch {
    public static void main(String[] args) {
        Book novel = new Book(true);
// Правильная очистка:
        novel.checkIn();
// Теряем ссылку, забыли про очистку:
        new Book(true);
// Принудительная уборка мусора и финализация:
        System.gc();
    }
}
/**
 * Ошибка: checkedOut
 */
