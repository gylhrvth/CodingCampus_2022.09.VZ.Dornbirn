package fatima.week08.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private static Random rand = new Random();

    private String nameOfEnclosure;
    private List<Animals> animalsList;
    private List<Zookeeper> zookeeperList;

    private boolean hasToClean = true;

    public Enclosure(String nameOfEnclosure) {
        this.nameOfEnclosure = nameOfEnclosure;

        animalsList = new Vector<>();
        zookeeperList = new Vector<>();
    }

    public void addAnimals(Animals... animals) {
        animalsList.addAll(Arrays.asList(animals));
    }

    public void addZookeeper(Zookeeper... zookeepers) {
        for (Zookeeper zk : zookeepers) {
            if (!zookeeperList.contains(zk)) {
                zookeeperList.add(zk);
                zk.addEnclosure(this);
            }
        }
    }

    public void printStructure() {
        StringBuilder sb = new StringBuilder();
        for (Zookeeper zk : zookeeperList) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(zk.getName());
        }
        System.out.print("│   ├── enclosure: " + nameOfEnclosure + " ▶ keepers: ");
        if (zookeeperList.isEmpty()) {
            System.out.println("ATTENTION this enclosure needs Zookeepers!");
        } else {
            System.out.println(sb);
        }
        if (animalsList.isEmpty()) {
            System.out.println("│           ├── (empty)");
        } else {
            for (Animals ani : animalsList) {
                ani.printStructure();
            }
        }
    }

    public void resetHasToClean() {
        this.hasToClean = true;
    }

    public boolean hasToClean() {
        return hasToClean;
    }

    public void workingProgress(Zookeeper zk) {
        System.out.println(zk.getName() + " is entering the enclosure '" + nameOfEnclosure +"'");

        for (Animals a : animalsList) {
            System.out.println("- " + zk.getName() + " is feeding " + a.getNameOfAnimal() + "...");
        }
        hasToClean = false;
        zk.staring(animalsList.get(rand.nextInt(animalsList.size())));
    }

}



