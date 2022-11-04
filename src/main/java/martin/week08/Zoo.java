package martin.week08;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Zoo {
    private String zooName;
    private int gruendungsJahr;
    private static List<Enclosure> animalEnclosures = new LinkedList<>();

    public Zoo() {
        zooName = "Sauhaufen Hard";
        gruendungsJahr = 2022;
        animalEnclosures.add(new Enclosure("Schweinestall"));
    }

    public Zoo(String zooName, int gruendungsJahr) {
        this.zooName = zooName;
        this.gruendungsJahr = gruendungsJahr;
    }

    public void addEnclosure(Enclosure enToAdd) {
        animalEnclosures.add(enToAdd);
    }

    public void remEnclosure(Enclosure enToRem) {
        animalEnclosures.remove(enToRem);
    }

    public int getEnAmm() {
        return Zoo.animalEnclosures.size();
    }

    public void shuffleEnclosures() {
        Collections.shuffle(animalEnclosures);
    }

    public void printEnclosures() {
        for (Enclosure animalEnclosure : animalEnclosures) {
            System.out.println(animalEnclosure);
        }
    }


    @Override
    public String toString() {
        return String.format("Zoo: %s, gegründet %d", zooName, gruendungsJahr);
    }
}
