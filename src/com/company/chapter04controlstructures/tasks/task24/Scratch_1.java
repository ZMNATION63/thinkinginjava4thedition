package com.company.chapter04controlstructures.tasks.task24;

import java.util.ArrayList;

/**
 * * 24. Вампирами называются числа, состоящие из четного количества цифр и полученные
 * * перемножением пары чисел, каждое из которых содержит половину цифр результата. Цифры
 * * берутся из исходного числа в произвольном порядке, завершающие
 * * нули недопустимы. Примеры:
 * * 1) 1261 =21 *60;
 * * 2) 1827 = 21 *87;
 * * 3) 2187 = 27*81.
 * * Напишите программу, которая находит всех «вампиров», состоящих из 4 цифр.
 * * (Задача предложена Дэном Форханом.)
 */
class Scratch_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> chisChe = new ArrayList<>();

        int start = 1260;
        for (int i = 0; i < 3; i++) {
            arrayList.add(start);
            start++;
        }

        chisla(arrayList, chisChe);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    static void chisla(ArrayList<Integer> vhodArr, ArrayList chislaVampiry) {
        ArrayList<Integer> razdelennoeChisloNaCifry = new ArrayList<>();
        int temp;

        for (int i = 0; i < vhodArr.size(); i++) {
            temp = vhodArr.get(i);
            while (temp != 0) {
                //Суммирование цифр числа
                razdelennoeChisloNaCifry.add(temp % 10);
                temp /= 10;
            }
        }

        for (int i = 0; i < razdelennoeChisloNaCifry.size(); i++) {
            System.out.print(razdelennoeChisloNaCifry.get(i) + " ");

        }
    }

    static ArrayList<Integer> razlojenye(int argument) {
        ArrayList<Integer> res = new ArrayList<>();
        return res;
    }
}