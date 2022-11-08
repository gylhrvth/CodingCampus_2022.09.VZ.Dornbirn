package martin.week08;

import java.util.*;

public class Zoo {
    private String zooName;
    private int gruendungsJahr;
    private List<Enclosure> animalEnclosures = new LinkedList<>();
    private List<Caretaker> caretakers = new LinkedList<>();

    public Zoo() {
        zooName = "Sauhaufen Hard";
        gruendungsJahr = 2022;
        animalEnclosures.add(new Enclosure("Schweinestall"));
    }

    public Zoo(String zooName, int gruendungsJahr) {
        this.zooName = zooName;
        this.gruendungsJahr = gruendungsJahr;
    }

    public Enclosure searchAndMakeEncl(String name) {
        for (Enclosure encl : animalEnclosures) {
            if (encl.getName().equals(name)) {
                return encl;
            }
        }
        Enclosure encl = new Enclosure(name);
        animalEnclosures.add(encl);
        return encl;
    }

    public Caretaker searchAndCreateCaretaker(String name, Enclosure... enclosureNames) {
        for (Caretaker caret : caretakers) {
            if (caret.getName().equals(name)) {
                return caret;
            }
        }
        Caretaker caret = new Caretaker(name);
        caretakers.add(caret);
        for (Enclosure enclName : enclosureNames) {
            caret.addEnclResp(enclName);
        }
        return caret;
    }

    public int getEnAmm() {
        return animalEnclosures.size();
    }

    public void shuffleEnclosures() {
        Collections.shuffle(animalEnclosures);
    }

    public void printEnclosures() {
        for (Enclosure animalEnclosure : animalEnclosures) {
            System.out.println(animalEnclosure);
        }
    }

    public void printCaretakers() {
        for (Caretaker caret : caretakers) {
            System.out.println(caret);
        }
    }
    public void shuffleCaret(){
        Collections.shuffle(caretakers);
    }

    public void simulateDay() {
        List<Enclosure> enclosuresToClean = new LinkedList<>(animalEnclosures);
        Collections.shuffle(caretakers);
        int countEnclLeftToClean = Integer.MAX_VALUE;
        while (!enclosuresToClean.isEmpty() &&
                enclosuresToClean.size() < countEnclLeftToClean) {
            countEnclLeftToClean = enclosuresToClean.size();
            for (Caretaker caret : caretakers) {
                caret.simulateDay(enclosuresToClean);
            }
        }
        for (Enclosure encl : enclosuresToClean) {
            System.out.println(encl.getName() + " hat keinen Pfleger und wurde nicht betreut.");
        }
    }

    @Override
    public String toString() {
        return String.format("Zoo: %s, gegründet %d", zooName, gruendungsJahr);
    }
}
