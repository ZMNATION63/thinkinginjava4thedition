package com.company.chapter03operators.examples.porazryadnyeoperatorytask10;

/**
 * /***10. (3) Напишите программу с двумя константами: обе константы состоят из чередующихся нулей
 * и единиц, но у одной нулю равен младший бит, а у другой старший
 * подсказка: константы проще всего определить в шестнадцатеричном виде). Объедините эти две
 * константы всеми возможными поразрядными операторами. Для
 * вывода результатов используйте метод Integer.toBinaryString()
 * package com.company.Examples.MatemOperatory;
 * 0110001011 - крайний левый старший баит, крайний правый младший бит
 * 1010101010
 * ~	Побитовый унарный оператор NOT
 * &	Побитовый AND
 * &=	Побитовый AND с присваиванием
 * |	Побитовый OR
 * |=	Побитовый OR с присваиванием
 * ^	Побитовый исключающее OR
 * ^=	Побитовый исключающее OR с присваиванием
 * >>	Сдвиг вправо
 * >>=	Сдвиг вправо с присваиванием
 * >>>	Сдвиг вправо с заполнением нулями
 * <<	Сдвиг влево
 * <<=	Сдвиг влево с присваиванием
 * >>>=	Сдвиг вправо с заполнением нулями с присваиванием
 */
class Scratch_1 {
    public static void main(String[] args) {
        int m = 0x0504;
        int s = 0x0505;
        System.out.println("Значение i " + m);
        System.out.println("Значение i " + s);

        binOpera(m, s);

    }

    static void binOpera(int i, int z) {
        int tempI = i;
        int tempZ = z;
        tempI = i;
        tempZ = z;
        System.out.println("Вывод в двоичном виде исходного значения i " + Integer.toBinaryString(tempI));
        tempI = i;
        tempZ = z;
        System.out.println("Вывод в двоичном виде исходного значения z " + Integer.toBinaryString(tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый унарный оператор NOT " + Integer.toBinaryString(~tempI));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый унарный оператор NOT " + Integer.toBinaryString(~tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый AND " + Integer.toBinaryString(tempI & tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый AND с присваиванием " + Integer.toBinaryString(tempI &= tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый OR " + Integer.toBinaryString(tempI | tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый OR с присваиванием " + Integer.toBinaryString(tempI |= tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый исключающее OR " + Integer.toBinaryString((tempI ^ tempZ)));
        tempI = i;
        tempZ = z;
        System.out.println("Побитовый исключающее OR с присваиванием " + Integer.toBinaryString(tempI ^= tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг вправо " + Integer.toBinaryString(tempI ^ tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг вправо с присваиванием " + Integer.toBinaryString(tempI >>= tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг вправо с заполнением нулями " + Integer.toBinaryString(tempI >>> tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг влево " + Integer.toBinaryString(tempI << tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг влево с присваиванием " + Integer.toBinaryString(tempI <<= tempZ));
        tempI = i;
        tempZ = z;
        System.out.println("Сдвиг вправо с заполнением нулями с присваиванием " + Integer.toBinaryString(tempI >>>= tempZ));
    }

}