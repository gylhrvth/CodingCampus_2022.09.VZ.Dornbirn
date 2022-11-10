package patric.week08.Zoo;


import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Gehege {
    private static Random rand = new Random();

    private String description;

    private ArrayList<Tier> tierList = new ArrayList<Tier>();

    private ArrayList<Pfleger> pflegerList = new ArrayList<>();

    public Gehege(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void putTierToGehege(Tier t) {
        tierList.add(t);
    }

    public void removeTierFromGehege(Tier t) {
        tierList.remove(t);
    }


    public void printGehege() {
        System.out.println("|   |---Gehege: " + description);
        /* Pfleger */
        if (pflegerList.isEmpty()) {
            System.out.println("|   |---Pfleger: kein Pfleger eingeteilt ! ");
        } else {
            for (Pfleger pf : pflegerList) {
                System.out.println("|    |----" + pf);
            }
        }
        /* Tiere */
        if (tierList.isEmpty()) {
            System.out.println("|             |---- (Leer)");
        } else {
            for (Tier t : tierList) {
                {
                    System.out.printf("|             |------------------- " + t);
                }
            }
        }
    }

    public double calculateFoodPricePerDay() {
        double price = 0;
        for (Tier t : tierList) {
            price += t.calculateFoodPricePerDay();
        }
        return price;
    }

    public void putPflegerToGehege(Pfleger pf) {
        pflegerList.add(pf);
    }

    @Override
    public String toString() {
        return "Gehege{" +
                "description='" + description + '\'' +
                '}';

    }


    public void simulate() {
        System.out.println("Gehege " + description + " muss gereinigt werden.");
        Pfleger tageVerantwortlicher = pflegerList.get(rand.nextInt(pflegerList.size()));
        Tier tierZuBeobachten = tierList.get(rand.nextInt(tierList.size()));
        tageVerantwortlicher.simulate(this, tierZuBeobachten);


        for (Tier t : tierList) {
            // 40% Wahrscheinlichkeit
            if (rand.nextDouble() < 0.4) {
                Tier tierZuBeisen = tierList.get(rand.nextInt(tierList.size()));

                if (t.getGesundheit() > 0 &&  // Tote Tiere beissen nicht
                        !t.equals(tierZuBeisen)) { // Selbst bissen keine Tiere
                    tierZuBeisen.biss(t);
                }
            }
        }
    }

    public void calculateFoodMap(Map<Futter, Double> futterAmountMap){
        for (Tier t : tierList) {
            t.calculateFoodMap(futterAmountMap);
        }
    }

}
