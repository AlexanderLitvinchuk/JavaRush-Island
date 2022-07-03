package by.javarush.island.location;

import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.animal.AnimalFactory;
import by.javarush.island.animal.characteristic.Characteristic;
import by.javarush.island.animal.characteristic.CharacteristicDto;
import by.javarush.island.cell.Cell;

/**
 * Поле Острова
 */
public class Location {

    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;

    private final Cell[][] island = new Cell[HEIGHT][WIDTH];

    public Location(Characteristic characteristic) {
        init();
        initAnimalAndPlant(characteristic);
    }

    /**
     *
     */
    public void init() {
        System.out.println("Инициализация поля island");
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new Cell();
            }
        }
        System.out.println("Инициализация поля island завершена");
    }

    private void initAnimalAndPlant(Characteristic characteristic) {
        for (Cell[] cells : island) {
            for (Cell cell : cells) {
                initAnimal(cell, characteristic);
                int amountPlantsInCell = (int) (Math.random() * 10000);
                cell.getPlants().setAmount(amountPlantsInCell);
            }
        }
    }

    private void initAnimal(Cell cell, Characteristic characteristic) {
        for (AnimalEnum value : AnimalEnum.values()) {
            CharacteristicDto characteristicDto = characteristic.getCharacteristicDto(value);
            int amountAnimalInCell = (int) (Math.random() * characteristicDto.getMaximumAmount());
            for (int i = 0; i < amountAnimalInCell; i++) {
                cell.getAnimals().add(AnimalFactory.getAnimal(value));
            }
        }
    }


    public Cell[][] getIsland() {
        return island;
    }
}
