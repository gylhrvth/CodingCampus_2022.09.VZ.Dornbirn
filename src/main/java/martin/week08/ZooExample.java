package martin.week08;

public class ZooExample {
    public static void main(String[] args) {
        Zoo strHard = new Zoo("Sauhaufen Hard", 2021);

        Animal wut = new Animal();

        Enclosure enKleinwald = strHard.searchAndMakeEncl("Lichtung");
        Enclosure enSandbank = strHard.searchAndMakeEncl("Sandbank");
        Enclosure enAquarium = strHard.searchAndMakeEncl("Aquarium");
        enSandbank.addAnimal(new Animal("Ferdinand", "Grus Grus"));
        enAquarium.addAnimal(new Animal("Charlie", "Babaulti"));
        enAquarium.addAnimal(new Animal("Alexander", "Babaulti"));
        enAquarium.addAnimal(new Animal("Brutus", "Neocaridina"));
        enKleinwald.addAnimal(new Animal("Rufus", "Picidae"));
        enKleinwald.addAnimal(new Animal("Ruprecht", "Picidae"));
        enKleinwald.addAnimal(new Animal("Pumba", "Sus Scrufa"));
        enKleinwald.addAnimal(new Animal("Aurelia", "Sus Scrufa"));
        Animal aa = new Animal("Amazonas Ameise", "Polygerus rufescens");
        for (int i = 0; i < 2; i++) {
            enKleinwald.addAnimal(aa);
        }
        strHard.searchAndCreateCaretaker("Stefan Ibertsch", enAquarium);
        strHard.searchAndCreateCaretaker("Klaus Knutscha", enKleinwald, enSandbank);
        strHard.searchAndCreateCaretaker("Ellen Sibara", enAquarium, enKleinwald, enSandbank);
        strHard.searchAndCreateCaretaker("Justus Hebarer", enAquarium, enKleinwald, enSandbank);

        strHard.shuffleEnclosures();
        strHard.shuffleCaret();
        printZooStructure(strHard);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tag: " + i + " beginnt.");
            strHard.simulateDay();
            System.out.println();
        }
    }

    public static void printZooStructure(Zoo zooName) {
        if (zooName.getEnAmm() > 0) {
            System.out.println("├── " + zooName);
        } else {
            System.out.println("└───── " + zooName);
        }
        zooName.printEnclosures();
        zooName.printCaretakers();
        System.out.println();
    }
}