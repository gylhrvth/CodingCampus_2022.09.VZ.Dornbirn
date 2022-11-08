package patric.week08.Zoo;


import java.util.ArrayList;

public class Gehege {

    private String description;

    ArrayList<Tier> listOfAnimals = new ArrayList<Tier>();

    ArrayList<Pfleger> pflegerList = new ArrayList<>();

    public Gehege(String description) {
        this.description = description;
    }

    public String getGehege() {
        return description;
    }

    public void putTierToGehege(Tier t) {
        listOfAnimals.add(t);
    }

    public void removeTierFromGehege(Tier t) {
        listOfAnimals.remove(t);
    }


    public void printGehege() {
        System.out.println("|   |---Gehege: " + description);
        if (pflegerList.isEmpty()) {
            System.out.println("|   |---Pfleger: kein Pfleger eingeteilt ! ");
        }
        if (listOfAnimals.isEmpty()) {
            System.out.println("|             |---- (Leer)");
        } else {
            for (Pfleger pf : pflegerList) {
                System.out.println("|    |----" + pf);
            }
            for (Tier t : listOfAnimals) {
                {
                    System.out.printf("|             |------------------- " + t);
                }
            }
        }
    }

    public double calculateFoodPricePerDay() {
        double price = 0;
        for (Tier t : listOfAnimals) {
            price += t.getFutterToTier().getEinheitPreis() * t.getAmountOfFutter();
        }
        return price;
    }
    public void putPflegerToGehege(Pfleger pf){
        pflegerList.add(pf);
    }
    @Override
    public String toString() {
        return "Gehege{" +
                "description='" + description + '\'' +
                '}';

    }


}
