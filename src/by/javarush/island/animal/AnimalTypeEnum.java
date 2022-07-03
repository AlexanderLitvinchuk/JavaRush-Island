package by.javarush.island.animal;

public enum AnimalTypeEnum {

    PREDATOR("Хищник"),
    VEGETARIAN("Травоядные");

    /**
     * Описание подкласса животного
     */
    private final String description;

    AnimalTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
