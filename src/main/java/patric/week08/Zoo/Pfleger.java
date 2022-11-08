package patric.week08.Zoo;


import java.util.ArrayList;
import java.util.List;

public class Pfleger {

    private String name;
    List<String> aufgabenPfleger = new ArrayList<>();


    public Pfleger(String name) {
        this.name = name;
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
}
