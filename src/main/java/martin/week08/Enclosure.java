package martin.week08;

import java.util.LinkedList;
import java.util.List;

public class Enclosure {

    private String name;
    private List<Animal> animalsInEnclosure = new LinkedList<>();
    private List<Caretaker> caretakers = new LinkedList<>();

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

//    public void addPfleger(Pfleger pfleger, Tätigkeit tätigkeit) {
//        GehegeTätigkeit t = new Gehegetätigkeit(pfleger, this, tätigkeit);
//        pflegerTätigkeitenListe.add(t);
//        this.pflegers.add(pfleger);
//        pfleger.addGehegetätigkeit(t);}

    public void addCaretaker(Caretaker caret,Enclosuretasks enclTask) {
        caret.addEnclosureAndTask(this,enclTask);
    }

    @Override
    public String toString() {
        StringBuilder enclFormat = new StringBuilder();
        if (animalsInEnclosure.size() > 0) {
            enclFormat.append("│   ├───┬─── ").append(name).append(" - ");
            enclFormat.append(caretakers.toString())
                    //.replaceAll("[\\[\\]]","")).
            .append("\n");
            for (int i = 0; i < animalsInEnclosure.size(); i++) {
                if (i + 1 == animalsInEnclosure.size()) {
                    enclFormat.append("│   │   └─ ").append(animalsInEnclosure.get(i));
                } else {
                    enclFormat.append("│   │   ├─ ").append(animalsInEnclosure.get(i)).append("\n");
                }
            }
        } else {
            enclFormat.append("│   ├─────── ").append(name);
        }
        return enclFormat.toString();
    }
}