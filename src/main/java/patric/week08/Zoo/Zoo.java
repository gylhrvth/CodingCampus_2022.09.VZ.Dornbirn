package patric.week08.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private int yearOfFounding;

    ArrayList<Gehege> geheheList = new ArrayList<>();

    public Zoo(String name, int yearOfFounding) {
        this.name = name;
        this.yearOfFounding = yearOfFounding;

    }

    public void putGehegeToZoo(Gehege d) {
        geheheList.add(d);
    }

    public void removeGehegeFromZoo(Gehege d) {
        geheheList.remove(d);
    }


    public void printListWithGehege() {

        System.out.println("|----Zoo: " + name + ", Gründungsjahr " + yearOfFounding);
        for (Gehege g : geheheList) {
            g.printGehege();

        }
    }

    public double calculateFoodPricePerDay() {
        double price = 0;
        for (Gehege g : geheheList) {
            price += g.calculateFoodPricePerDay();
        }
        return price;
    }

    public Map<Futter, Double> calculateFoodMap() {
        //Futter wird als Schlüssel verwendet
        //der Wert ist die Menge vom Futter
        Map<Futter, Double> futterAmountMap = new HashMap<>();
        for (Gehege g : geheheList) {
            g.calculateFoodMap(futterAmountMap);
        }
        return futterAmountMap;
    }

    public String toString() {
        return "|------Zoo:" + name + "Gründungsjahr" + yearOfFounding;
    }

    public void simulate() {
        for (Gehege g : geheheList) {
            g.simulate();
        }
    }
}
