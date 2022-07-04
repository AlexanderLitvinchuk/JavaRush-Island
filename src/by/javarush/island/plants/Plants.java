package by.javarush.island.plants;

/**
 * Растения
  */
public class Plants {

    /**
     * Количество
     */
    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void reduceAmount(int i) {
        amount = amount - i;
    }
}
