package martin.week08;

import java.util.*;

public class Caretaker {
    private String name;
    private List<Enclosure> enclListOfCT = new LinkedList<>();

    public Caretaker() {
        name = "Jemand";
    }

    public Caretaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEnclResp(Enclosure encl) {
        enclListOfCT.add(encl);
    }

    @Override
    public String toString() {
        StringBuilder CTPr = new StringBuilder(String.format("│   ├── Pfleger: %s, verantwortlich für ", name));
        boolean firstElement = true;
        for (Enclosure enc : enclListOfCT) {
            if (!firstElement) {
                CTPr.append(", ");
            }
            firstElement = false;
            CTPr.append(enc.getName());
        }
        return CTPr.toString();
    }

    public void simulateDay(List<Enclosure> toClean) {
        for (Enclosure enc : enclListOfCT) {
            if (toClean.contains(enc)) {
                enc.simulateDay(this);
                toClean.remove(enc);
                break;
            }
        }
    }
}
