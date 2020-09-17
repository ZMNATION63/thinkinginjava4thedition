package com.company.chapter07reusingclasses.examples.e06delegirovanie;

public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
