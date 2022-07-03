package by.javarush.island.animal.characteristic;

/**
 * Характеристики животных
 */
public class CharacteristicDto {

    /**
     * Вес одного животного, кг
     */
    private double weight;

    /**
     * Максимальное количество животных этого вида на одной клетке
     */
    private int maximumAmount;

    /**
     * Скорость перемещения, не более чем, клеток за ход
     */
    private int movedSpeed;

    /**
     * Сколько килограммов энергия нужна животному для полного насыщенность
     */
    private double energy;

    /**
     * Сколько ходов (тактов) животное может жить после падения шкалы сытости до нуля
     */
    private int countLife;

    public CharacteristicDto(double weight, int maximumAmount, int movedSpeed, double energy, int countLife) {
        this.weight = weight;
        this.maximumAmount = maximumAmount;
        this.movedSpeed = movedSpeed;
        this.energy = energy;
        this.countLife = countLife;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMovedSpeed() {
        return movedSpeed;
    }

    public void setMovedSpeed(int movedSpeed) {
        this.movedSpeed = movedSpeed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public int getCountLife() {
        return countLife;
    }

    public void setCountLife(int countLife) {
        this.countLife = countLife;
    }
}
