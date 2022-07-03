package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.AnimalEnum;


public class Duck extends Vegetarian {
    @Override
    public AnimalEnum getAnimal() {
        return AnimalEnum.DUCK;
    }
    @Override
    public boolean isNotVegan() {
        return true;
    }
}
