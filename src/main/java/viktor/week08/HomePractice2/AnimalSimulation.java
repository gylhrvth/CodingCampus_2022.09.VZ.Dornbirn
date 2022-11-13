package viktor.week08.HomePractice2;

import java.util.Vector;

public class AnimalSimulation {

    public static void allAnimalsEat(Vector<Animal> list) {

        for (Animal a : list) {
            if (a instanceof Crocodile) {
                System.out.print("Instance of class Crocodile -> ");

            } else if (a instanceof Cat) {
                System.out.print("Instance of class Cat -> ");

            } else if (a instanceof Murmile) {
                System.out.print("Instance of class Murmile -> ");
            }
            a.iAmEating();
        }
        System.out.println();
    }

    public static void allAnimalsLive(Vector<Animal> list) {
        for (Animal a : list) {

            if (a instanceof Crocodile) {
                System.out.print("Instance of class Crocodile -> ");

            } else if (a instanceof Cat) {
                System.out.print("Instance of class Cat -> ");

            } else if (a instanceof Murmile) {
                System.out.print("Instance of class Murmile -> ");

            }
            a.iAmLiving();
        }
        System.out.println();
    }

    public static void allAnimalsSleep(Vector<Animal> list) {
        for (Animal a : list) {

            if (a instanceof Crocodile) {
                System.out.print("Instance of class Crocodile -> ");

            } else if (a instanceof Cat) {
                System.out.print("Instance of class Cat -> ");

            } else if (a instanceof Murmile) {
                System.out.print("Instance of class Murmile -> ");

            }
            a.iAmSleeping();
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Vector<Animal> animalList = new Vector<>();

        Crocodile croccs = new Crocodile("Larry");
        Cat miau = new Cat("Watson");
        Murmile murm = new Murmile("Scherlock");

        animalList.add(croccs);
        animalList.add(miau);
        animalList.add(murm);

        System.out.println("ESSEN");
        allAnimalsEat(animalList);
        System.out.println("LEBEN:");
        allAnimalsLive(animalList);
        System.out.println("SCHLAFEN");
        allAnimalsSleep(animalList);


    }
}
