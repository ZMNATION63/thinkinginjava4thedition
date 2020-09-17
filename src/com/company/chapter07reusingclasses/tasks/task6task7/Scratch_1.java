package com.company.chapter07reusingclasses.tasks.task6task7;

/**
 * 6. (2) Создайте класс с именем A m p h ib ia n . Объявите производный от него класс с именем F ro g .
 * Разместите в базовом классе несколько методов. В методе m a in ( ) создайте
 * объект F r o g , преобразуйте его в A m p h ib ia n и продемонстрируйте, что все методы
 * работают.
 * 7. Измените упражнение 16 так, чтобы класс F r o g переопределял методы базового
 * класса (предоставляя новые определения с той же сигнатурой метода). Посмотрите,
 * что произойдет в методе m a in ( ) .
 */
class Scratch_1 {
    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian a = (Amphibian) f;
        a.sweem();
        a.jump();
    }

    static class Amphibian {
        protected void sweem() {
            System.out.println("Amphibian method");
        }

        private void jump() {
            System.out.println("Jump");
        }
    }

    static class Frog extends Amphibian {
        @Override
        protected void sweem() {
            System.out.println("Frog");
        }
    }
}