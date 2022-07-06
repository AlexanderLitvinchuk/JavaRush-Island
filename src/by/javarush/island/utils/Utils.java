package by.javarush.island.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    /**
     * Метод генерирует с % вероятности true
     *
     * @param probability % вероятности
     * @return вероятность сработки
     */
    public static boolean getRandomBoolean(int probability) {
        int randomValue = ThreadLocalRandom.current().nextInt(100);
        return randomValue <= probability;
    }
}
