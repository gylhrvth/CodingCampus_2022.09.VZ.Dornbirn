package martin.week08;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Enclosure {

    private Random rand = new Random();

    private String name;
    private List<Animal> animalsInEnclosure = new LinkedList<>();

    public Enclosure() {
        name = "leeres Gehege";
    }

    public Enclosure(String enclosureName) {
        name = enclosureName;
    }

    public void addAnimal(Animal enToAdd) {
        animalsInEnclosure.add(enToAdd);
    }

    public String getName() {
        return this.name;
    }
    public Animal randAnimalInEncl(){
        int r=rand.nextInt(animalsInEnclosure.size());
        return animalsInEnclosure.get(r);
    }

    public void simulateDay(Caretaker caret) {
        System.out.printf(
                "%s füttert die Tiere, reinigt das %s Gehege und beobachtet %s.\n",
                caret.getName(),name,randAnimalInEncl());
    }

    @Override
    public String toString() {
        StringBuilder enclFormat = new StringBuilder();
        if (animalsInEnclosure.size() > 0) {
            enclFormat.append("│   ├─ ").append("Gehege: ").append(name).append("\n");
            for (int i = 0; i < animalsInEnclosure.size(); i++) {
                Animal cAnim = animalsInEnclosure.get(i);
                if (i + 1 == animalsInEnclosure.size()) {
                    enclFormat.append("│   │   └─ ").append(cAnim);
                } else {
                    enclFormat.append("│   │   ├─ ").append(cAnim).append("\n");
                }
            }
        } else {
            enclFormat.append("│   ├─ ").append("Gehege: ").append(name);
        }
        return enclFormat.toString();
    }
}