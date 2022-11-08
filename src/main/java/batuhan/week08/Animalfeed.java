package batuhan.week08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
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

    public void setFood() {
        this.food = food;
    }

    public void setPrice() {
        this.price = price;
    }


    public void setAmountInKG() {
        this.amountInKG = amountInKG;
    }






    public String toString() {
//        System.out.println(" benötigt" + amountInKG +"KG" + feed +"dies kostet je KG" + price);
        return " benötigt " + amountInKG + "KG " + food + " dies kostet je KG " + price ;
    }


}

