package com.company.chapter10innerclasses.tasks.task7;

/**
 * 7. (2) Создайте класс, содержащий закрытое поле и закрытый метод.
 * Создайте внутренний класс с методом, который изменяет поле внешнего класса и вызывает метод
 * внешнего класса.
 * <p>
 * Во втором методе внешнего класса создайте объект внутреннего
 * класса и вызовите его метод; продемонстрируйте эффект на объекте внешнего класса
 * <p>
 * 8. (2) Проверьте, доступны ли для внешнего класса закрытые элементы внутреннего
 * класса
 */
class Scratch {
    static class Outer {
        private String closedPole;

        class Inner {
            private String privateInnerPole = "Закрытое поле внутреннего класса";

            public void changeProvateString() {
                closedPole = "Измененное private closedPole методом внуреннего класса";
            }
        }

        private void metod() {
            System.out.println("Private method class Outer");
        }

        public String getClosedPole() {
            return closedPole;
        }

        public void setClosedPole(String closedPole) {
            this.closedPole = closedPole;
        }

//        void setPrivateInnerPole(String s){
//            privateInnerPole = "";
//        }

        Inner makeInner() {
            Inner inner = new Inner();
            inner.changeProvateString();
            return inner;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.setClosedPole("private closedPole, задано сеттером.");
        System.out.println(outer.getClosedPole());
        outer.metod();
        Outer.Inner inner = outer.makeInner();
        inner.changeProvateString();
        System.out.println(outer.getClosedPole());
        //outer.privateInnerPole
    }
}