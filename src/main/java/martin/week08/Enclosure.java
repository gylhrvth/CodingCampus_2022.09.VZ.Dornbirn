package martin.week08;

import java.util.LinkedList;
import java.util.List;

public class Enclosure {

    private String name;
    private List<Animal> animalsInEnclosure = new LinkedList<>();

    public Enclosure() {
        name = "leeres Gehege";
    }

    public Enclosure(String enclosureName) {
        name = "Gehege: " + enclosureName;
    }

    public void addAnimal(Animal enToAdd) {
        animalsInEnclosure.add(enToAdd);
    }

    public void remAnimal(Animal enToRem) {
        animalsInEnclosure.remove(enToRem);
    }

    @Override
    public String toString() {
        StringBuilder enclFormat = new StringBuilder();
        if (animalsInEnclosure.size() > 0) {
            enclFormat.append("│   ├───┬─── ").append(name).append("\n");
            if (animalsInEnclosure.size() > 3) {
                enclFormat.append("│   │   └─ ").append(animalsInEnclosure.size()).append("; ").append(animalsInEnclosure.get(0));
            } else {
                for (int i = 0; i < animalsInEnclosure.size(); i++) {
                    if (i + 1 == animalsInEnclosure.size()) {
                        enclFormat.append("│   │   └─ ").append(animalsInEnclosure.get(i));
                    } else {
                        enclFormat.append("│   │   ├─ ").append(animalsInEnclosure.get(i)).append("\n");
                    }
                }
            }
        } else {
            enclFormat.append("│   ├─────── ").append(name);
        }
        return enclFormat.toString();
    }
}