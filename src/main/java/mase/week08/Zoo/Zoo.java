package mase.week08.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private int foundedYear;
    private Enclosure enclosure;
    public List<Enclosure> enclosureList = new ArrayList<>();

   public Zoo(String name, int foundedYear){
        this.name = name;
        this.foundedYear = foundedYear;
    }

    public void printZoo() {
        System.out.println("|--- Zoo: " + name + ", gegründet " + foundedYear);
        for (Enclosure a : enclosureList) {
            a.printEnclosure();
        }
    }

    public void addGehege(Enclosure select){
       enclosureList.add(select);
    }
    @Override
    public String toString() {
        return "|--- Zoo: " + name + ","+ "Gegründet: " + foundedYear;

    }
}
