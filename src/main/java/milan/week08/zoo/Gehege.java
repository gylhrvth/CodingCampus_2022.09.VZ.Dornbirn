package milan.week08.zoo;

import java.util.ArrayList;
import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tier> tiereListe;
    private ArrayList<Aufgabe> toDo;

    public Gehege(String name) {

        this.name = name;
        tiereListe = new Vector<>();
        toDo = new ArrayList<>();

    }

    public void addToDos(Aufgabe todo) {
        toDo.add(todo);
    }

    public void addAnimalToList(Tier tier) {
        tiereListe.add(tier);
    }

    public String printStructure() {
        StringBuilder text = new StringBuilder("|    |--- Gehege: " + getName() + "\n");
        if (tiereListe.size() > 0) {
            for (Tier x : tiereListe) {
                text.append("|         |--- ").append(x.getName()).append(", ").append(x.getGattung()).append("\n");
            }
        } else {
            text.append("|         |--- (leer)\n");
        }
        return text.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Vector<Tier> getTiereListe() {
        return tiereListe;
    }
}
