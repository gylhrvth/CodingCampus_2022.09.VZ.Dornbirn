package michel.week08.Tiergarten;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animalList = new Vector<>();

    public Vector<Animal> getAnimalList() {
        return animalList;
    }

    public Enclosure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void printEnclosure() {
        System.out.println("│   ├── Gehege: " + name);
        if (animalList.size() > 0) {
            for (Animal a : animalList) {
                a.printAnimal();
            }
        } else {
            System.out.println("│       ├──  " + "(leer)");
        }
    }

    public Animal searchAndCreate(String name, String art, AnimalFeed food, Double amountOfFood) { //Sucht und erstellt neues Tier
        for (Animal animal : animalList) {        // prüft, ob Tier bereits vorhanden ist
            if (animal.getName().equals(name)) {
                return animal;          // wenn ja, wird es zurückgegeben
            }
        }
        Animal animal = new Animal(name, art, food, amountOfFood);       // wenn nicht, wird ein neues Tier erstellt
        animalList.add(animal);
        return animal;
    }

    public void simulateDay(ZooKeeper zooKeeper) {
        System.out.printf("%s füttert die Tiere und reinigt das Gehege %s\n", zooKeeper.getName(), name);
    }
}

