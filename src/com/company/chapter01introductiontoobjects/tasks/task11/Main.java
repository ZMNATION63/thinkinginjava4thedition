package com.company.chapter01introductiontoobjects.tasks.task11;

public class Main {

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow all = new AllTheColorsOfTheRainbow();
        all.anIntegerRepresentingColorsj = 0x00FF0000;
        System.out.println("Цвет до изменения: \n" + all.anIntegerRepresentingColorsj);
        all.changeTheHueOfTheColor(Math.round(255 * 84602));
        System.out.println("Цвет после изменения: \n" + all.anIntegerRepresentingColorsj);

    }
}

/*
* class AllTheColorsOfTheRainbow { int anIntegerRepresentingColorsj void changeTheHueOfTheColor(int newHue) {
// ...
}
// ...
}
*
* */