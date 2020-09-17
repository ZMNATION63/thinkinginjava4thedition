package com.company.chapter19enumeratedtypes.examples.ex016bigenumset;

import java.util.EnumSet;

/**
 * А что произойдет, если перечисление содержит более 64 элементов?
 * у множества EnumSet нет проблем с перечислениями, содержащими более 64 элементов.
 * Можно предположить, что при необходимости оно добавляет другое значение long.
 */
public class BigEnumSet {
    enum Big {
        A0, A1, A2, АЗ, A4, A5, Аб, A7, A8, A9, A10,
        All, A12, Al3, A14, A15, A16, A17, A18, A19, A20, A21,
        A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32,
        A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43,
        A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54,
        A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, A65,
        Абб, A67, A68, A69, A70, A71, A72, A73, A74, A75
    }

    public static void main(String[] args) {
        EnumSet<Big> bigEnumSet = EnumSet.allOf(Big.class);
        System.out.println(bigEnumSet);
    }
}