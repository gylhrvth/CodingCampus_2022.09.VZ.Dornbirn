package stefan.week08.zoo;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private String nameGehege;
    private List<Tier> tiere = new ArrayList<>();

    private List<Aufgaben> aufgabens = new ArrayList<>();

    private boolean hasToClean = true;

    public Gehege(String nameGehege) {
        this.nameGehege = nameGehege;
        aufgabens = new ArrayList<>();
        this.tiere = tiere;
    }



    public void addAufgaben(Aufgaben aufgaben) {
        aufgabens.add(aufgaben);
    }

    public String getNameGehege() {
        return nameGehege;
    }

    public void setNameGehege(String nameGehege) {
        this.nameGehege = nameGehege;
    }

    public void addlingsTier(Tier lieblingstier){
        tiere.add(lieblingstier);
    }

    public void addTier(Tier tier) {
        tiere.add(tier);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Tier t : tiere) {
            builder.append("|\t \t|--").append(t.getName()).append(",").append(t.getGattung()).append("\n");

        }

        return builder.toString();
    }

    public List<Tier> getTiere() {
        return tiere;
    }



    public void addAufgabe(Aufgaben aufgaben) {
        aufgabens.add(aufgaben);
    }

    public void resetHasToClean() {
        this.hasToClean = true;
    }

    public boolean hasToClean() {
        return hasToClean;
    }

    public void doJob(Pfleger p) {
        for (Tier t : tiere) {

            System.out.println(p.getName() + " futtert " + t.getName() + " im " + nameGehege);
            hasToClean = false;
        }

    }


}


