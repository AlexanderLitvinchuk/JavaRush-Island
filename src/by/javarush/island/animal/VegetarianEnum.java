package by.javarush.island.animal;

public enum VegetarianEnum {

    HORSE("Лошадь"),
    DEER("Олень"),
    HARE("Заяц"),
    HAMSTER("Хомяк"),
    GOAT("Коза"),
    SHEEP("Овца"),
    KANGAROO("Кенгуру"),
    COW("Корова"),
    DUCK("Утка"),
    CATERPILLAR("Гусеница")
    ;

    private final String description;

    VegetarianEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
