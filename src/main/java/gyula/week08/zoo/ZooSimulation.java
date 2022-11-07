package gyula.week08.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo tpFeldkirch = new Zoo("Tierpark Feldkirch", 2012);
        tpFeldkirch.searchAndCreateZooKeeper("Clark Kent", "Sahara", "Desert", "Alpenwiese");
        tpFeldkirch.searchAndCreateZooKeeper("Bruce Wayne", "Alpenwiese");

        Animal alfonso = tpFeldkirch.searchAndCreateAnimal("Sahara", "Alfonso", "Hyäne");
        Animal beatrix = tpFeldkirch.searchAndCreateAnimal("Sahara", "Beatrix", "Hyäne");
        Animal conny = tpFeldkirch.searchAndCreateAnimal("Sahara", "Conny", "Löwe");

        Animal dieter = tpFeldkirch.searchAndCreateAnimal("Desert", "Dieter", "Skorpion");

        for (int i = 1; i <= 5; i++) {
            tpFeldkirch.searchAndCreateAnimal("Alpenwiese", "Kuh Nr." + i, "Kuh");
        }
        //tpFeldkirch.searchAndCreateEnclosure("Digital Campus");


        tpFeldkirch.printStructure();

        System.out.println("-- -- --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tag " + i + " beginnt");
            tpFeldkirch.simulateDay();
        }
    }
}
