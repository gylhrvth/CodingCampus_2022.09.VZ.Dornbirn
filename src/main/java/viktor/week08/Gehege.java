package viktor.week08;

import java.util.ArrayList;
import java.util.List;

public class Gehege {

    private String description;

    ArrayList<Tier> animalsOfList = new ArrayList<Tier>();
    ArrayList<Pfleger> pflegerList = new ArrayList<>();

    public Gehege(String description) {
        this.description = description;
    }

    public String getGehege() {
        return description;
    }

    public void putTierToGehege(Tier t) {
        animalsOfList.add(t);
    }

    public void removeTierFromGehege(Tier t) {
        animalsOfList.remove(t);
    }


    public void printGehege() {
        System.out.println("|    |---- Gehege: " + description);

        if (pflegerList.isEmpty()) {
            System.out.println("|    |---- Pfleger: keine");
        }

        if (animalsOfList.isEmpty()) {
            System.out.println("|             |---- (Leer)");

        } else {
            for (Pfleger p : pflegerList) {
                System.out.println("|    |---- " + p);
            }
            for (Tier t : animalsOfList) {
                {
                    System.out.printf("|             |---- " + t);
                }
            }
        }
    }

    public void putMaintenerToGehege(Pfleger p) {
        pflegerList.add(p);
    }


    @Override
    public String toString() {
        return " Gehege: " + description + "\n";


    }
}
