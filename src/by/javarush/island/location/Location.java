package by.javarush.island.location;

import by.javarush.island.cell.Cell;

/**
 * Поле Острова
 */
public class Location {

    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;

    private final Cell[][] island = new Cell[HEIGHT][WIDTH];

    public Location() {
        init();
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

    public Cell[][] getIsland() {
        return island;
    }
}
