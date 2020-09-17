package com.company.chapter08polymorphism.examples.e09povedeniepolimorfnyhmetodovizkonstr;

public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        this.draw();
        System.out.println("Glyph() после вызова draw()");
    }
}
