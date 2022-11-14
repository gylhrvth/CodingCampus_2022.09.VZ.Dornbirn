package batuhan.week08zoo;

import java.util.Vector;

public class Animalfeed {

    private String food;
    private double price;
    private int amountInKG;
    private Vector<Zookeeper> zookeeper = new Vector<Zookeeper>();
    private String timeToEat;


    public Animalfeed(String food, double price, int amountInKG) {
        this.food = food;
        this.price = price;
        this.amountInKG = amountInKG;

    }

    public double getPrice() {
        return price;
    }

    public int getAmountInKG() {
        return amountInKG;
    }

    public void setAmountInKG(int amountInKG) {
        this.amountInKG = amountInKG;
    }

    public void setFood() {
        this.food = food;
    }

    public void setPrice() {
        this.price = price;
    }


    public void setAmountInKG() {
        this.amountInKG = amountInKG;
    }

    public String getFood() {
        return food;
    }

    public String toString() {

        return food;
    }


}

