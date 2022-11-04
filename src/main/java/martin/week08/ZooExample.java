package martin.week08;

public class ZooExample {
    public static void main(String[] args) {
        Zoo strHard = new Zoo("Sauhaufen Hard", 2022);

        Animal wut = new Animal();

        Enclosure enSandbank = new Enclosure("Sandbank");
        Animal totFisch = new Animal("Toter Fisch", "Treibgut");
        enSandbank.addAnimal(totFisch);
        enSandbank.addAnimal(totFisch);
        enSandbank.addAnimal(totFisch);
        enSandbank.remAnimal(totFisch);
        Animal kranich = new Animal("Kranich","Grus Grus");
        enSandbank.addAnimal(kranich);
        strHard.addEnclosure(enSandbank);

        Enclosure enAquarium = new Enclosure("Aquarium");
        Animal taucher = new Animal("Taucher","Mensch");
        enAquarium.addAnimal(taucher);
        Animal zwergGarnelen = new Animal("Zwerg Garnele","Babaulti");
        enAquarium.addAnimal(zwergGarnelen);
        strHard.addEnclosure(enAquarium);

        Enclosure enInWork = new Enclosure();
        strHard.addEnclosure(enInWork);
        strHard.remEnclosure(enInWork);
        strHard.addEnclosure(enInWork);

        Enclosure enKleinwald = new Enclosure("Sieben Bäume");
        Animal aa = new Animal("Amazonasameise", "Polygerus rufescens");
        Animal specht = new Animal ("Buntspecht","Picidae");
        Animal wildschwein = new Animal("Wildschein", "sus scrufa");

        for (int i = 0; i < 6; i++) {
            enKleinwald.addAnimal(aa);
        }
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(wildschwein);
        enKleinwald.addAnimal(wildschwein);
        
        strHard.addEnclosure(enKleinwald);

        strHard.shuffleEnclosures();
        printZooStructure(strHard);
    }

    public static void printZooStructure(Zoo zooName) {
        if (zooName.getEnAmm() > 0) {
            System.out.println("├───┬─ " + zooName);
        } else {
            System.out.println("└───── " + zooName);
        }
        zooName.printEnclosures();
        System.out.println("└───┘");
    }
}