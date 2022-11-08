package gyula.week08.zoo;

import java.util.HashSet;
import java.util.Vector;

public class ZooKeeper {
    private String name;
    private HashSet<Enclosure> responsibleForEnclosures = new HashSet<>();

    public ZooKeeper(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addResponsibility(Enclosure enc){
        responsibleForEnclosures.add(enc);
    }

    public void printStructure(){
        System.out.printf("│   ├── Pfleger: %s, Verantwortlich für ", name);
        boolean firstElement = true;
        for (Enclosure enc : responsibleForEnclosures) {
            if (!firstElement) {
                System.out.print(", ");
            }
            firstElement = false;
            System.out.print(enc.getName());
        }
        System.out.println();
    }

    public void simulateDay(Vector<Enclosure> toClean){
        for (Enclosure enc: responsibleForEnclosures){
            if (toClean.contains(enc)){
                enc.simulateDay(this);
                toClean.remove(enc);
                break;
            }
        }
    }
}
