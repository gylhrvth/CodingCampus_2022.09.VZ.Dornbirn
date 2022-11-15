package fatima.week08.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Zoo {

    private String name;
    private int year;
    private List<Enclosure> enclosureList = new Vector<>();
    private List<Zookeeper> zookeeperList = new Vector<>();

    private List<Animals> animalList = new Vector<>();

    public Zoo(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void addEnclosure(Enclosure... enclosures) {
        enclosureList.addAll(Arrays.asList(enclosures));
    }

    public void addZooKeepers(Zookeeper... zk) {
        zookeeperList.addAll(Arrays.asList(zk));
    }

    public void printStructure() {
        System.out.println("├── zoo: " + name + ", established in " + year);
        for (Enclosure enc : enclosureList) {
            enc.printStructure();
        }
    }

    public void simulateOneDay() {
        System.out.println("A new day at the zoo '" + name + "' begins:");
        for (Zookeeper zk: zookeeperList) {
            zk.doNextWork();
        }
    }

    public void resetEnclosureStatus() {
        for (Enclosure e:enclosureList){
            e.resetHasToClean();
        }
    }
}




