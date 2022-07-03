package by.javarush.island.animal;

public enum AnimalEnum {

    PREDATOR("Хищник"),
    VEGETARIAN("Травоядные");

    /**
     * Описание подкласса животного
     */
    private final String description;

    AnimalEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
