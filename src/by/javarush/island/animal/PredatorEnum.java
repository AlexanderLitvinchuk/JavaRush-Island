package by.javarush.island.animal;

public enum PredatorEnum {
    WOLF("Волк"),
    SNAKE("Змея"),
    FOX("Лиса"),
    BEAR("Медведь"),
    EAGLE("Орел")
    ;

    private final String description;

    PredatorEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
