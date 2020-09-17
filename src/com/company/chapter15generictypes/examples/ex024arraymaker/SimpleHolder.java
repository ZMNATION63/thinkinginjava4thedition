package com.company.chapter15generictypes.examples.ex024arraymaker;

/**
 * Так как стирание удаляет информацию о типе в теле метода, во время выполнения
 * важны гр а н и ч н ы е т очки, в которых объекты входят в метод и покидают его. В этих
 * точках компилятор выполняет проверку типа во время компиляции и вставляет код
 * приведения типа
 */
public class SimpleHolder {
    private Object obj;

    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get() {
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
        System.out.println(s);
    }
}
