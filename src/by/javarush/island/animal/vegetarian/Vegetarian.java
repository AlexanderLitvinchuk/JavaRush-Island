package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalTypeEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;
import by.javarush.island.cell.Cell;

public abstract class Vegetarian extends Animal {

    @Override
    public AnimalTypeEnum getAnimalType() {
        return AnimalTypeEnum.VEGETARIAN;
    }

    public boolean isNotVegan() {
        return false;
    }

    @Override
    public void eat(Cell cell) {
        // Если животное живое
        if (isLive()) {
            boolean isAteFull = false;
            if (isNotVegan()) {
                // TODO доделать кушать животных, для утки
                isAteFull = cell.getPlants().reduceAmount(getCharacteristic().getEnergy());
            } else {
                isAteFull = cell.getPlants().reduceAmount(getCharacteristic().getEnergy());
            }
            // Проверяем наелось животное - сбросили счётчик голода, иначе добавляем + 1 ход
            if (isAteFull) {
                resetHungerCounter();
            } else {
                addOneTackHunger();
            }
        }
    }

    @Override
    public void multiply() {

    }

    @Override
    public DirectionsDrivingEnum chooseDirectionOfTravel() {
        return null;
    }
}
