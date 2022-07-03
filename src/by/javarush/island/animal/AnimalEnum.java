package by.javarush.island.animal;

public enum AnimalEnum {

    WOLF(AnimalTypeEnum.PREDATOR, "Волк"),
    SNAKE(AnimalTypeEnum.PREDATOR, "Змея"),
    FOX(AnimalTypeEnum.PREDATOR, "Лиса"),
    BEAR(AnimalTypeEnum.PREDATOR, "Медведь"),
    EAGLE(AnimalTypeEnum.PREDATOR, "Орел"),
    HORSE(AnimalTypeEnum.VEGETARIAN, "Лошадь"),
    DEER(AnimalTypeEnum.VEGETARIAN, "Олень"),
    HARE(AnimalTypeEnum.VEGETARIAN, "Заяц"),
    HAMSTER(AnimalTypeEnum.VEGETARIAN, "Хомяк"),
    GOAT(AnimalTypeEnum.VEGETARIAN, "Коза"),
    SHEEP(AnimalTypeEnum.VEGETARIAN, "Овца"),
    KANGAROO(AnimalTypeEnum.VEGETARIAN, "Кенгуру"),
    COW(AnimalTypeEnum.VEGETARIAN, "Корова"),
    DUCK(AnimalTypeEnum.VEGETARIAN, "Утка"),
    CATERPILLAR(AnimalTypeEnum.VEGETARIAN, "Гусеница");

    private final AnimalTypeEnum animalTypeEnum;

    /**
     * Описание подкласса животного
     */
    private final String description;

    AnimalEnum(AnimalTypeEnum animalTypeEnum, String description) {
        this.animalTypeEnum = animalTypeEnum;
        this.description = description;
    }

    public AnimalTypeEnum getAnimalTypeEnum() {
        return animalTypeEnum;
    }

    public String getDescription() {
        return description;
    }
}
