package fatima.week08.zoo;

import java.util.List;
import java.util.Vector;

public class Zookeeper {

    private String name;
    private List<Enclosure> enclosureList;

    public Zookeeper(String name) {
        this.name = name;
        enclosureList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void addEnclosure(Enclosure... enclosures){
        for (Enclosure enc : enclosures) {
            if (!enclosureList.contains(enc)) {
                enclosureList.add(enc);
                enc.addZookeeper(this);
            }
        }
    }

    public void doNextWork() {
        for (Enclosure e : enclosureList){
            if (e.hasToClean()) {
                e.workingProgress(this);
                return;
            }
        }
        System.out.println("Zookeeper " + name + " has no job for today");
    }

    public void staring(Animals a){
        System.out.println("--> " + name + " is staring at " + a.getNameOfAnimal());
        System.out.println();
    }
}
