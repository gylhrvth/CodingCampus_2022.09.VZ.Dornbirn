package stefan.TierGartenTread;

import java.util.ArrayList;
import java.util.List;

public class TierGehege {
    private String gehegenamen;
    private List<Tier> tiere = new ArrayList<>();
    private List<Aufgaben> aufgabens = new ArrayList<>();
private boolean hasToClean;
    @Override
    public String toString() {
        return "TierGehege{" +
                "gehegenamen='" + gehegenamen + '\'' +
                ", tiere=" + tiere +
                ", aufgabens=" + aufgabens +
                '}';
    }

    public TierGehege(String gehegenamen) {
        this.gehegenamen = gehegenamen;
        tiere = new ArrayList<>();
        aufgabens =new ArrayList<>();
    }


    public String getGehegenamen() {
        return gehegenamen;
    }

    public void addTier(Tier tier) {
        tiere.add(tier);
    }


    public List<Tier> getTiere() {
        return tiere;

    }

   public void addAufgaben(Aufgaben aufgaben){
        aufgabens.add(aufgaben);
   }
    public void resetHasToClean() {
        this.hasToClean = true;
    }

    public boolean hasToClean() {
        return hasToClean;
    }

   public void getjobs(Arbeiter arbeiter){
    for (Tier t:tiere) {
        System.out.println(arbeiter.getName()+aufgabens+t.getTiername()+"im "+ gehegenamen);
   hasToClean = false;
    }
}
}
