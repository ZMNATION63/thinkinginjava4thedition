package com.company.chapter03operators.examples.operplusiIplusravnoforstring;

/**
 * Использование + и += для строк (String) имеет интересные особенности.
 * Если выражение начинается строкой, то все последующие операнды также должны бытьстроками
 * (помните, что компилятор превращает символы в кавычках в объект String).
 */
class Scratch_1 {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, у, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s); // Преобразует x в String
        s += "(summed) = "; // Оператор конкатенации
        System.out.println(s + (x + y + z));
        System.out.println("" + x); // Сокращение для Integer.toString()
    }
}/* Output:
хл у, z 012
0 X, у, z
x, у, z (summed) = 3
0
*///:~