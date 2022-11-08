package michel.week08.Tiergarten;



public class ZooSimulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Tiergarten Dornbirn",2022);

        Enclosure enclosure1 = new Enclosure("Alpenwiese");
        Enclosure enclosure2 = new Enclosure("Ried");
        Enclosure enclosure3 = new Enclosure("Terrarium (warm)");

        Animal animal1 = new Animal("Rijska","Kuh");
        Animal animal2 = new Animal("Garmond","Storch");
        Animal animal3 = new Animal("Hugo","Storch");
        Animal animal4 = new Animal("Idaxis","Storch");

        ZooKeeper p1 = new ZooKeeper("Mase");
        ZooKeeper p2 = new ZooKeeper("Stefan");
        ZooKeeper p3 = new ZooKeeper("Patric");

        AnimalFeed hay = new AnimalFeed("Heu",1.0,1.99);
        AnimalFeed worms = new AnimalFeed("Regenwürmer",1.0,4.99);

        myZoo.addGehege(enclosure1);
        myZoo.addGehege(enclosure2);
        myZoo.addGehege(enclosure3);
        enclosure1.addAnimal(animal1);
        enclosure2.addAnimal(animal2);
        enclosure2.addAnimal(animal3);
        enclosure2.addAnimal(animal4);
        animal1.setFood(hay,15);
        animal2.setFood(worms,0.5);
        animal3.setFood(worms,0.6);
        animal4.setFood(worms,0.5);

        p1.putTaskToZooKeeper(enclosure2,"Ausmisten");
        p1.putTaskToZooKeeper(enclosure1,"Füttern");
        p1.putTaskToZooKeeper(enclosure2,"Rasen mähen");
        p2.putTaskToZooKeeper(enclosure2,"Füttern");
        p2.putTaskToZooKeeper(enclosure3,"Pflege");
        p2.putTaskToZooKeeper(enclosure2,"Mase kontrollieren");
        p2.putTaskToZooKeeper(enclosure3,"Reinigen");
        p3.putTaskToZooKeeper(enclosure3,"Füttern");
        p3.putTaskToZooKeeper(enclosure1,"Rasen mähen");

        myZoo.printZoo();
        myZoo.getDailyFoodNeedsAndCosts();
        p1.printZooKeeperTasks();
        p2.printZooKeeperTasks();
        p3.printZooKeeperTasks();

    }
}
