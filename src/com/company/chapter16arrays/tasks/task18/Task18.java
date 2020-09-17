package com.company.chapter16arrays.tasks.task18;

/**
 * ДО. (3) Создайте и заполните массив объектов BerylliumSphere. Скопируйте его в новый
 * массив и продемонстрируйте, что копирование было поверхностным.
 */
public class Task18 {
    public static void main(String[] args) {
        BerylliumSphere[] a = new BerylliumSphere[10];
        BerylliumSphere[] b = new BerylliumSphere[10];

        for (int i = 0; i < a.length; i++) {
            if ((i % 2) == 0) {
                a[i] = new BerylliumSphere();
                b[i] = new BerylliumSphere();
            } else {
                b[i] = new BerylliumSphere();
                a[i] = new BerylliumSphere();
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        System.arraycopy(a, 0, b, b.length / 3, a.length / 2); //копируем в массив b[] начиная с 4-го элемента
        //половину массива a[]
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
