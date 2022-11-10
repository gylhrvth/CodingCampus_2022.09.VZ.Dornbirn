package stefan.week08.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoo {

    private String m_name;
    private int m_grundungsJahr;
    private ArrayList<Gehege> gehegeListe;
    private List<Pfleger> mitarbeiterliste;
    private String tier;


    public Zoo(String name, int grundungsJahr) {
        m_name = name;
        m_grundungsJahr = grundungsJahr;
        gehegeListe = new ArrayList<>();
        mitarbeiterliste = new ArrayList<>();

    }


    public void addGehege(Gehege gehege) {
        gehegeListe.add(gehege);
    }

    public void addMitarbeiterliest(Pfleger pfleger) {
        mitarbeiterliste.add(pfleger);
    }

    public String getM_name() {
        return m_name;
    }


    public int getM_grundungsJahr() {
        return m_grundungsJahr;
    }

    public String printGehegelist() {
        StringBuilder text = new StringBuilder();
        text.append("|----Zoo: " + m_name + "\tGrundungsjahr: " + m_grundungsJahr + "\n");


        for (Gehege x : gehegeListe) {


            text.append("|\t|--Gehege: ").append(x.getNameGehege()).append("\n");
            text.append(x);
        }


        return text.toString();
    }


    public void resetGehegeStatus() {
        for (Gehege g : gehegeListe) {
            g.resetHasToClean();
        }
    }

    public void simulate() {
        for (Pfleger p : mitarbeiterliste) {
            p.doNextJob();


        }
    }





}