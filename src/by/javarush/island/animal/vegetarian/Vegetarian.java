package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.animal.VegetarianEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Vegetarian extends Animal {

    @Override
    public AnimalEnum getAnimalType() {
        return AnimalEnum.VEGETARIAN;
    }

    abstract public VegetarianEnum getVegetarianType();

    public boolean isNotVegan() {
        return false;
    }

    @Override
    public void eat() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public DirectionsDrivingEnum chooseDirectionOfTravel() {
        return null;
    }
}
