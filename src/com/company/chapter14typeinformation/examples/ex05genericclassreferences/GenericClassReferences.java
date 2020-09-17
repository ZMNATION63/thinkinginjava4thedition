package com.company.chapter14typeinformation.examples.ex05genericclassreferences;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class; //обычная ссылка на класс, при использовании такого механизма можно получить проблемы
        //скажем в эту ссылку можно вложить все что угодно и получить исключение в момент выполнения программы
        Class<Integer> genericIntClass = int.class;//решение проблему - параметризированная ссылка, в нее
        //можно вложить только тот тип, что указан при создании
        genericIntClass = Integer.class; // То же
        intClass = double.class;
// genericIntClass = double.class; // Недопустимо
    }
}

//пример ослаюления ограничений  Class<?> == Class
//считается предпочтительной форма Class<?>
class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}