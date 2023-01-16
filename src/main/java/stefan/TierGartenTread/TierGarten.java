package stefan.TierGartenTread;


import java.util.ArrayList;
import java.util.List;

public class TierGarten {

    private String n_name;
    private int grundunsjahr;
    private ArrayList<TierGehege> tiergehegeliste;
    private List<Arbeiter> arbeiterList;

    public TierGarten(String n_name, int grundunsjahr) {
        this.n_name = n_name;
        this.grundunsjahr = grundunsjahr;
        tiergehegeliste = new ArrayList<>();
        arbeiterList = new ArrayList<>();
    }

    public void addTierGehege(TierGehege tierGehege) {
        tiergehegeliste.add(tierGehege);
    }

    public void addArbeiter(Arbeiter arbeiter) {
        arbeiterList.add(arbeiter);
    }

    public String printZoo() {
        return "TierGarten{" +
                "n_name='" + n_name + '\'' +
                ", grundunsjahr=" + grundunsjahr +
                ", tiergehegeliste=" + tiergehegeliste +
                '}';
    }

    public void resetTiergehegeStatus() {
        for (TierGehege t : tiergehegeliste) {
            t.resetHasToClean();
        }
    }

    public void DaySimulate() {
        for (Arbeiter a : arbeiterList) {
            a.doNextjob();
        }
    }
}
