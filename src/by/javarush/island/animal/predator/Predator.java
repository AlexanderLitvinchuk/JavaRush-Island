package by.javarush.island.animal.predator;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalTypeEnum;
import by.javarush.island.animal.PredatorEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Predator extends Animal {

    @Override
    public AnimalTypeEnum getAnimalType() {
        return AnimalTypeEnum.PREDATOR;
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
