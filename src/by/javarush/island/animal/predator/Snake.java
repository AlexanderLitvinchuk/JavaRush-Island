package by.javarush.island.animal.predator;

import by.javarush.island.animal.Predator;
import by.javarush.island.animal.PredatorEnum;

public class Snake extends Predator {
    @Override
    public PredatorEnum getPredatorType() {
        return PredatorEnum.SNAKE;
    }
}
