package stefan.ExampleProjekt;

import java.util.ArrayList;
import java.util.List;

public class Haus {
    private String adresse;
    private int doors;
    private int windows;
    private List<Person> personList;
    private List<Aufgaben> aufgabens = new ArrayList<>();

    public Haus(String adresse, int doors, int windows) {
        this.adresse = adresse;
        this.doors = doors;
        this.windows = windows;
        personList = new ArrayList<>();
        aufgabens = new ArrayList<>();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    @Override
    public String toString() {
       StringBuilder text = new StringBuilder();
       text.append("Standort: "+adresse+"\nDoors: "+doors+ "\nWindows: "+ windows);
        for (Aufgaben a:aufgabens ) {
            text.append("\nAufgaben: ").append(a.getAufgabeName());

        }

    return text.toString();
    }


    public void setWindows(int windows) {
        this.windows = windows;

    }

    public void addhaus() {
        addhaus();
    }

    public void addPersonlist(Person person) {
        personList.add(person);
    }

    public void addAufgaben(Aufgaben aufgaben) {
        aufgabens.add(aufgaben);
    }


}
