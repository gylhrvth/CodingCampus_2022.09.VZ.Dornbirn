package viktor.week08;

import java.util.*;

public class Pfleger {

    private String name;
    HashSet<Gehege> listOfGehege = new HashSet<>();


    public Pfleger(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void addGehegeForPfleger(Gehege g) {
        listOfGehege.add(g);
    }


    public void printStructure() {
        System.out.printf("|    |---- Pfleger: %s, zuständig für ", name);
        boolean comma = true;

        for (Gehege g : listOfGehege) {
            if (!comma) {
                System.out.print(", ");
            }
            comma = false;
            System.out.print(g.getDiscription());
        }

        System.out.println();
    }

    public void simulateDay(ArrayList<Gehege> zumPutzen){
        for(Gehege gehege: listOfGehege){
            if (zumPutzen.contains(gehege)){
                gehege.simulation(this);
                zumPutzen.remove(gehege);
                break;
            }
        }
    }

}
