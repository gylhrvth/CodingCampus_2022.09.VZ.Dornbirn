package stefan.week08.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pfleger {
    private static Random rand = new Random();
    private String name;
    private List<Gehege> gehegeAufgaben = new ArrayList<>();

    private List<Tier> lieblingstier = new ArrayList<>();

    public Pfleger(String name) {
        this.name = name;
        gehegeAufgaben = new ArrayList<>();
        lieblingstier = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGehege(Gehege... gehegeList) {
        for (Gehege gehege : gehegeList) {
            gehegeAufgaben.add(gehege);
        }
    }

    public List<Gehege> getGehegeAufgaben() {
        return gehegeAufgaben;
    }

    public void setGehegeAufgaben(List<Gehege> gehegeAufgaben) {
        this.gehegeAufgaben = gehegeAufgaben;
    }

    public List<Tier> getLieblingstier() {
        return lieblingstier;
    }


    @Override
    public String toString() {
        return "Pfleger{" +
                "name='" + name + '\'' +
                ", gehegeAufgaben=" + gehegeAufgaben +
                '}';
    }

    private void suffleAufgaben() {
        for (int i = 0; i < 3 * gehegeAufgaben.size(); i++) {
            int indexA = rand.nextInt(gehegeAufgaben.size());
            int indexB = rand.nextInt(gehegeAufgaben.size());
            Gehege temp = gehegeAufgaben.get(indexA);
            gehegeAufgaben.set(indexA, gehegeAufgaben.get(indexB));
            gehegeAufgaben.set(indexB, temp);
        }
    }

    public void doNextJob() {
        suffleAufgaben();
        for (Gehege g : gehegeAufgaben) {
            if (g.hasToClean()) {
                g.doJob(this);
                return;  }

        }

        System.out.println("Pfleger " + name + " hat für heute keine Aufgaben mehr.");
    }


}




