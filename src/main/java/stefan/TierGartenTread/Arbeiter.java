package stefan.TierGartenTread;


import java.util.ArrayList;
import java.util.List;

public class Arbeiter {
    private String name;
    private int alter;

    private List<TierGehege> gehegeAufgaben = new ArrayList<>();

    public Arbeiter(String name, int alter) {
        this.name = name;
        this.alter = alter;
        gehegeAufgaben = new ArrayList<>();
    }

    public void addGehege(TierGehege gehege) {
        gehegeAufgaben.add(gehege);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public List<TierGehege> getGehegeAufgaben() {
        return gehegeAufgaben;
    }

    public void setGehegeAufgaben(List<TierGehege> gehegeAufgaben) {
        this.gehegeAufgaben = gehegeAufgaben;
    }

    public void doNextjob() {
        for (TierGehege g : gehegeAufgaben) {
            if (g.hasToClean()) {
                g.getjobs(this);
                return;
            }
        }
        System.out.println("Aarbeiter: "+name+"hat für heute nichts zu tun");
    }

}