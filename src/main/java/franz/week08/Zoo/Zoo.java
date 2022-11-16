package franz.week08.Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int baujahr;
    public Vector<Enclosure> enclosureList = new Vector<>();
    public Vector<ZooKeeper> zooKeeperList = new Vector<>();


    public Zoo(String name, int baujahr) {
        this.name = name;
        this.baujahr = baujahr;
    }

    public void printStructure() {
        System.out.printf("|-- Zoo:  %s, gegruendet %d\n", name, baujahr);
        for (Enclosure enc : enclosureList) {
            enc.printStructure();
        }
        for (ZooKeeper zk : zooKeeperList) {
            zk.printStructure();
        }
    }


    public Enclosure searchAndCreateEnclosure(String name) {
        for (Enclosure enc : enclosureList) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        Enclosure enc = new Enclosure(name);
        enclosureList.add(enc);
        return enc;

    }

    public Animal searchAndCreateAnimal(String enclosureName, String name, String art) {
        Enclosure enc = searchAndCreateEnclosure(enclosureName);
        return enc.searchAndCreate(name, art);
    }

    public ZooKeeper serachAndCreatePfleger(String name, String... enclosureName) {
        for (ZooKeeper zk : zooKeeperList) {
            if (zk.getName().equals(name)) {
                return zk;
            }
        }
        ZooKeeper zk = new ZooKeeper(name);
        zooKeeperList.add(zk);
        for (String encName : enclosureName) {
            zk.addResponsibility(searchAndCreateEnclosure(encName));
        }
        return zk;
    }

    //YXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYX
    public void simulatDay() {
        Vector<Enclosure> enclosuresToClean = new Vector<>();
        enclosuresToClean.addAll(enclosureList);
        int countEntclouseLeftToClean = Integer.MAX_VALUE;
        while (!enclosuresToClean.isEmpty() &&
                enclosuresToClean.size() < countEntclouseLeftToClean) {
            countEntclouseLeftToClean = enclosuresToClean.size();
            for (ZooKeeper zk : zooKeeperList) {
                zk.simulateDay(enclosuresToClean);
            }
        }

    }
}
