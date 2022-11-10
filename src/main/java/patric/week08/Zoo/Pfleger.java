package patric.week08.Zoo;


import java.util.ArrayList;
import java.util.List;

public class Pfleger {

    private String name;

    private String lieblingsGattung;
    List<String> aufgabenPfleger = new ArrayList<>();


    public Pfleger(String name, String lieblingsGattung) {
        this.name = name;
        this.lieblingsGattung = lieblingsGattung;
    }

    public void putAufgabeToPfleger(String name) {
        aufgabenPfleger.add(name);
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Pfleger{" + "name='" + name + '\'' + ", aufgabenPfleger=" + aufgabenPfleger + '}';
    }

    public void simulate(Gehege g, Tier t) {
        System.out.println(name + " füttert die Tiere in " + g.getDescription());
        System.out.println(name + " beobachtet den " + t.getName());
        if (t.getGattung().equals(lieblingsGattung)) {
            System.out.println(t.getName() + " ist aus der Lieblingsgattung von " + name + " und er bewundert das schöne Tier.");
        }
    }
}
