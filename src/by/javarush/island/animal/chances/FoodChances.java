package by.javarush.island.animal.chances;

import by.javarush.island.animal.AnimalEnum;

import java.util.HashMap;
import java.util.Map;

public class FoodChances {

    private final Map<AnimalEnum, Map<AnimalEnum, Integer>> animalEnumMapMap = new HashMap<>();

    public Map<AnimalEnum, Map<AnimalEnum, Integer>> getAnimalEnumMapMap() {
        return animalEnumMapMap;
    }

    public FoodChances() {
        init();
        initVegetarianChances();
    }

    /**
     * Инициализация animalChances для последующей работы
     */
    private void init() {
        // Волк
        Map<AnimalEnum, Integer> wolfMap = new HashMap<>();
        wolfMap.put(AnimalEnum.WOLF, 0);
        wolfMap.put(AnimalEnum.SNAKE, 10);
        wolfMap.put(AnimalEnum.FOX, 10);
        wolfMap.put(AnimalEnum.BEAR, 0);
        wolfMap.put(AnimalEnum.EAGLE, 10);
        wolfMap.put(AnimalEnum.HORSE, 30);
        wolfMap.put(AnimalEnum.DEER, 30);
        wolfMap.put(AnimalEnum.HARE, 70);
        wolfMap.put(AnimalEnum.HAMSTER, 90);
        wolfMap.put(AnimalEnum.GOAT, 60);
        wolfMap.put(AnimalEnum.SHEEP, 70);
        wolfMap.put(AnimalEnum.KANGAROO, 20);
        wolfMap.put(AnimalEnum.COW, 30);
        wolfMap.put(AnimalEnum.DUCK, 80);
        wolfMap.put(AnimalEnum.CATERPILLAR, 0);
        animalEnumMapMap.put(AnimalEnum.WOLF, wolfMap);
        // Змея
        Map<AnimalEnum, Integer> snakeMap = new HashMap<>();
        snakeMap.put(AnimalEnum.WOLF, 0);
        snakeMap.put(AnimalEnum.SNAKE, 0);
        snakeMap.put(AnimalEnum.FOX, 0);
        snakeMap.put(AnimalEnum.BEAR, 0);
        snakeMap.put(AnimalEnum.EAGLE, 0);
        snakeMap.put(AnimalEnum.HORSE, 0);
        snakeMap.put(AnimalEnum.DEER, 0);
        snakeMap.put(AnimalEnum.HARE, 50);
        snakeMap.put(AnimalEnum.HAMSTER, 90);
        snakeMap.put(AnimalEnum.GOAT, 0);
        snakeMap.put(AnimalEnum.SHEEP, 0);
        snakeMap.put(AnimalEnum.KANGAROO, 0);
        snakeMap.put(AnimalEnum.COW, 0);
        snakeMap.put(AnimalEnum.DUCK, 50);
        snakeMap.put(AnimalEnum.CATERPILLAR, 90);
        animalEnumMapMap.put(AnimalEnum.SNAKE, snakeMap);
        // Лиса
        Map<AnimalEnum, Integer> foxMap = new HashMap<>();
        foxMap.put(AnimalEnum.WOLF, 0);
        foxMap.put(AnimalEnum.SNAKE, 20);
        foxMap.put(AnimalEnum.FOX, 0);
        foxMap.put(AnimalEnum.BEAR, 0);
        foxMap.put(AnimalEnum.EAGLE, 10);
        foxMap.put(AnimalEnum.HORSE, 0);
        foxMap.put(AnimalEnum.DEER, 5);
        foxMap.put(AnimalEnum.HARE, 70);
        foxMap.put(AnimalEnum.HAMSTER, 90);
        foxMap.put(AnimalEnum.GOAT, 20);
        foxMap.put(AnimalEnum.SHEEP, 20);
        foxMap.put(AnimalEnum.KANGAROO, 5);
        foxMap.put(AnimalEnum.COW, 0);
        foxMap.put(AnimalEnum.DUCK, 80);
        foxMap.put(AnimalEnum.CATERPILLAR, 0);
        animalEnumMapMap.put(AnimalEnum.FOX, foxMap);
        // Медведь
        Map<AnimalEnum, Integer> bearMap = new HashMap<>();
        bearMap.put(AnimalEnum.WOLF, 20);
        bearMap.put(AnimalEnum.SNAKE, 30);
        bearMap.put(AnimalEnum.FOX, 20);
        bearMap.put(AnimalEnum.BEAR, 0);
        bearMap.put(AnimalEnum.EAGLE, 30);
        bearMap.put(AnimalEnum.HORSE, 70);
        bearMap.put(AnimalEnum.DEER, 80);
        bearMap.put(AnimalEnum.HARE, 80);
        bearMap.put(AnimalEnum.HAMSTER, 90);
        bearMap.put(AnimalEnum.GOAT, 70);
        bearMap.put(AnimalEnum.SHEEP, 70);
        bearMap.put(AnimalEnum.KANGAROO, 60);
        bearMap.put(AnimalEnum.COW, 75);
        bearMap.put(AnimalEnum.DUCK, 80);
        bearMap.put(AnimalEnum.CATERPILLAR, 0);
        animalEnumMapMap.put(AnimalEnum.BEAR, bearMap);
        // Орел
        Map<AnimalEnum, Integer> eagleMap = new HashMap<>();
        eagleMap.put(AnimalEnum.WOLF, 0);
        eagleMap.put(AnimalEnum.SNAKE, 50);
        eagleMap.put(AnimalEnum.FOX, 0);
        eagleMap.put(AnimalEnum.BEAR, 0);
        eagleMap.put(AnimalEnum.EAGLE, 0);
        eagleMap.put(AnimalEnum.HORSE, 0);
        eagleMap.put(AnimalEnum.DEER, 0);
        eagleMap.put(AnimalEnum.HARE, 90);
        eagleMap.put(AnimalEnum.HAMSTER, 90);
        eagleMap.put(AnimalEnum.GOAT, 0);
        eagleMap.put(AnimalEnum.SHEEP, 0);
        eagleMap.put(AnimalEnum.KANGAROO, 0);
        eagleMap.put(AnimalEnum.COW, 0);
        eagleMap.put(AnimalEnum.DUCK, 85);
        eagleMap.put(AnimalEnum.CATERPILLAR, 20);
        animalEnumMapMap.put(AnimalEnum.EAGLE, eagleMap);
    }

    private void initVegetarianChances() {
        Map<AnimalEnum, Integer> duckMap = new HashMap<>();
        duckMap.put(AnimalEnum.CATERPILLAR, 50);
        animalEnumMapMap.put(AnimalEnum.DUCK, duckMap);
    }
}
