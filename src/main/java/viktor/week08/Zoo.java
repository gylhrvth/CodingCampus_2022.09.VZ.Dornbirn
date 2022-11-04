package viktor.week08;

import batuhan.week03.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {

    private String name;
    private int yearOfFounding;
    private Futter feed;


    ArrayList<Gehege> list = new ArrayList<Gehege>();
    Map<String, Double> foods = new HashMap<String, Double>();

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

    public void printListWithEnclosures() {

        System.out.println("|----Zoo: " + name + ", gegründet " + yearOfFounding);
        for (Gehege g : list) {
            g.printGehege();

        }
    }

    public void putFoodToAnimal(Futter food, double quantity) {
        foods.put(food.getName(), quantity);
    }


    public void showAllFoods() {

        for (String i : foods.keySet()) {
            System.out.println(i + " " + foods.get(i));
        }
    }



    public String toString() {
        return "|----Zoo: " + name + ", gegründet " + yearOfFounding;
    }
}




