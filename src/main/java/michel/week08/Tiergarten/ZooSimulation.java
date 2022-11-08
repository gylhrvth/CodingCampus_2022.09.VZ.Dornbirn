package michel.week08.Tiergarten;


public class ZooSimulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Tiergarten Dornbirn", 2022);
        myZoo.searchAndCreateZooKeeper("NaseJr", "Alpenwiese", "Ried", "Schweinestall");
        myZoo.searchAndCreateZooKeeper("Patric", "Ried", "Terrarium", "Vogelkäfig");
        myZoo.searchAndCreateZooKeeper("Martin", "Vogelkäfig", "Schweinestall","Teich");
        AnimalFeed hay = new AnimalFeed("Heu", 1.0, 1.99);
        AnimalFeed worms = new AnimalFeed("Regenwürmer", 1.0, 4.99);
        AnimalFeed grasshopper = new AnimalFeed("Grashüpfer", 1.0, 2.99);
        AnimalFeed kartoffeln = new AnimalFeed("Kartoffeln", 1.0, 2.69);

        Animal animal1 = myZoo.searchAndCreateAnimal("Alpenwiese", "Stier", "Kuh", hay, 5.5, 50,90);
        Animal animal2 = myZoo.searchAndCreateAnimal("Ried", "Raymond", "Storch", worms, 0.5, 10,85);
        Animal animal3 = myZoo.searchAndCreateAnimal("Ried", "Hugo", "Storch", worms, 0.7, 20,80);
        Animal animal4 = myZoo.searchAndCreateAnimal("Terrarium", "Id axis", "Frosch", grasshopper, 0.3, 50,100);
        Animal animal5 = myZoo.searchAndCreateAnimal("Schweinestall", "RudiRüssel", "Schwein", kartoffeln, 2.5, 40,100);
        Animal animal6 = myZoo.searchAndCreateAnimal("Vogelkäfig", "DonaldDuck", "Duck", worms, 0.7, 15,80);

        for (int i = 1; i <= 10; i++) {
            myZoo.searchAndCreateAnimal("Alpenwiese", "Kuh Nr. " + i, "Kuh", hay, 10.0, 60,100);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nTag " + i + " beginnt");
            myZoo.simulateDay();
        }

        myZoo.printZoo();

        myZoo.getDailyFoodNeedsAndCosts();
    }
}
