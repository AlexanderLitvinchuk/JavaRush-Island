package by.javarush.island.animal.task;

import by.javarush.island.animal.Animal;
import by.javarush.island.animal.AnimalEnum;
import by.javarush.island.animal.AnimalFactory;
import by.javarush.island.animal.characteristic.Characteristic;
import by.javarush.island.animal.characteristic.CharacteristicDto;
import by.javarush.island.cell.Cell;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CellTask implements Runnable {

    private final Cell cell;

    public CellTask(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void run() {
        // Растения растут на 5 %
        cell.getPlants().plantsGrewByFivePercent();
        // каждое животное кушает
        cell.getAnimals().forEach(animal -> animal.eat(cell));
        // животные, которые голодные уже N ходов умирают
        cell.getAnimals().forEach(animal -> {
            if (animal.getAmountOfHunger() > animal.getCharacteristic().getCountLife())
                animal.killAnimal();
        });
        //  Поиск животные которые не живые
        List<Animal> notLiveAnimalList = cell.getAnimals().stream()
                .filter(animal -> !animal.isLive())
                .collect(Collectors.toList());
        // Удаляем не живых животных
        cell.getAnimals().removeAll(notLiveAnimalList);

        // Размножение животных
        // Подсчет сколько животных готово к размножению
        Map<AnimalEnum, Long> countMultiply = cell.getAnimals().stream()
                .filter(Animal::multiply)
                .collect(Collectors.groupingBy(
                        Animal::getAnimal,
                        Collectors.counting()
                ));

        // Сколько животных в клетке
        Map<AnimalEnum, Long> countAnimal = cell.getAnimals().stream()
                .collect(Collectors.groupingBy(
                        Animal::getAnimal,
                        Collectors.counting()
                ));

        // для каждого вида животных
        countMultiply.forEach((animalEnum, aLong) -> {
            // получаем информацию настроек животных
            CharacteristicDto characteristicDto = Characteristic.getCharacteristicDto(animalEnum);
            // проходим по каждому второму животному (2 животных порождают одного нового)
            for (int i = 0; i < aLong / 2; i++) {
                // общее количество в клетке
                Long aLong1 = countAnimal.get(animalEnum);
                // пока в клетке есть место для нового животного - создаем и помещаем к животным
                if (characteristicDto.getMaximumAmount() > aLong1) {
                    cell.getAnimals().add(AnimalFactory.getAnimal(animalEnum));
                    countAnimal.put(animalEnum, ++aLong1);
                } else {
                    // мест нет - завершаем цикл для этого типа животных
                    break;
                }
            }
        });
    }
}
