package by.javarush.island.animal.vegetarian;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.animal.AnimalTypeEnum;
import by.javarush.island.animal.characteristic.Characteristic;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;
import by.javarush.island.cell.Cell;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Vegetarian extends Animal {

    @Override
    public AnimalTypeEnum getAnimalType() {
        return AnimalTypeEnum.VEGETARIAN;
    }

    public boolean isNotVegan() {
        return false;
    }

    @Override
    public void eat(Cell cell) {
        // Если животное живое
        if (isLive()) {
            boolean isAteFull;
            if (isNotVegan()) {
                // ПсевдоВеган кушает
                Set<AnimalEnum> animalEnums = getFoodChances().keySet();
                // получаем список живых животных которых мы можем скушать
                List<Animal> collect = cell.getAnimals().stream()
                        .filter(Animal::isLive)
                        .filter(animal -> animalEnums.contains(animal.getAnimal()))
                        .collect(Collectors.toList());
                double energy = getCharacteristic().getEnergy();

                for (Animal animal : collect) {
                    // Тип животного, который мы кушаем
                    AnimalEnum animalEnum = animal.getAnimal();
                    // Вес животного, который мы кушаем
                    double weight = Characteristic.getCharacteristicDto(animalEnum).getWeight();
                    energy = energy - weight;
                    // Помечаем что животное скушано
                    animal.killAnimal();

                    // Когда съели достаточно - выходим из цикла
                    if (energy <= 0)
                        break;
                }

                // Если животными не наелись, кушаем траву
                if (energy > 0) {
                    isAteFull = cell.getPlants().reduceAmount(energy);
                } else
                    isAteFull = true;
            } else {
                isAteFull = cell.getPlants().reduceAmount(getCharacteristic().getEnergy());
            }
            // Проверяем наелось животное - сбросили счётчик голода, иначе добавляем + 1 ход
            if (isAteFull) {
                resetHungerCounter();
            } else {
                addOneTackHunger();
            }
        }
    }

    @Override
    public void multiply() {

    }

    @Override
    public DirectionsDrivingEnum chooseDirectionOfTravel() {
        return null;
    }
}
