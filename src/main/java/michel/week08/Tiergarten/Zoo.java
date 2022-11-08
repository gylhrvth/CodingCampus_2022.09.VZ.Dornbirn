package michel.week08.Tiergarten;

import java.util.*;

public class Zoo {

    private final String name;
    private final int foundingYear;

    private final List<Enclosure> enclosureList = new ArrayList<>();

    private final List<ZooKeeper> zooKeeperList = new ArrayList<>();

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
    }


    public void getDailyFoodNeedsAndCosts() {
        Map<AnimalFeed, Double> foods = new HashMap<>();
        for (Enclosure enclosure : enclosureList) {
            for (Animal animal : enclosure.getAnimalList()) {
                AnimalFeed currentFood = animal.getFood();
                Double amount = foods.get(currentFood);
                if (amount == null) {
                    amount = 0.0;
                }
                amount += animal.getAmountOfFood();
                foods.put(currentFood, amount);
            }
        }
        double overallPrice = 0;
        System.out.println("\nTäglicher Futter Bedarf: ");
        for (Map.Entry<AnimalFeed, Double> entry : foods.entrySet()) {
            AnimalFeed food = entry.getKey();
            double amount = entry.getValue();
            double price = food.getUnitPrice() * amount;
            overallPrice += price;
            System.out.printf("%-17s %10.2f kg | %7.2f €\n", entry.getKey().getName(), entry.getValue(), price);
        }
        System.out.printf("Gesamtkosten pro Tag:  %18.2f €\n\n", overallPrice);
    }

    public void printZoo() {
        System.out.println("\n├── Zoo: " + name + ", gegründet " + foundingYear);
        for (Enclosure enc : enclosureList) {
            enc.printEnclosure();
        }
        for (ZooKeeper zooKeeper : zooKeeperList) {
            zooKeeper.printZooKeeper();
        }
    }

    public Enclosure searchAndCreateEnclosure(String name) {
        for (Enclosure enc : enclosureList) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        Enclosure enc = new Enclosure(name);
        enclosureList.add(enc);
        return enc;
    }

    public Animal searchAndCreateAnimal(String enclosureName, String name, String art, AnimalFeed food, Double amountOfFood,int bite,int maxHealth) {
        Enclosure enc = searchAndCreateEnclosure(enclosureName);
        return enc.searchAndCreate(name, art, food, amountOfFood,bite,maxHealth);
    }

    public void searchAndCreateZooKeeper(String name, String... enclosureNames) {
        for (ZooKeeper zooKeeper : zooKeeperList) {
            if (zooKeeper.getName().equals(name)) {
                return;
            }

        }
        ZooKeeper zooKeeper = new ZooKeeper(name);
        zooKeeperList.add(zooKeeper);
        for (String encName : enclosureNames) {
            zooKeeper.putTaskToZooKeeper(searchAndCreateEnclosure(encName));
        }
    }
    public void simulateDay(){
        Vector<Enclosure> enclosuresToClean = new Vector<>(enclosureList);
        int countEnclosureLeftToClean = Integer.MAX_VALUE;
        while(!enclosuresToClean.isEmpty()&&enclosuresToClean.size()<countEnclosureLeftToClean){
            countEnclosureLeftToClean = enclosuresToClean.size();
            for (ZooKeeper zooKeeper:zooKeeperList) {
                zooKeeper.simulateDay(enclosuresToClean);
            }
        }
        for (Enclosure enclosure:enclosuresToClean) {
            System.out.println(enclosure.getName() + " hat keinen Pfleger, es wurde nicht betreut!");
        }
        System.out.println();
        for (Enclosure enc:enclosureList) {
            enc.simulateAttacks();
        }
    }

}
