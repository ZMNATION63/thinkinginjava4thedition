package com.company.chapter15generictypes.examples.ex023erasureandInheritance;

/**
 * Derived2 наследует от GenericBase без параметров, и компилятор не предупреждает об
 * этом. Предупреждение не выдается до момента вызова set().
 * <p>
 * Добавьте к этому дополнительный труд по управлению ограничениями, когда вы
 * хотите интерпретировать параметр-тип как нечто большее, чем просто Object, — и в
 * результате вы получаете существенно больше усилий при меньшей пользе, чем при
 * использовании параметризованныхтипов в таких языках
 */
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj); // Предупреждение!
    }
}
