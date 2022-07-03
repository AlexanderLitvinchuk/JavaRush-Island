package by.javarush.island.animal;

import by.javarush.island.animal.predator.*;
import by.javarush.island.animal.vegetarian.*;

public class AnimalFactory {

    /**
     * Фабрика по созданию животных
     *
     * @param animalEnum Животное из enum AnimalEnum
     * @return новый объект типа Animal
     */
    public static Animal getAnimal(AnimalEnum animalEnum) {
        switch (animalEnum) {
            case WOLF:
                return new Wolf();
            case SNAKE:
                return new Snake();
            case FOX:
                return new Fox();
            case BEAR:
                return new Bear();
            case EAGLE:
                return new Eagle();
            case HORSE:
                return new Horse();
            case DEER:
                return new Deer();
            case HARE:
                return new Hare();
            case HAMSTER:
                return new Hamster();
            case GOAT:
                return new Goat();
            case SHEEP:
                return new Sheep();
            case KANGAROO:
                return new Kangaroo();
            case COW:
                return new Cow();
            case DUCK:
                return new Duck();
            case CATERPILLAR:
                return new Caterpillar();
            default:
                return null;
        }
    }
}
