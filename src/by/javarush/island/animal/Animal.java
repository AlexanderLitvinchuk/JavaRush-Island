package by.javarush.island.animal;

import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Animal {

    /**
     * Количество голода
     */
    private int amountOfHunger = 0;

    /**
     * Покушать
     */
    public abstract void eat();

    /**
     * Размножение
     */
    public abstract void multiply();

    /**
     * направление движения
     */
    public abstract DirectionsDrivingEnum chooseDirectionOfTravel();

    public abstract AnimalTypeEnum getAnimalType();

    public abstract AnimalEnum getAnimal();

    public int getAmountOfHunger() {
        return amountOfHunger;
    }

    public void addOneTackHunger() {
        amountOfHunger++;
    }
}
