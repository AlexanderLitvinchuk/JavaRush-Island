package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.VegetarianEnum;

public class Cow extends Vegetarian {
    @Override
    public VegetarianEnum getVegetarianType() {
        return VegetarianEnum.COW;
    }
}
