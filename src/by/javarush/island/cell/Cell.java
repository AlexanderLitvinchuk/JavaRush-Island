package by.javarush.island.cell;

import by.javarush.island.animal.Animal;
import by.javarush.island.plants.Plants;

import java.util.ArrayList;
import java.util.List;

/**
 * Клетка поля
 */
public class Cell {

    private List<Animal> animals = new ArrayList<>();
    private Plants plants = new Plants();


    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Plants getPlants() {
        return plants;
    }

    public void setPlants(Plants plants) {
        this.plants = plants;
    }
}
