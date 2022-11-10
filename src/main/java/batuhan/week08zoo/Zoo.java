package batuhan.week08zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Zoo {


    private String zooName;
    private int foundingYear;

    private Vector<Gehege> enclosureList;
    private Vector<Animal> animallist;


    public Zoo(String name, int year) {
        zooName = name;
        foundingYear = year;
        enclosureList = new Vector<>();
    }

    public String getZooname() {
        return zooName;
    }

    public void addgehegelist(Gehege gehege) {
        enclosureList.add(gehege);
    }

    public void printStuktur() {
        System.out.println("├── Zoo: " + zooName + ", gegründet " + foundingYear);
        for (Gehege g : enclosureList) {
            g.printStuktur();


        }

    }


    public Map<Animalfeed, Double> calculateFoodMap() {
        Map<Animalfeed, Double> foodAmoutMap = new HashMap<>();

        for (Gehege g : enclosureList) {
            g.calculateFoodMap(foodAmoutMap);
        }
        return foodAmoutMap;
    }





}
