package by.javarush.island.location;

import by.javarush.island.cell.Cell;
import by.javarush.island.plants.Plants;

/**
 * Класс распечатывает текущее состояние Острова
 */
public class LocationPrint {

    public static void print(Cell[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                System.out.printf("клетка[%d][%d] Старт%n", i, j);
                printCell(island[i][j]);
                System.out.println("test");
                System.out.printf("клетка[%d][%d] Финишь%n", i, j);
            }

        }
    }

    private static void printCell(Cell cell) {
        Plants plants = cell.getPlants();
        System.out.println("Растений осталось - " + plants.getAmount());

        // TODO сделать вывод животных
//        cell.getAnimals().stream()
//                .collect(Collectors.groupingBy(
//                        Animal::getAnimal,
//
//                ))
    }

}
