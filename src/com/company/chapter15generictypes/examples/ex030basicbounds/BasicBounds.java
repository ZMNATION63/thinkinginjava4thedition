package com.company.chapter15generictypes.examples.ex030basicbounds;

/**
 * Holdltem просто хранит объект; это поведение наследуется классом Colored2, который
 * также требует, чтобы его параметр реализовал HasColor. ColoredDimension2 и Solid2
 * расширяют иерархию и добавляют ограничения на каждом уровне.
 */
interface HasColor {
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    // Ограничение позволяет вызвать метод:
    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

// Не работает -- сначала должен быть указан класс, затем интерфейсы:
// class ColoredDimension<T extends HasColor & Dimension> {
// Множественные ограничения:
class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    ColoredDimension(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

// Как и в случае с наследованием, можно указать только один
// конкретный класс, но несколько интерфейсов:
class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor, Weight {
    public java.awt.Color getColor() {
        return null;
    }

    public int weight() {
        return 0;
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}