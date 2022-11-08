package michel.week08.Tiergarten;

import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private static Random rand = new Random();

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
                if (a.getActualHealth() > 0) {
                    a.printAnimal();
                }
            }
        } else {
            System.out.println("│       ├──  " + "(leer)");
        }
    }

    public Animal searchAndCreate(String name, String art, AnimalFeed food, Double amountOfFood, int bite, int maxHealth) { //Sucht und erstellt neues Tier
        for (Animal animal : animalList) {        // prüft, ob Tier bereits vorhanden ist
            if (animal.getName().equals(name)) {
                return animal;          // wenn ja, wird es zurückgegeben
            }
        }
        Animal animal = new Animal(name, art, food, amountOfFood, bite, maxHealth);       // wenn nicht, wird ein neues Tier erstellt
        animalList.add(animal);
        return animal;
    }

    public void simulateAttacks() {
        for (Animal animal : animalList) {
            if (rand.nextDouble() < 0.4) {
                Animal animalToBite = animalList.get(rand.nextInt(animalList.size()));
                if (animal.getActualHealth() > 0 && !animal.equals(animalToBite)) {
                    animalToBite.bite(animal);
                }
            }
        }
    }

    public void simulateDay(ZooKeeper zooKeeper) {
        System.out.printf("%s füttert die Tiere und reinigt das Gehege %s\n", zooKeeper.getName(), name);
    }
}

