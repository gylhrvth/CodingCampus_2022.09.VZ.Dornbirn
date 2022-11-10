package lukas.week08.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Crocodile("Dundee"));
        animals.add(new Cat("Dobier"));
        animals.add(new Murmile("Günter"));

        //Keine instantierung möglich mit new!!! (außer anonyme Implementierung -> wie eine Klasse direkt im Code)
        //animals.add(new Animal("Piepmatz", "Vögel"));

        System.out.println("---Essen---");
        allAnimalsEat(animals);
        System.out.println("---Leben---");
        allAnimalsLive(animals);
        System.out.println("---Schlafen---");
        allAnimalsSleep(animals);
    }

    public static void allAnimalsEat(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public static void allAnimalsLive(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.doLive();
        }
    }

    public static void allAnimalsSleep(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }
}
