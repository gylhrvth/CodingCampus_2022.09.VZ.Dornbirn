package viktor.week08;

import java.util.ArrayList;

public class Gehege {

    private String description;

    ArrayList<Tier> animalsOfList = new ArrayList<Tier>();


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

        if (animalsOfList.isEmpty()) {
            System.out.println("|             |---- (Leer)");
        } else {
            for (Tier t : animalsOfList) {
                {
                    System.out.printf("|             |---- " + t);
                }
            }
        }
    }

    @Override
    public String toString() {
        return " Gehege: " + description + "\n";

    }
}
