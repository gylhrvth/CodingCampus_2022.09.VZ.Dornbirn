package fatima.week08.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo z1 = new Zoo("Tiergarten Dornbirn", 2022);

        Enclosure e1 = new Enclosure("Alpenwiese");
        Enclosure e2 = new Enclosure("Ried");
        Enclosure e3 = new Enclosure("Terrarium (warm)");

        z1.addEnclosure(e1, e2, e3);

        Animals a1 = new Animals("Rijska", "Kuh");
        Animals a2 = new Animals("Lola", "Kuh");
        Animals a3 = new Animals("Olaf", "Kuh");
        Animals a4 = new Animals("Garmond", "Storch");
        Animals a5 = new Animals("Hugo", "Storch");
        Animals a6 = new Animals("Idaxis", "Storch");

        e1.addAnimals(a1, a2, a3);
        e2.addAnimals(a4, a5, a6);
        e3.addAnimals(a6);

        Zookeeper zK1 = new Zookeeper("Max");
        Zookeeper zK2 = new Zookeeper("Anna");
        Zookeeper zK3 = new Zookeeper("Tom");

        zK1.addEnclosure(e1);
        zK2.addEnclosure(e1, e3);
        zK3.addEnclosure(e1, e2, e3);

        z1.addZooKeepers(zK1, zK2, zK3);

        z1.printStructure();

        System.out.println("\n");

        for (int i = 1; i <= 3; i++) {
            System.out.println("───── DAY " + i);
            z1.resetEnclosureStatus();
            z1.simulateOneDay();

        }
    }
}

