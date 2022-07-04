package by.javarush.island.animal.task;

import by.javarush.island.cell.Cell;

public class CellTask implements Runnable {

    private final Cell cell;

    public CellTask(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
        // Растения растут на 5 %
        cell.getPlants().plantsGrewByFivePercent();
        // каждое животное кушает
        cell.getAnimals().forEach(animal -> animal.eat(cell));
    }
}
