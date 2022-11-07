package martin.week08;

public class ZooExample {
    public static void main(String[] args) {
        Zoo strHard = new Zoo("Sauhaufen Hard", 2022);

        Animal wut = new Animal();

        Enclosure enKleinwald = new Enclosure("Sieben Bäume");
        Animal aa = new Animal("Amazonas Ameise", "Polygerus rufescens");
        Animal specht = new Animal ("Buntspecht","Picidae");
        Animal wildschwein = new Animal("Wildschein", "sus scrufa");
        for (int i = 0; i < 2; i++) {
            enKleinwald.addAnimal(aa);
        }
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(specht);
        enKleinwald.addAnimal(wildschwein);
        enKleinwald.addAnimal(wildschwein);
        strHard.addEnclosure(enKleinwald);

        Enclosure enSandbank = new Enclosure("Sandbank");
        Animal totFisch = new Animal("Toter Fisch", "Treibgut");
        enSandbank.addAnimal(totFisch);
        enSandbank.remAnimal(totFisch);
        Animal kranich = new Animal("Kranich","Grus Grus");
        enSandbank.addAnimal(kranich);
        Caretaker klaus = new Caretaker("Klaus");
        Enclosuretasks sandZaehlen = new Enclosuretasks("Sandkörner zählen");
        klaus.addEnclosureAndTask(enSandbank,sandZaehlen);
        strHard.addEnclosure(enSandbank);

        Enclosure enAquarium = new Enclosure("Aquarium");
        Animal charlie = new Animal("Zwerg Garnele","Babaulti");
        Animal alexander = new Animal("Zwerg Garnele","Babaulti");
        Animal jutus = new Animal("Zwerg Garnele","Neocaridina");
        enAquarium.addAnimal(charlie);
        enAquarium.addAnimal(alexander);
        enAquarium.addAnimal(jutus);
        strHard.addEnclosure(enAquarium);

        Enclosure enLandeplatz = new Enclosure("Hubschrauberlandeplatz");
        Caretaker tiberius = new Caretaker("Tiberius");
        Enclosuretasks gChoppa = new Enclosuretasks("Get to the Choppa!");
        tiberius.addEnclosureAndTask(enLandeplatz,gChoppa);
        strHard.addEnclosure(enLandeplatz);

        Enclosure enInWork = new Enclosure();
        strHard.addEnclosure(enInWork);
        strHard.remEnclosure(enInWork);
        strHard.addEnclosure(enInWork);

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

    public void simDay(){
        int day = 23;

    }
}