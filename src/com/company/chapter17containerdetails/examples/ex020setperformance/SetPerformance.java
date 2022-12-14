package com.company.chapter17containerdetails.examples.ex020setperformance;

import com.company.chapter17containerdetails.examples.ex018listperformance.Test;
import com.company.chapter17containerdetails.examples.ex018listperformance.TestParam;
import com.company.chapter17containerdetails.examples.ex018listperformance.Tester;

import java.util.*;

/**
 * Демонстрация различий производительности
 * 8 разных реализациях Set.
 * {Args: 100 5000} небольшие значения, чтобы тесты
 * не занимали много времени,
 * <p>
 * Доработать
 * 34. (1) Измените код SetPerformance.java так, чтобы в Set
 * вместо Integer хранились объекты String. Для создания тестовых значений используйте генератор из главы 16
 */
public class SetPerformance {
    static List<Test<Set<Integer>>> tests =
            new ArrayList<Test<Set<Integer>>>();

    static {
        tests.add(new Test<Set<Integer>>("add") {
            public int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    set.clear();
                    for (int j = 0; j < size; j++)
                        set.add(j);
                }
                return loops * size;
            }
        });

        tests.add(new Test<Set<Integer>>("contains") {
            public int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++)
                    for (int j = 0; j < span; j++)
                        set.contains(j);
                return loops * span;
            }
        });

        tests.add(new Test<Set<Integer>>("iterate") {
            public int test(Set<Integer> set, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator<Integer> it = set.iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * set.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<Integer>(), tests);
        Tester.run(new HashSet<Integer>(), tests);
        Tester.run(new LinkedHashSet<Integer>(), tests);
    }
}