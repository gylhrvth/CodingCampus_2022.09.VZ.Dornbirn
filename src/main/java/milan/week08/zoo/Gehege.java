package milan.week08.zoo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Gehege {

    private static Random ran = new Random();
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

//    public void printFoodStatistic() {
//        for (Tier x : tiereListe) {
//            System.out.println(x.getNahrung().getName() + " " + x.getMenge());
//        }
//    }

    public String getStatusText() {
        String result = null;
        if (status) {
            result = "Aufgaben in " + name + " wurden erledigt!!";
        } else {
            result = "Aufgaben in " + name + " wurden noch nicht erledigt!!";
        }
        return result;
        // Alternative: (? = if true) (: = else)
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


    public Tier findWeakestAnimal() {
        Tier tmp = null;
        for (Tier x : tiereListe) {
            if (tmp == null || x.getRelativeGesundheit() < tmp.getRelativeGesundheit()) {
                tmp = x;
            }
        }
        return tmp;
    }

    public void removeDeadAnimals() {
        for (int i = 0; i < tiereListe.size(); ) {
            Tier x = tiereListe.get(i);
            if (x.getGesundheit() < 1) {
                System.out.println(x.getName() + " ist gestorben\n ---- R.I.P ----");
                tiereListe.remove(i);
            } else {
                ++i;
            }
        }
    }
    /* Alternative:
        public void removeDeadAnimals() {
            Vector<Tier> deadAnimals = new Vector<>();
            for (Tier x : tiereListe) {
                if (x.getGesundheit() < 1) {
                    System.out.println(x.getName() + " ist gestorben\n ---- R.I.P ----");
                    deadAnimals.add(x);
                }
            }
            for (Tier x: deadAnimals) {
                tiereListe.remove(x);
            }
        }
    */

    public void rumbleInTheJungle() {
        for (Tier tier : tiereListe) {
            int opfer = ran.nextInt(tiereListe.size());
            if (opfer != tiereListe.indexOf(tier)) {
                tier.attack(tiereListe.get(opfer));
            }
        }
    }

    public void printTierGesundheitStatistic() {
        StringBuilder text = new StringBuilder("|--- Gehege: " + getName() + "\n");
        for (Tier tier : tiereListe) {
            text.append("|    |--- Tier: ").append(tier.getName()).append(" hat eine Gesundheit von: ").append(tier.getRelativeGesundheit()).append("%.\n");
        }
        System.out.println(text);
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
