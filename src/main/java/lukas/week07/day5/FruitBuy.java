package lukas.week07.day5;

public class FruitBuy {
    private Fruit fruit;
    private int amount;

    public FruitBuy(Fruit fruit, int amount) {
        this.fruit = fruit;
        this.amount = amount;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public int getAmount() {
        return amount;
    }
}
