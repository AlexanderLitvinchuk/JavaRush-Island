package by.javarush.island.animal.characteristic;

import by.javarush.island.animal.AnimalEnum;

import java.util.HashMap;
import java.util.Map;

public class Characteristic {

    private static final Map<AnimalEnum, CharacteristicDto> animalCharacteristicDtoMap = new HashMap<>();

    static {
        init();
    }

    public Characteristic() {
        init();
    }

    private static void init() {
        animalCharacteristicDtoMap.put(
                AnimalEnum.WOLF,
                new CharacteristicDto(50, 30, 3, 8, 10));
        animalCharacteristicDtoMap.put(
                AnimalEnum.SNAKE,
                new CharacteristicDto(2, 123, 1, 0.3, 15));
        animalCharacteristicDtoMap.put(
                AnimalEnum.FOX,
                new CharacteristicDto(4, 50, 3, 1, 8));
        animalCharacteristicDtoMap.put(
                AnimalEnum.BEAR,
                new CharacteristicDto(250, 7, 2, 38, 15));
        animalCharacteristicDtoMap.put(
                AnimalEnum.EAGLE,
                new CharacteristicDto(6, 166, 4, 1, 5));
        animalCharacteristicDtoMap.put(
                AnimalEnum.HORSE,
                new CharacteristicDto(300, 23, 3, 45, 5));
        animalCharacteristicDtoMap.put(
                AnimalEnum.DEER,
                new CharacteristicDto(170, 41, 3, 26, 4));
        animalCharacteristicDtoMap.put(
                AnimalEnum.HARE,
                new CharacteristicDto(3, 750, 3, 0.45, 7));
        animalCharacteristicDtoMap.put(
                AnimalEnum.HAMSTER,
                new CharacteristicDto(0.03, 10000, 1, 0.0075, 3));
        animalCharacteristicDtoMap.put(
                AnimalEnum.GOAT,
                new CharacteristicDto(65, 107, 1, 10, 5));
        animalCharacteristicDtoMap.put(
                AnimalEnum.SHEEP,
                new CharacteristicDto(45, 156, 1, 7, 5));
        animalCharacteristicDtoMap.put(
                AnimalEnum.KANGAROO,
                new CharacteristicDto(47, 149, 2, 7, 8));
        animalCharacteristicDtoMap.put(
                AnimalEnum.COW,
                new CharacteristicDto(350, 20, 1, 53, 4));
        animalCharacteristicDtoMap.put(
                AnimalEnum.DUCK,
                new CharacteristicDto(1, 500, 1, 0.15, 4));
        animalCharacteristicDtoMap.put(
                AnimalEnum.CATERPILLAR,
                new CharacteristicDto(0.01, 10000, 1, 0.0025, 1));
    }

    public static CharacteristicDto getCharacteristicDto(AnimalEnum animalEnum) {
        return animalCharacteristicDtoMap.get(animalEnum);
    }

}
