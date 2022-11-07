package milan.week08.zoo;

import java.util.ArrayList;
import java.util.Vector;

public class Gehege {

    private String name;
    private Vector<Tier> tiereListe;
    private ArrayList<Aufgabe> toDo;

    private boolean status;

    public Gehege(String name) {

        this.name = name;
        tiereListe = new Vector<>();
        toDo = new ArrayList<>();
        status = false;

    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusText(){
        String result = null;
        if (status){
            result = "Aufgaben in " + name + " wurden erledigt!!";
        } else {
            result = "Aufgaben in " + name + " wurden noch nicht erledigt!!";
        }
        return result;
        //return status?"Aufgaben in " + name + " wurden erledigt!!":"Aufgaben in " + name + " wurden noch nicht erledigt!!";
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public ArrayList<Aufgabe> getToDo() {
        return toDo;
    }
}
