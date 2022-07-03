package by.javarush.island.animal.chances;

import by.javarush.island.animal.PredatorEnum;
import by.javarush.island.animal.VegetarianEnum;

import java.util.HashMap;
import java.util.Map;

public class FoodChances {

    private final Map<PredatorEnum, Map<PredatorEnum, Integer>> predatorChances = new HashMap<>();
    private final Map<PredatorEnum, Map<VegetarianEnum, Integer>> vegetarianChances = new HashMap<>();
    private final Map<VegetarianEnum, Map<VegetarianEnum, Integer>> duckChances = new HashMap<>();


    public FoodChances() {
        init();
        initVegetarianChances();
    }

    /**
     * Инициализация animalChances для последующей работы
     */
    private void init() {
        // Волк
        Map<PredatorEnum, Integer> wolfMap = new HashMap<>();
        wolfMap.put(PredatorEnum.WOLF, 0);
        wolfMap.put(PredatorEnum.SNAKE, 10);
        wolfMap.put(PredatorEnum.FOX, 10);
        wolfMap.put(PredatorEnum.BEAR, 0);
        wolfMap.put(PredatorEnum.EAGLE, 10);
        predatorChances.put(PredatorEnum.WOLF, wolfMap);
        Map<VegetarianEnum, Integer> wolfVeganMap = new HashMap<>();
        wolfVeganMap.put(VegetarianEnum.HORSE, 30);
        wolfVeganMap.put(VegetarianEnum.DEER, 30);
        wolfVeganMap.put(VegetarianEnum.HARE, 70);
        wolfVeganMap.put(VegetarianEnum.HAMSTER, 90);
        wolfVeganMap.put(VegetarianEnum.GOAT, 60);
        wolfVeganMap.put(VegetarianEnum.SHEEP, 70);
        wolfVeganMap.put(VegetarianEnum.KANGAROO, 20);
        wolfVeganMap.put(VegetarianEnum.COW, 30);
        wolfVeganMap.put(VegetarianEnum.DUCK, 80);
        wolfVeganMap.put(VegetarianEnum.CATERPILLAR, 0);
        vegetarianChances.put(PredatorEnum.FOX, wolfVeganMap);
        // Змея
        Map<PredatorEnum, Integer> snakeMap = new HashMap<>();
        snakeMap.put(PredatorEnum.WOLF, 0);
        snakeMap.put(PredatorEnum.SNAKE, 0);
        snakeMap.put(PredatorEnum.FOX, 0);
        snakeMap.put(PredatorEnum.BEAR, 0);
        snakeMap.put(PredatorEnum.EAGLE, 0);
        predatorChances.put(PredatorEnum.WOLF, snakeMap);
        Map<VegetarianEnum, Integer> snakeVeganMap = new HashMap<>();
        snakeVeganMap.put(VegetarianEnum.HORSE, 0);
        snakeVeganMap.put(VegetarianEnum.DEER, 0);
        snakeVeganMap.put(VegetarianEnum.HARE, 50);
        snakeVeganMap.put(VegetarianEnum.HAMSTER, 90);
        snakeVeganMap.put(VegetarianEnum.GOAT, 0);
        snakeVeganMap.put(VegetarianEnum.SHEEP, 0);
        snakeVeganMap.put(VegetarianEnum.KANGAROO, 0);
        snakeVeganMap.put(VegetarianEnum.COW, 0);
        snakeVeganMap.put(VegetarianEnum.DUCK, 50);
        snakeVeganMap.put(VegetarianEnum.CATERPILLAR, 90);
        vegetarianChances.put(PredatorEnum.FOX, snakeVeganMap);
        // Лиса
        Map<PredatorEnum, Integer> foxMap = new HashMap<>();
        foxMap.put(PredatorEnum.WOLF, 0);
        foxMap.put(PredatorEnum.SNAKE, 20);
        foxMap.put(PredatorEnum.FOX, 0);
        foxMap.put(PredatorEnum.BEAR, 0);
        foxMap.put(PredatorEnum.EAGLE, 10);
        predatorChances.put(PredatorEnum.FOX, foxMap);
        Map<VegetarianEnum, Integer> foxVeganMap = new HashMap<>();
        foxVeganMap.put(VegetarianEnum.HORSE, 0);
        foxVeganMap.put(VegetarianEnum.DEER, 5);
        foxVeganMap.put(VegetarianEnum.HARE, 70);
        foxVeganMap.put(VegetarianEnum.HAMSTER, 90);
        foxVeganMap.put(VegetarianEnum.GOAT, 20);
        foxVeganMap.put(VegetarianEnum.SHEEP, 20);
        foxVeganMap.put(VegetarianEnum.KANGAROO, 5);
        foxVeganMap.put(VegetarianEnum.COW, 0);
        foxVeganMap.put(VegetarianEnum.DUCK, 80);
        foxVeganMap.put(VegetarianEnum.CATERPILLAR, 0);
        vegetarianChances.put(PredatorEnum.FOX, foxVeganMap);

    }

    private void initVegetarianChances() {
        Map<VegetarianEnum, Integer> duckMap = new HashMap<>();
        duckMap.put(VegetarianEnum.CATERPILLAR, 50);
        duckChances.put(VegetarianEnum.DUCK, duckMap);
    }
}
