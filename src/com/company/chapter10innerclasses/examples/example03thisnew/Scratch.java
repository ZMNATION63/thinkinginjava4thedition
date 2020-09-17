package com.company.chapter10innerclasses.examples.example03thisnew;

/**
 * Если вам потребуется получить ссылку на объект внешнего класса, укажите имя
 * внешнего класса с точкой и .this
 * Полученная ссылка автоматически относится к правильному типу, который известен и проверяется во время компиляции, не требуя
 * лишних затрат ресурсов во время выполнения.
 */
class Scratch {
    public static class DotThis {
        void f() {
            System.out.println("DotThis.f()");
        }

        public class Inner {
            public DotThis outer() {
                return DotThis.this;
//"this"безуточнениясоответствуетобъектуlnner
            }
        }

        Inner inner() {
            return new Inner();
        }

        public static void main(String[] args) {
            DotThis dt = new DotThis();
            DotThis.Inner dti = dt.inner();
            dti.outer().f();

            DotThis dn = new DotThis();
            DotThis.Inner dni = dn.new Inner();
            /**
             * Для непосредственного создания объекта внутреннего класса указывается не имя
             * внешнего класса DotNew, как можно было бы ожидать, а объект внешнего класса
             */
        }
    }/*Output:
DotThis.f()
*///:
}