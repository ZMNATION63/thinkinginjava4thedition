package com.company.chapter14typeinformation.examples.ex01shapes;
/***
 * Пример показывает нам, что мы можем обобщить тип объекта и сложить его экземпляры в контейнер общего типа,
 * от которого оставшиеся были унаследованы
 *
 */

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());

        for (Shape shape : shapeList)
            shape.draw();
    }
}
