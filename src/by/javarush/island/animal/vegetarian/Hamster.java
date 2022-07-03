package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.AnimalEnum;


public class Hamster extends Vegetarian {
    @Override
    public AnimalEnum getAnimal() {
        return AnimalEnum.HAMSTER;
    }
}