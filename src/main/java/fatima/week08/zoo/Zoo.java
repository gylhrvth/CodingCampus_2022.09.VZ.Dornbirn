package fatima.week08.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Zoo {

    private String name;
    private int year;

    private List<Enclosure> enclosureList;

    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;

        enclosureList = new Vector<>();
    }

    public void addEnclosure(Enclosure... enclosures) {
        enclosureList.addAll(Arrays.asList(enclosures));
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printStructure() {
        System.out.println("├── zoo: " + name + ", established in " + year);
        for (Enclosure enc : enclosureList) {
            enc.printStructure();
        }
    }

    public void simulateOneDay() {
        System.out.println();
        System.out.println("A new day at the zoo '" + name + "' begins \n");
        for(Enclosure e : enclosureList) {
            e.doWork();
            System.out.println();
        }
    }
}
