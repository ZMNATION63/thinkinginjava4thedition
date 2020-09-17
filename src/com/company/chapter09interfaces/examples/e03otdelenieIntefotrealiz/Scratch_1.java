package com.company.chapter09interfaces.examples.e03otdelenieIntefotrealiz;

/**
 * Метод Apply. process () получает любую разновидность Processor, применяет ее к Object,
 * а затем выводит результат. Решение, при котором поведение метода изменяется в зависимости
 * от переданного объекта-аргумента, называется паттерном «Стратегия».
 * Метод содержит фиксированную часть алгоритма, а объект стратегии — переменную
 * часть. Под «объектом стратегии» понимается передаваемый объект, который содержит
 * выполняемый код. В данном случае объект Processor является объектом стратегии, а в
 * методе main() мы видим три разные стратегии, применяемые к String s.
 */
class Scratch_1 {

    public static void process(Processor p, Object s) {
        System.out.println("Hcnonb3yeM Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);

    }
}