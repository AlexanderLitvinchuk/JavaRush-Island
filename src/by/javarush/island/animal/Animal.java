package by.javarush.island.animal;

import by.javarush.island.animal.chances.FoodChances;
import by.javarush.island.animal.characteristic.Characteristic;
import by.javarush.island.animal.characteristic.CharacteristicDto;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;
import by.javarush.island.cell.Cell;

import java.util.Map;

public abstract class Animal {

    /**
     * Количество голода
     */
    private int amountOfHunger = 0;

    private boolean isLive = true;

    protected CharacteristicDto getCharacteristic()  {
        return Characteristic.getCharacteristicDto(getAnimal());
    }
    protected Map<AnimalEnum, Integer> getFoodChances() {
        return FoodChances.getAnimalEnumMapMap().get(getAnimal());
    }

    /**
     * Покушать
     */
    public abstract void eat(Cell cell);

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

    /**
     * Добавить к счётчику голода +1 ход голода
     */
    public void addOneTackHunger() {
        amountOfHunger++;
    }

    /**
     * Сбросить счётчик голода
     */
    public void resetHungerCounter() {
        this.amountOfHunger = 0;
    }

    public boolean isLive() {
        return isLive;
    }

    public void killAnimal() {
        isLive = false;
    }
}
