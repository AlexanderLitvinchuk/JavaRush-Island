package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.VegetarianEnum;

public class Duck extends Vegetarian {
    @Override
    public VegetarianEnum getVegetarianType() {
        return VegetarianEnum.DUCK;
    }

    @Override
    public boolean isNotVegan() {
        return true;
    }
}
