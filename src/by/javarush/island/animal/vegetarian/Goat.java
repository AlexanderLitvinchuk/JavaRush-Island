package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.VegetarianEnum;

public class Goat extends Vegetarian {
    @Override
    public VegetarianEnum getVegetarianType() {
        return VegetarianEnum.GOAT;
    }
}
