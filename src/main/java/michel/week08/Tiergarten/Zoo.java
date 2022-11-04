package michel.week08.Tiergarten;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    private String name;
    private int foundingYear;

    private Enclosure enclosure;
    private List<Enclosure> enclosureList = new ArrayList<>();


    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
    }

    public void addGehege(Enclosure selectedEnclosure) {
        enclosureList.add(selectedEnclosure);
    }

    public void removeGehege(Enclosure selectedEnclosure) {
        enclosureList.remove(selectedEnclosure);
    }

    public void printZoo() {
        System.out.println("|--- Zoo: " + name + ", gegründet " + foundingYear);
        for (Enclosure g : enclosureList) {
            g.printEnclosure();
        }

    }

    public String toString() {
        return "Zoo: " + name + ", gegründet " + foundingYear;
    }
}
