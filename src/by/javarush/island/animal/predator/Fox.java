package by.javarush.island.animal.predator;

import by.javarush.island.animal.PredatorEnum;

public class Fox extends Predator {
    @Override
    public PredatorEnum getPredatorType() {
        return PredatorEnum.FOX;
    }

}
