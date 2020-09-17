package com.company.chapter02everythingisanobject.tasks.task11task12task13;

/***
 * (3) Начните с числа, содержащего двоичную 1 в старшем бите (подсказка: воспользуйтесь шестнадцатеричной константой).
 * Используя знаковый оператор сдвига
 * вправо, сдвигайте знак до крайней правой позиции, с выводом всех промежуточных
 * результатов методом lnteger.toBinaryString().
 *
 * 12. (3) Начните с числа, состоящего из двоичных единиц. Сдвиньте его влево, а затем
 * используйте беззнаковый оператор сдвига вправо по всем двоичным позициям,
 * с выводом всех промежуточных результатов методом lnteger.toBinaryString().
 *
 * 13. (1) Напишите метод для вывода char в двоичном представлении. Продемонстрируйте его работу на нескольких разных символах.
 *
 * public static final int GL_STACK_UNDERFLOW = 0x0504;
 * public static final int GL_OUT_OF_MEMORY = 0x0505;
 * public static final int GL_EXP = 0x0800;
 * public static final int GL_EXP2 = 0x0801;
 * public static final int GL_FOG_DENSITY = 0x0B62;
 * public static final int GL_FOG_START = 0x0B63;
 * public static final int GL_FOG_END = 0x0B64;
 * public static final int GL_FOG_MODE = 0x0B65;
 */
class Scratch_1 {
    public static void main(String[] args) {
        int i = 0x0800;
        String str = Integer.toBinaryString(i);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        //**
        // * (3) Начните с числа, содержащего двоичную 1 в старшем бите
        // * (подсказка: воспользуйтесь шестнадцатеричной константой). Используя знаковый оператор сдвига
        // *  вправо, сдвигайте знак до крайней правой позиции, с выводом всех промежуточных
        // *  результатов методом lnteger.toBinaryString().
        // */
        int temp = i;
        for (int j = 0; j < str.length(); j++) {
            System.out.println(Integer.toBinaryString(temp >>= 1) + " " + temp);
        }
        System.out.println("====================");
        /* 12. (3) Начните с числа, состоящего из двоичных единиц. Сдвиньте его влево, а затем
         * используйте беззнаковый оператор сдвига вправо по всем двоичным позициям,
         * с выводом всех промежуточных результатов методом lnteger.toBinaryString().
         *
         * */
        int k = 0x0B65;
        str = Integer.toBinaryString(k);
        for (int j = 0; j < str.length(); j++) {
            System.out.println(Integer.toBinaryString(k <<= 1) + "  " + k);
        }
        /*13. (1) Напишите метод для вывода char в двоичном представлении. Продемонстрируйте его работу на нескольких разных символах.
         * */
        System.out.println("====================");
        String st = "Привет, МИР!!!";
        char[] mas = st.toCharArray();
        charvDvoichnomVide(mas);
    }

    //Сама метод метод для вывода char в двоичном представлении
    static void charvDvoichnomVide(char[] array) {
        System.out.println("Вывод двоичного представления каждой буквы");
        int temp;

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            System.out.println("Буква " + array[i] + ", int представление буквы. " + temp +
                    " Бинарный вид буквы " + Integer.toBinaryString(temp));
        }
    }
}