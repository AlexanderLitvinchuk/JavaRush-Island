package by.javarush.island.animal.predator;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalTypeEnum;
import by.javarush.island.animal.directions.DirectionsDrivingEnum;
import by.javarush.island.cell.Cell;

public abstract class Predator extends Animal {

    @Override
    public AnimalTypeEnum getAnimalType() {
        return AnimalTypeEnum.PREDATOR;
    }

    @Override
    public void eat(Cell cell) {

    }

//    @Override
//    public void eatV2(Cell cell) {
//        FoodChances foodChances = new FoodChances();
//
//        AnimalEnum animalEnum = getAnimal();
//        CharacteristicDto characteristicDto = Characteristic.getCharacteristicDto(animalEnum);
//        Map<AnimalEnum, Integer> animalEnumIntegerMap = foodChances.getAnimalEnumMapMap().get(animalEnum);
//        List<Animal> животныеКоторыеМожноСкушать = cell.getAnimals().stream()
//                .filter(animal -> animalEnumIntegerMap.get(animal.getAnimal()) != 0)
//                .collect(Collectors.toList());
//
//        if (животныеКоторыеМожноСкушать.size() == 0) {
//            addOneTackHunger();
//        } else {
//            double energy = characteristicDto.getEnergy();
//            double скушал = 0;
//            while (скушал < energy) {
//                животныеКоторыеМожноСкушать.
//            }
//
//        }
//    }

    @Override
    public void multiply() {

    }

    @Override
    public DirectionsDrivingEnum chooseDirectionOfTravel() {
        return null;
    }
}
