package franz.week06.objekt.Person.ExamplePerson;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class House {

    private String adresse;
    private int doors;
    private int windows;
    private List<ExamplePerson> inhabitants;

    public House(int doors, int windows, String adresse) {
        this.doors = doors;
        this.windows = windows;
        this.adresse = adresse;
        this.inhabitants = new ArrayList<>();
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

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<ExamplePerson> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<ExamplePerson> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void addPerson(ExamplePerson p1) {
        this.inhabitants.add(p1);
    }

    @Override
    public String toString() {
        return "House{" +
                "adresse='" + adresse +
                ", doors=" + doors +
                ", windows=" + windows +
                ", \n\tinhabitants=" + printInhabitants() +
                '}';
    }

    private String printInhabitants() {
        StringBuilder text = new StringBuilder();
        for (ExamplePerson inhabitant : inhabitants
        ) {
            text.append(inhabitant.toString());
            text.append("\n\t");
        }
        return text.toString();
    }
}
