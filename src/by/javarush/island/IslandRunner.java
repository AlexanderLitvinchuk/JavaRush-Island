package by.javarush.island;

import by.javarush.island.animal.chances.FoodChances;
import by.javarush.island.animal.characteristic.Characteristic;
import by.javarush.island.location.Location;
import by.javarush.island.location.LocationPrint;

public class IslandRunner {

    public static void main(String[] args) {

        FoodChances foodChances = new FoodChances();
        Characteristic characteristic = new Characteristic();
        Location location = new Location(characteristic);

        LocationPrint.print(location.getIsland());


        for (int i = 0; i < 100; i++) {
            goTact(location);

        }

        System.out.println("Test");

    }

    private static void goTact(Location location) {
        // Каждая клетка в своём потоке смотрит, кто кого может сожрать
        // Голодные умирают
        // Смотрим, если не голодный - размножаемся
        // Если голодный - переход
    }

}
