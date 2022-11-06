package patric.week08.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private int yearOfFounding;

    ArrayList<Gehege> list = new ArrayList<>();

    public Zoo(String name, int yearOfFounding) {
        this.name = name;
        this.yearOfFounding = yearOfFounding;

    }

    public void putGehegeToZoo(Gehege d) {
        list.add(d);
    }

    public void removeGehegeFromZoo(Gehege d) {
        list.remove(d);
    }


    public void printListWithGehege() {

        System.out.println("|----Zoo: " + name + ", Gründungsjahr " + yearOfFounding);
        for (Gehege g : list) {
            g.printGehege();

        }
    }

    public double calculateFoodPricePerDay() {
        double price = 0;
        for (Gehege g : list) {
            price += g.calculateFoodPricePerDay();
        }
        return price;
    }

    public Map<Futter, Double> calculateFoodMap() {
        //Futter wird als Schlüssel verwendet
        //der Wert ist die Menge vom Futter
        Map<Futter, Double> futterAmountMap = new HashMap<>();
        for(Gehege g : list) {
            for(Tier t : g.listOfAnimals) {
                Futter currentFutter = t.getFutterToTier();
                Double currentSumOfTierFutter = futterAmountMap.get(currentFutter);
                if (currentSumOfTierFutter == null) {
                    currentSumOfTierFutter = t.getAmountOfFutter();
                } else {
                    currentSumOfTierFutter += t.getAmountOfFutter();
                }
                futterAmountMap.put(currentFutter, currentSumOfTierFutter);
            }
        }
        return futterAmountMap;
    }

    public String toString() {
        return "|------Zoo:" + name + "Gründungsjahr" + yearOfFounding;
    }


}
