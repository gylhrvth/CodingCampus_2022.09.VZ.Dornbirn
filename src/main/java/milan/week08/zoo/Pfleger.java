package milan.week08.zoo;

import java.util.ArrayList;
import java.util.Vector;

public class Pfleger {

    private String name;
    private ArrayList<Gehege> gehegeListe;


    public Pfleger(String name){
        this.name = name;
        gehegeListe = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGehege (Gehege gehege){
        gehegeListe.add(gehege);
    }

}
