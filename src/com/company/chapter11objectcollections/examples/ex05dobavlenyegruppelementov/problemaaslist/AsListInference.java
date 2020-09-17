package com.company.chapter11objectcollections.examples.ex05dobavlenyegruppelementov.problemaaslist;
/**
 * При попытке создания snow2 метод Arrays. asList() обнаруживает только типы Powder,
 * поэтому он создает List<Powder> вместо List<Snow>, тогда как метод Collections. addAll()
 * работает нормально
 * <p>
 * Как видно из создания snow4, в середину последовательности Arrays.asList() можно
 * вставить «подсказку», которая сообщит компилятору фактический целевой тип List,
 * создаваемый Arrays .asList (). Этот прием называется явным указанием аргумента типа
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snowl = Arrays.asList(
                new Crusty(), new Slush(), new Powder());
// Не откомпилируется:
// List<Snow> snow2 = Arrays.asList(
// new Light(), new Heavy());
// Компилятор сообщает:
// получено : java.util.List<Powder>
// требуется : java.util.List<Snow>
// У Collections.addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
// Подсказка с явно указанным аргументом типа:
        List<Snow> snow4 = Arrays.<Snow>asList(
                new Light(), new Heavy());
    }
}

