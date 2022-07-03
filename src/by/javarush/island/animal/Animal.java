package by.javarush.island.animal;

import by.javarush.island.animal.directions.DirectionsDrivingEnum;

public abstract class Animal {

    /**
     * Покушать
     */
    public abstract void eat();

    /**
     * Размножение
     */
    public abstract void multiply();

    /**
     *
     */
    public abstract DirectionsDrivingEnum chooseDirectionOfTravel();

    public abstract AnimalEnum getAnimalType();
}
