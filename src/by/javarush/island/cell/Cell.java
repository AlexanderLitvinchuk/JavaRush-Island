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

    /**
     * ушло животных всего
     */
    private int totalAnimalsGone = 0;

    /**
     * Пришло животных всего
     */
    private int totalAnimalsCame = 0;

    /**
     * Умерло животных
     */
    private int deadAnimals = 0;

    /**
     * Съедено животных
     */
    private int eatenAnimals = 0;

    public void resetCounters() {
        totalAnimalsCame = 0;
        totalAnimalsGone = 0;
        deadAnimals = 0;
        eatenAnimals = 0;
    }

    /**
     * увеличить счетчик на одно животное которые ушло
     */
    public void addToTotalAnimalsGone(int i) {
        this.totalAnimalsGone = this.totalAnimalsGone + i;
    }

    /**
     * увеличить счетчик на одно животное которые пришло
     */
    public synchronized void addOneToTotalAnimalsCame() {
        this.totalAnimalsCame++;
    }

    /**
     * увеличить счетчик на одно животное которые умерло
     */
    public void addOneToDeadAnimals() {
        this.deadAnimals++;
    }

    /**
     * увеличить счетчик на одно животное которые съедено
     */
    public void addOneToEatenAnimals() {
        this.eatenAnimals++;
    }

    public int getEatenAnimals() {
        return eatenAnimals;
    }

    public int getDeadAnimals() {
        return deadAnimals;
    }

    public int getTotalAnimalsGone() {
        return totalAnimalsGone;
    }

    public int getTotalAnimalsCame() {
        return totalAnimalsCame;
    }

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
