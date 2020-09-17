package com.company.chapter05initializationandcompletion.examples.poryadokInicial;

/**
 * Демонстрирует порядок инициализации,
 * При вызове конструктора для созданияобъекта
 * Window вы водится сообщ ение:
 */
class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }

    static class House {
        Window wl = new Window(1); // Перед конструктором

        House() {// Показывает, что выполняется конструктор:
            System.out.println("HouseQ");
            w3 = new Window(33); // Повторная инициализация w3
        }

        Window w2 = new Window(2); // После конструктора

        void f() {
            System.out.println("f()");
        }

        Window w3 = new Window(3); // В конце
    }
}

class Scratch {
    public static void main(String[] args) {
        Window.House h = new Window.House();
        h.f(); // Показывает, что объект сконструирован
    }
}