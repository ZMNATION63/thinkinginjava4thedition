package com.company.chapter05initializationandcompletion.examples.initmass;

import java.util.Arrays;
import java.util.Random;

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
}

class Scratch {
    public static void main(String[] args) {
        int[] al = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = al;
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for (int i = 0; i < al.length; i++) System.out.println("al[" + i + "] = " + al[i]);
        System.out.println("++++++++++++++++++++++");
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("flAMHa а = " + a.length);
        System.out.println(Arrays.toString(a));

        System.out.println("++++++++++++++++++++++");
        Random rand1 = new Random(47);
        Integer[] a1 = new Integer[rand1.nextInt(20)];
        System.out.println("AnnHa а = " + a1.length);
        for (int i = 0; i < a1.length; i++) {
            a1[i] = rand.nextInt(500); // Автоматическая упаковка print
            System.out.println(Arrays.toString(a1));
        }
        System.out.println("++++++++++++++++++++");
        Integer[] а = {new Integer(1), new Integer(2),
                3, // Autoboxing
        };
        Integer[] b = new Integer[]{new Integer(1), new Integer(2),
                3, // Автоматическая упаковка
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("+++++++++++++++++++");
        //Other.main(new String[]{ "fiddle", "de", "dum" });

    }
}
