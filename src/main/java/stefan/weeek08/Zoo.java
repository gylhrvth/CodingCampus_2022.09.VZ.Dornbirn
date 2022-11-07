package stefan.weeek08;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    private String name;
    private int grundungsJahr;
    private ArrayList<Gehege> gehegeListe;


    public Zoo(String name, int grundungsJahr) {
        this.name = name;
        this.grundungsJahr = grundungsJahr;
        gehegeListe = new ArrayList<>();

    }



    public void addGehege(Gehege gehege) {
        gehegeListe.add(gehege);
    }

    public String getName() {
        return name;
    }

    public int getGrundungsJahr() {
        return grundungsJahr;
    }

    public String toString() {
        return "|---Zoo:" + name + "\tGrundungsJahr," + grundungsJahr;
    }

    public String printGhegelist() {
        StringBuilder text = new StringBuilder();
        text.append("|----Zoo: " + name + "\tGrundungsjahr: " + grundungsJahr + "\n");

        for (Gehege x : gehegeListe) {
            text.append("|\t|--Gehege: ").append(x.getNameGehege()).append("\n");
            text.append(x);

        }
        return text.toString();
    }
}
