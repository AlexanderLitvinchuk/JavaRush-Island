package by.javarush.island;

import by.javarush.island.animal.task.LocationTask;
import by.javarush.island.location.Location;
import by.javarush.island.location.LocationPrint;

public class IslandRunner {

    private static final int STEP_COUNT = 20;

    public static void main(String[] args) {

        // Создаём остров
        Location location = new Location();
        // печатаем остров
        LocationPrint.print(location.getIsland());

        // Запуск ходов на острове
        for (int i = 0; i < STEP_COUNT; i++) {
            System.out.printf("Расчёт хода номер = %d НАЧАТ", i + 1);
            new LocationTask(location).run();
            System.out.printf("Расчёт хода номер = %d ЗАВЕРШЁН", i + 1);
        }

        System.out.println("Время прошло покинуть остров !!!");

    }

}
