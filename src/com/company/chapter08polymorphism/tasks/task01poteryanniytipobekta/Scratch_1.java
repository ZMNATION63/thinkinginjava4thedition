package com.company.chapter08polymorphism.tasks.task01poteryanniytipobekta;

import static com.company.chapter08polymorphism.tasks.task01poteryanniytipobekta.Rider.riderRede;

/**
 * 1. (2) Создайте класс Cycleс производными классами Unicycle , Bicycle и Tricycle .
 * Покажите, что экземпляр каждого из производных типов может быть преобразован
 * в Cycle , на примере вызова метода ride() .
 * <p>
 * 18. (2) Используя иерархию Cycle из упражнения 1, включите метод balance() в классы
 * Unicycle и Bicycle, но не в Tricycle.
 * Создайте экземпляры всех трех типов и выполнитеих восходящее преобразование в массив Cycle.
 * Попробуйте вызвать balance() для каждого элемента массива.
 * Теперь выполните нисходящее преобразование, вызовите balance() и проанализируйте результат.
 */
class Scratch_1 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        //Cycleс cycleс = new Cycleс ();
        Tricycle tricycle = new Tricycle();
        Unicycle unicycle = new Unicycle();
        riderRede(bicycle);
        //riderRede (cycleс);
        riderRede(tricycle);
        riderRede(unicycle);
        bicycle.ride();
        //Cycleс bs = new Bicycle ();//
        Cycleс[] arr = {new Bicycle(), new Unicycle(), new Tricycle()};
        arr[0].balance();
        arr[1].balance();
        arr[2].balance();
        /*(Bicycle)arr[0].balance();
        (Unicycle)arr[1].balance();
        (Tricycle)arr[2].balance();
*/
    }
}