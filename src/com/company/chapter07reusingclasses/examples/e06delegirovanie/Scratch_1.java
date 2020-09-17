package com.company.chapter07reusingclasses.examples.e06delegirovanie;

/**
 * Третий вид отношений, не поддерживаемый Bjava напрямую, называется делегированием.
 * Он занимает промежуточное положение между наследованием и композицией:
 * экземпляр существующего класса включается в создаваемый класс (как при композиции),
 * но в то же время все методы встроенного объекта становятся доступными в новом
 * классе (как при наследовании). Например, класс SpaceShipControls имитирует модуль
 * управления космическим кораблем:
 * Делегированные методы: SpaceShip унаследован от SpaceShipControls
 * Здесь происходит образение к объекту типа SpaceShipControls Класса SpaceShipDelegation
 */
class Scratch_1 {
    public static void main(String[] args) {
        SpaceShipDelegation protector =
                new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}