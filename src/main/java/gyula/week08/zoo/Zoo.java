package gyula.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int establishedInYear;

    private Vector<Enclosure> enclosureList = new Vector<>();

    private Vector<ZooKeeper> zooKeeperList = new Vector<>();

    public Zoo(String name, int establishedInYear){
        this.name = name;
        this.establishedInYear = establishedInYear;
    }


    public void printStructure(){
        System.out.printf("├── Zoo: %s, gegründet %d\n", name, establishedInYear);
        for (Enclosure enc: enclosureList){
            enc.printStructure();
        }
        for (ZooKeeper zk : zooKeeperList){
            zk.printStructure();
        }
    }

    public Enclosure searchAndCreateEnclosure(String name){
        for (Enclosure enc : enclosureList){
            if (enc.getName().equals(name)){
                return enc;
            }
        }
        Enclosure enc = new Enclosure(name);
        enclosureList.add(enc);
        return enc;
    }

    public Animal searchAndCreateAnimal(String enclosureName, String name, String art){
        Enclosure enc = searchAndCreateEnclosure(enclosureName);
        return enc.searchAndCreate(name, art);
    }


    public ZooKeeper searchAndCreateZooKeeper(String name, String... enclosureNames){
        for (ZooKeeper zk : zooKeeperList){
            if (zk.getName().equals(name)){
                return zk;
            }
        }
        ZooKeeper zk = new ZooKeeper(name);
        zooKeeperList.add(zk);
        for (String encName : enclosureNames){
            zk.addResponsibility(searchAndCreateEnclosure(encName));
        }
        return zk;
    }


    public void simulateDay(){
        Vector<Enclosure> enclosuresToClean = new Vector<>();
        enclosuresToClean.addAll(enclosureList);
        int countEnclosureLeftToClean = Integer.MAX_VALUE;
        while (!enclosuresToClean.isEmpty() &&
                enclosuresToClean.size() < countEnclosureLeftToClean) {
            countEnclosureLeftToClean = enclosuresToClean.size();
            for (ZooKeeper zk : zooKeeperList) {
                zk.simulateDay(enclosuresToClean);
            }
        }
        for (Enclosure enc: enclosuresToClean){
            System.out.println(enc.getName() + " hat keinen Pfleger, es wurde nicht betreut!!!");
        }
    }

}

