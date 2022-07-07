package by.javarush.island;

import by.javarush.island.animal.chances.FoodChances;
import by.javarush.island.animal.task.LocationTask;
import by.javarush.island.location.Location;
import by.javarush.island.location.LocationPrint;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class IslandRunner {

    private static final int STEP_COUNT = 2;

    public static void main(String[] args) {

        FoodChances foodChances = new FoodChances();
        // Создаём остров
        Location location = new Location();
        // печатаем остров
        LocationPrint.print(location.getIsland());

        // Наверное, тут нужно переделать на обычный forEach
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < STEP_COUNT; i++) {
//            executorService.submit(new LocationTask(location));
            new LocationTask(location).run();
        }

        System.out.println("Test");

    }

    private static void goTact(Location location) {
        // Каждая клетка в своём потоке смотрит, кто кого может сожрать
        // Голодные умирают
        // Смотрим, если не голодный - размножаемся
        // Если голодный - переход
    }

}
