package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalTypeEnum;
import by.javarush.island.animal.VegetarianEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Vegetarian extends Animal {

    @Override
    public AnimalTypeEnum getAnimalType() {
        return AnimalTypeEnum.VEGETARIAN;
    }

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
