package by.javarush.island.animal.predator;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.animal.PredatorEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Predator extends Animal {

    @Override
    public AnimalEnum getAnimalType() {
        return AnimalEnum.PREDATOR;
    }

    abstract public PredatorEnum getPredatorType();

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
