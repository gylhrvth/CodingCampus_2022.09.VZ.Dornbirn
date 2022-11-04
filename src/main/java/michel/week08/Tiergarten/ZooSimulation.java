package michel.week08.Tiergarten;

import viktor.week08.Gehege;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Tiergarten Dornbirn",2022);
        Enclosure enclosure1 = new Enclosure("Alpenwiese");
        Enclosure enclosure2 = new Enclosure("Ried");
        Enclosure enclosure3 = new Enclosure("Terrarium (warm)");
        Animal animal1 = new Animal("Rijska","Kuh");
        Animal animal2 = new Animal("Garmond","Storh");
        Animal animal3 = new Animal("Hugo","Storh");
        Animal animal4 = new Animal("Idaxis","Storh");
        myZoo.addGehege(enclosure1);
        myZoo.addGehege(enclosure2);
        myZoo.addGehege(enclosure3);
        enclosure1.addAnimal(animal1);
        enclosure2.addAnimal(animal2);
        enclosure2.addAnimal(animal3);
        enclosure2.addAnimal(animal4);

        myZoo.printZoo();
    }
}
