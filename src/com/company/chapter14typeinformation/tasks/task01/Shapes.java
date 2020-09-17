package com.company.chapter14typeinformation.tasks.task01;
/**
 * 3. (2) Добавьте класс Rhomboid в иерархию Shapes.java. Создайте объект Rhomboid, выполните восходящее
 * преобразование его в Shape, а затем снова верните его к классу Rhomboid нисходящим преобразованием.
 * Попробуйте выполнить нисходящее преобразование к Circle и объясните, что при этом происходит.
 * <p>
 * 4. (3) Измените предыдущий пример так, чтобы перед нисходящим преобразованием
 * в нем использовался оператор instanceof для проверки типа.
 * <p>
 * 5. (3) Реализуйте в Shapes.java метод rotate(Shape), который проверяет, не относится
 * ли фигура к классу Circle (и если относится — не выполняет ли операцию).
 * <p>
 * 6. (4) Измените пример Shapes.java так, чтобы он мог «выделять» (установкой внутреннего флага)
 * все фигуры некоторого типа. Метод toString() каждого класса, производного от Shape, должен указывать,
 * находится ли данная фигура в «выделенном» состоянии.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(),
                new Rhomboid(), new Circle());

        for (Shape shape : shapeList) {
            if (shape instanceof Circle) {
                shape.markClass = true;
                shape.rotate(shape);
                System.out.print("Нисходящее преобразование к классу: ");
                System.out.println((Circle) shape);
            }
        }
        System.out.println("");
        List<Circle> circle = new ArrayList<>();
        for (Shape shape : shapeList) {
            if (shape instanceof Circle) {
                shape.markClass = true;
                circle.add((Circle) shape);
            }
        }
//        for (int i = 0; i < circle.size(); i++) {
//            System.out.println("Параметр markClass класса Circle" + circle.get(i).markClass);
//        }
        //получаетсяч нисходящее преобраование только для элемента контейнера, который являетсся экземпляром
        //класса к которому мы хотим преобразовать
        for (Shape shape : shapeList) {
//            System.out.println(shape.markClass);
            shape.toString();
            shape.draw();
        }
    }
}
