package com.company.chapter15generictypes.examples.ex026instantiategenerictype;

/**
 * Программа компилируется, но при выполнении ClassAsFactory<Integer> происходит
 * ошибка, потому что Integer не имеет конструктора по умолчанию.
 *
 * @param <T>
 */
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static class Employee {
    }

    public static class InstantiateGenericType {
        public static void main(String[] args) {
            ClassAsFactory<Employee> fe =
                    new ClassAsFactory<Employee>(Employee.class);
            System.out.println("ClassAsFactory<Employee> succeeded");
            try {
                ClassAsFactory<Integer> fi =
                        new ClassAsFactory<Integer>(Integer.class);
            } catch (Exception e) {
                System.out.println("ClassAsFactory<Integer> failed");
            }
        }
    }
}