package michel.week08.Tiergarten;

import java.util.*;


public class ZooKeeper {
    private final String name;

    private HashSet<Enclosure> tasksZooKeeperEnclosure = new HashSet<>();

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void putTaskToZooKeeper(Enclosure enclosure) {
        tasksZooKeeperEnclosure.add(enclosure);
    }

    public void printZooKeeper() {
        System.out.print("│   ├── Pfleger: " + name + " ist verantwortlich für: ");
        boolean firstElement = true;
        for (Enclosure enc:tasksZooKeeperEnclosure) {
            if(!firstElement){
                System.out.print(", ");
            }
            firstElement = false;
            System.out.print(enc.getName());
        }
        System.out.println();
    }
    public void simulateDay(Vector<Enclosure> toClean){
        for (Enclosure enc:tasksZooKeeperEnclosure) {
            if(toClean.contains(enc)){
                enc.simulateDay(this);
                toClean.remove(enc);
                break;
            }
        }
    }

}
