package michel.week08.Tiergarten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {

    private String name;
    private int foundingYear;

    private Enclosure enclosure;
    private Animal animal;
    private List<Enclosure> enclosureList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }


    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
    }

    public void addGehege(Enclosure selectedEnclosure) {
        enclosureList.add(selectedEnclosure);
    }

    public void removeGehege(Enclosure selectedEnclosure) {
        enclosureList.remove(selectedEnclosure);
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
            Double price = food.getUnitPrice() * amount;
            overallPrice += price;
            System.out.printf("%-17s %10.2f kg | %5.2f €\n", entry.getKey().getName(), entry.getValue(), price);
        }
        System.out.printf("Gesammtkosten pro Tag:  %15.2f €\n\n", overallPrice);
    }

    public void printZoo() {
        System.out.println("|--- Zoo: " + name + ", gegründet " + foundingYear);
        for (Enclosure g : enclosureList) {
            g.printEnclosure();
        }
    }

    public String toString() {
        return "Zoo: " + name + ", gegründet " + foundingYear;
    }
}
