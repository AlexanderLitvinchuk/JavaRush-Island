package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.Vegetarian;
import by.javarush.island.animal.VegetarianEnum;

public class Deer extends Vegetarian {
    @Override
    public VegetarianEnum getVegetarianType() {
        return VegetarianEnum.DEER;
    }
}
