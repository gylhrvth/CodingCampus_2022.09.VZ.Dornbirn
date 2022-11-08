package michel.week08.Tiergarten;


public class ZooSimulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Tiergarten Dornbirn", 2022);
        myZoo.searchAndCreateZooKeeper("MaseJr", "Alpenwiese", "Ried", "Schweinestall");
        myZoo.searchAndCreateZooKeeper("Patric", "Ried", "Terrarium", "Vogelkäfig");
        myZoo.searchAndCreateZooKeeper("Martin", "Vogelkäfig", "Schweinestall","Teich");
        AnimalFeed hay = new AnimalFeed("Heu", 1.0, 1.99);
        AnimalFeed worms = new AnimalFeed("Regenwürmer", 1.0, 4.99);
        AnimalFeed grasshopper = new AnimalFeed("Grashüpfer", 1.0, 2.99);
        AnimalFeed kartoffeln = new AnimalFeed("Kartoffeln", 1.0, 2.69);

        Animal animal1 = myZoo.searchAndCreateAnimal("Alpenwiese", "Stier", "Kuh", hay, 5.5, 15,90);
        Animal animal2 = myZoo.searchAndCreateAnimal("Ried", "Raymond", "Storch", worms, 0.5, 10,85);
        Animal animal3 = myZoo.searchAndCreateAnimal("Ried", "Hugo", "Storch", worms, 0.7, 15,80);
        Animal animal4 = myZoo.searchAndCreateAnimal("Terrarium", "Id axis", "Frosch", grasshopper, 0.3, 10,100);
        Animal animal5 = myZoo.searchAndCreateAnimal("Terrarium", "Crazy Frog", "Frosch", grasshopper, 0.3, 20,120);
        Animal animal6 = myZoo.searchAndCreateAnimal("Terrarium", "Froggy", "Frosch", grasshopper, 0.3, 10,100);
        Animal animal7 = myZoo.searchAndCreateAnimal("Schweinestall", "RudiRüssel", "Schwein", kartoffeln, 2.5, 25,100);
        Animal animal8 = myZoo.searchAndCreateAnimal("Schweinestall", "Wildschwein", "Schwein", kartoffeln, 2.5, 25,100);
        Animal animal9 = myZoo.searchAndCreateAnimal("Schweinestall", "Rosi", "Schwein", kartoffeln, 2.5, 25,100);
        Animal animal10 = myZoo.searchAndCreateAnimal("Vogelkäfig", "DonaldDuck", "Duck", worms, 1.2, 10,100);
        Animal animal11 = myZoo.searchAndCreateAnimal("Vogelkäfig", "Tick", "Duck", worms, 0.7, 5,80);
        Animal animal12 = myZoo.searchAndCreateAnimal("Vogelkäfig", "Trick", "Duck", worms, 0.7, 5,80);
        Animal animal13 = myZoo.searchAndCreateAnimal("Vogelkäfig", "Truck", "Duck", worms, 0.7, 5,80);
        myZoo.searchAndCreateZooDoctor("Dr Dre");
        myZoo.searchAndCreateZooDoctor("Dr Doolittle");
        myZoo.searchAndCreateZooDoctor("Frankenstein");
        for (int i = 1; i <= 10; i++) {
            myZoo.searchAndCreateAnimal("Alpenwiese", "Kuh Nr. " + i, "Kuh", hay, 10.0, 20,150);
        }


        for (int i = 1; i <= 5; i++) {
            System.out.print("\n ---------------");
            System.out.println("\n| Tag " + i + " beginnt |");
            System.out.println(" ---------------");
            myZoo.simulateDay();
        }

        myZoo.printZoo();

        myZoo.getDailyFoodNeedsAndCosts();
    }
}
