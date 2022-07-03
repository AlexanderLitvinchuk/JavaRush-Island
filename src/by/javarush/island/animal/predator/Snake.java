package by.javarush.island.animal.predator;

import by.javarush.island.animal.AnimalEnum;

public class Snake extends Predator {
    @Override
    public AnimalEnum getAnimal() {
        return AnimalEnum.SNAKE;
    }
}
