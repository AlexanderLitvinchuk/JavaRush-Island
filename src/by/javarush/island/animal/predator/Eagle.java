package by.javarush.island.animal.predator;

import by.javarush.island.animal.PredatorEnum;

public class Eagle extends Predator {
    @Override
    public PredatorEnum getPredatorType() {
        return PredatorEnum.WOLF;
    }
}
