package com.company.chapter16arrays.tasks.task1920;

//import javax.xml.catalog.GroupEntry;

/**
 * 19. (2) Создайте класс с полем int, инициализируемым по аргументу конструктора.
 * Создайте два массива таких объектов, используя идентичные значенигя инициализации для каждоо
 * массива, и покажите, что по мнению Arrays.equals() они не
 * равны. Добавьте в класс метод equals() для решения проблемы.
 * <p>
 * 20. (4) Продемонстрируйте работу deepEquals() для многомерных массивов.
 */
public class Task1920 {

    static class ArrayE {
        private long id;

        public String toString() {
            return "Sphere " + id;
        }

        ArrayE() {
            id = 1;
        }

        public boolean equals(ArrayE arrayE) {
            boolean result = false;
            if (arrayE.id == this.id)
                result = true;
            return result;
        }

        public static boolean equals(ArrayE[] z, ArrayE[] x) throws NullPointerException {
            boolean res = true;
            if (z.length == x.length) {
                for (int i = 0; i < z.length; i++) {
                    if (z[i].equals(x[i])) {
                        res = true;

                    } else {
                        res = false;
                        return res;
                    }
                }
            }
            return res;
        }

    }

    public static void main(String[] args) {
        ArrayE[] a = new ArrayE[10];
        ArrayE[] b = new ArrayE[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = new ArrayE();
            b[i] = new ArrayE();
        }

        //закоментируй строку ниже и увидишь разницу
//        b[1].id = 21;
        System.out.println(a[1].equals(b[1]));

        System.out.println(ArrayE.equals(a, b));
    }
}
