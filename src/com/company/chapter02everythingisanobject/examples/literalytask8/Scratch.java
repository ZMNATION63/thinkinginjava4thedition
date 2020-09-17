/***
 * 8. (2) Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться
 * с типом long. Для вывода результатов используйте метод Long.toBinaryString().
 */
package com.company.chapter02everythingisanobject.examples.literalytask8;

class Scratch {
    public static void main(String[] args) {
        int il = 0x2f; // Шестнадцатеричное (нижний регистр)
        System.out.println("il: " + Integer.toBinaryString(il));
        int i2 = 0X2F; // Шестнадцатеричное (верхний регистр)
        System.out.println("i2 : " + Integer.toBinaryString(i2));
        int i3 = 0177; // Восьмеричное (начинается с нуля)
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // макс, шестнадцатеричное знач. char
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // макс, шестнадцатеричное знач. byte
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // макс, шестнадцатеричное знач. short
        System.out.println("s: " + Integer.toBinaryString(s));
        long nl = 200L; // Суффикс, обозначающий long
        long n2 = 2001;// Суффикс, обозначающий long (можно запутаться)
        long n3 = 200;
        float fl = 1;
        float f2 = 1F;// Суффикс,обозначающий float
        float f3 = 1f;// Суффикс,обозначающий float
        double d1 = 1d;// Суффикс,обозначающий Double
        double d2 = 1D;// Суффикс,обозначающий Double

        long l8 = i2; //Восьмеричное (начинается с нуля)
        long l16 = i3; //16 (начинается с нуля)

        System.out.println("Восьмеричное = " + l8);
        System.out.println("Шестнадцатеричное = " + l16);


        float f4 = 1e-43f;//// десять в степени
    }
}/* Output:
il: 1 0 1 1 1 1
i2 : 1 0 1 1 1 1
i3: 1111111
с: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
b: 1 1 1 1 1 1 1
s: 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
*///:~