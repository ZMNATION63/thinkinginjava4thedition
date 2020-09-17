package com.company.chapter07reusingclasses.examples.e08obespecheniepravilnogazavershenya;

/**
 * Все в этой системе является некоторой разновидностью класса Shape (который, в свою
 * очередь, неявно наследует от корневого Knaccaobject). Каждый класс переопределяет
 * метод dispose() класса Shape, вызывая при этом версию метода из базового класса
 * с помощью ключевого слова super. Все конкретные классы, унаследованные от Shape, —
 * Circle, Triangle и Line, имеют конструкторы, которые просто выводят сообщение,
 * хотя во время жизни объекта любой метод может сделать что-то, требующее очистки.
 * В каждом классе есть свой собственный метод dispose(),
 * Обеспечение необходимого завершения
 */
class Scratch_2 {
    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            // Код и обработка исключений...
        } finally {
            x.dispose();
        }
    }
}