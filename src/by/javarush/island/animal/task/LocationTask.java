package by.javarush.island.animal.task;

import by.javarush.island.cell.Cell;
import by.javarush.island.location.Location;
import by.javarush.island.location.LocationPrint;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Ход для Острова
 */
public class LocationTask implements Runnable {

    private final Location location;

    public LocationTask(Location location) {
        this.location = location;
    }

    @Override
    public void run() {

        final Cell[][] island = location.getIsland();
//        for (Cell[] cells : island)
//            for (Cell cell : cells) {
//                // Тест удаление травы на..
//                cell.getPlants().reduceAmount(100);
//            }

        // Обработка клеток - каждая в своём потоке
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        Arrays.stream(island)
                .flatMap(Arrays::stream)
                .forEach(cell -> executorService.submit(new CellTask(cell)));

        // TODO нужно как-то подождать выполнение всех потоков..

        LocationPrint.print(location.getIsland());
        System.out.println("Финиш ШАГ = ");

    }
}
