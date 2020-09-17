package com.company.chapter10innerclasses.examples.example018inheritinner;

/**
 * Здесь класс lnheritlnner расширяет только внутренний класс, а не внешний. Но когда
 * приходит время создавать конструктор, конструктор по умолчанию не подходит, и вы
 * не можете просто передать ссылку на внешний объект.
 * <p>
 * ссылкаНаВнешнийКласс.super();
 */
// Наследование от внутреннего класса.
class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //! InheritInner() {} // Не компилируется нужно создавать от объектов внешнего класса\
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

