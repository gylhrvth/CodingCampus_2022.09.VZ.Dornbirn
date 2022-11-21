package milan.week08.zoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Pfleger {

    private static Random ran = new Random();
    private String name;
    private ArrayList<Gehege> gehegeListe;


    public Pfleger(String name) {
        this.name = name;
        gehegeListe = new ArrayList<>();

    }

    public void getToTheChoppa() {
        StringBuilder text = new StringBuilder();
        for (Gehege x : gehegeListe) {
            if (!x.getStatus()) {
                text.append(getName()).append(" erledigt folgende Arbeiten im Gehege ").append(x.getName()).append(":\n");
                x.getToDo().sort(new Comparator<Aufgabe>() {
                    @Override
                    public int compare(Aufgabe o1, Aufgabe o2) {
                        if (o1.getAufgabeNamen().equals(o2.getAufgabeNamen())) {
                            return 0;
                        }
                        if (o1.getAufgabeNamen().equals("fuettert")) {
                            return -1;
                        }
                        return 0;
                    }
                });
                for (Aufgabe y : x.getToDo()) {
                    if (!y.getAufgabeNamen().equals("beobachtet")) {
                        text.append("...").append(y.getAufgabeNamen()).append("\n");
                    } else {
                        Tier beobachten = x.getTiereListe().get(ran.nextInt(x.getTiereListe().size()));
                        text.append("...").append(beobachten.getGattung()).append(" ").append(beobachten.getName()).append(" wird länger ").append(y.getAufgabeNamen()).append("\n");
                    }
                }
                x.setStatus(true);
            }
        }
        System.out.print(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGehege(Gehege gehege) {
        gehegeListe.add(gehege);
    }

}
