package by.javarush.island.location;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.cell.Cell;
import by.javarush.island.plants.Plants;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Класс распечатывает текущее состояние Острова
 */
public class LocationPrint {

    public static void print(Cell[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                System.out.printf("клетка[%d][%d] Старт%n", i, j);
                printCell(island[i][j]);
                System.out.printf("клетка[%d][%d] Финиш%n", i, j);
            }

        }
    }

    private static void printCell(Cell cell) {
        Plants plants = cell.getPlants();
        System.out.println("Растений осталось - " + plants.getAmount());

        System.out.println("Животных всего - " + cell.getAnimals().size());

        // Группировка списка животных по типу животного (AnimalEnum)
        Map<AnimalEnum, List<Animal>> animalMap = cell.getAnimals().stream()
                .collect(Collectors.groupingBy(Animal::getAnimal));

        // Проход по animalMap, для каждого типа животных свой список животных
        for (Map.Entry<AnimalEnum, List<Animal>> animalEnumListEntry : animalMap.entrySet()) {
            AnimalEnum key = animalEnumListEntry.getKey();
            int size = animalEnumListEntry.getValue().size();
            System.out.println("Всего в клетке " + key.getDescription() + " - " + size);

            long count = animalEnumListEntry.getValue().stream()
                    .filter(animal -> animal.getAmountOfHunger() == 0)
                    .count();
            System.out.println(key.getDescription() + "всего поело - " + count + ", голодных - " + (size - count) );
        }

        System.out.println("Животных пришло - " + cell.getTotalAnimalsCame());
        System.out.println("Животных ушло - " + cell.getTotalAnimalsGone());
        System.out.println("Животных погибло голодными - " + cell.getDeadAnimals());
        System.out.println("Животных съедено - " + cell.getEatenAnimals());
        cell.resetCounters();
    }

}
