package by.javarush.island.animal;

public abstract class Vegetarian extends Animal {

    @Override
    public AnimalEnum getAnimalType() {
        return AnimalEnum.VEGETARIAN;
    }

    abstract public VegetarianEnum getVegetarianType();
}
