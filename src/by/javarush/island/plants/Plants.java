package by.javarush.island.plants;

/**
 * Растения
 */
public class Plants {

    /**
     * Количество
     */
    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Уменьшение количества растений
     *
     * @param i - количество употребляемых растений, на которое будет уменьшено
     * @return Возвращает true когда есть достаточное количество растений, false - когда недостаточно
     */
    public boolean reduceAmount(double i) {
        amount = amount - i;
        if (amount < 0) {
            amount = 0;
            return false;
        }

        return true;
    }

    /**
     * Увеличивает количество растений на 5%
     */
    public void plantsGrewByFivePercent() {
        amount = amount + (amount / 100 * 5);
    }

}
