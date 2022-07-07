package by.javarush.island.animal.task;

import by.javarush.island.animal.Animal;
import by.javarush.island.cell.Cell;
import by.javarush.island.location.Location;
import by.javarush.island.location.LocationPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

        // Обработка клеток - каждая в своём потоке
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        Arrays.stream(island)
                .flatMap(Arrays::stream)
                .forEach(cell -> executorService.submit(new CellTask(cell)));

        // TODO нужно как-то подождать выполнение всех потоков..

        // Движения животных
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                // в каждой клетке
                int finalI = i;
                int finalJ = j;
                // создаем список животных, которые ушли с клетки
                List<Animal> removedList = new ArrayList<>();
                // для каждого животного который готов ходить
                island[i][j].getAnimals().stream()
                        .filter(Animal::isReadyToMove)
                        .forEach(animal -> {
                    // вычисляем скорость
                    int movementSpeed = animal.movementSpeed();
                    // получаем список клеток куда можем ходить
                    List<Cell> listMovedAnimal = getListMovedAnimal(island, finalI, finalJ, movementSpeed);
                    // рандомно перемешиваем список
                    Collections.shuffle(listMovedAnimal);
                    // смотрим по клеткам
                    for (Cell cell : listMovedAnimal) {
                        // Сколько животных в клетке
                        long countAnimals = cell.getAnimals().stream()
                                .filter(animal1 -> animal1.getAnimal() == animal.getAnimal())
                                .count();

                        // Если есть место для животного
                        if (countAnimals < animal.getCharacteristic().getMaximumAmount()) {
                            // добавляем животное в новую клетку
                            cell.getAnimals().add(animal);
                            // помечаем животное для исключения в этом списке
                            removedList.add(animal);
                            animal.setReadyToMove(false);
                            // больше не подбираем место для этого животного, выходим из for
                            break;
                        }
                    }
                });
                // удаляем животных которые ушли
                island[i][j].getAnimals().removeAll(removedList);
            }
        }

        // После того как все животные походили ставим флаг для следующего хода
        for (Cell[] cells : island) {
            for (Cell cell : cells) {
                cell.getAnimals().forEach(animal -> animal.setReadyToMove(true));
            }
        }

        LocationPrint.print(location.getIsland());
        System.out.println("Финиш ШАГ = ");

    }


    /**
     * Получить список возможных ходов животного
     *
     * @param island        Остров
     * @param i             позиция клетки
     * @param j             позиция клетки
     * @param movementSpeed скорость движения
     * @return список разрешенных клеток
     */
    private static List<Cell> getListMovedAnimal(Cell[][] island, final int i, final int j, int movementSpeed) {
        List<Cell> result = new ArrayList<>();
        int leftPosition = Math.max(j - movementSpeed, 0);
        int rightPosition = Math.min(j + movementSpeed, island[i].length);
        int downPosition = Math.min(i + movementSpeed, island.length);
        int upPosition = Math.max(i - movementSpeed, 0);

        for (int i2 = upPosition; i2 <= downPosition; i2++) {
            for (int j2 = leftPosition; j2 <= rightPosition; j2++) {
                if (!(i2 == i && j2 == j))
                    result.add(island[i2][j2]);
            }
        }

        return result;
    }
}
