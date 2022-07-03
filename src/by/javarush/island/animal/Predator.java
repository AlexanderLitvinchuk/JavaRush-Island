package by.javarush.island.animal;

public abstract class Predator extends Animal {

    @Override
    public AnimalEnum getAnimalType() {
        return AnimalEnum.PREDATOR;
    }

    abstract public PredatorEnum getPredatorType();
}
