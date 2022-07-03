package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.VegetarianEnum;

public class Hamster extends Vegetarian {
    @Override
    public VegetarianEnum getVegetarianType() {
        return VegetarianEnum.HAMSTER;
    }
}
