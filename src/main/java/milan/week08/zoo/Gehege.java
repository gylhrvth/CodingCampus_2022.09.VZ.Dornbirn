package milan.week08.zoo;

import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tier> tiereListe;

    public Gehege(String name) {

        this.name = name;
        tiereListe = new Vector<>();

    }

    public void addAnimalToList(Tier tier) {
        tiereListe.add(tier);
    }

    public String printStructure() {
        StringBuilder text = new StringBuilder("|    |--- Gehege: " + getName() + "\n");
        if (tiereListe.size() > 0) {
            for (Tier x :tiereListe) {
                text.append("|         |--- ").append(x.getName()).append(", ").append(x.getGattung()).append("\n");
            }
        } else {
            text.append("|         |--- (leer)");
        }
        return text.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Vector<Tier> getTiereListe(){
        return tiereListe;
    }
}
