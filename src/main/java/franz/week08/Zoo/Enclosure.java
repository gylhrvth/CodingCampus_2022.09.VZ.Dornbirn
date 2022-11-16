package franz.week08.Zoo;


import java.util.Vector;

public class Enclosure {
    Vector<Animal> animalList = new Vector<>();
    private String name;


    public Enclosure(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void printStructure() {
        System.out.printf("|   |-- Gehege: %s\n", name);
        for (Animal animal : animalList) {
            animal.printStructure();
        }
    }

    public Animal searchAndCreate(String name, String art) {
        for (Animal animal : animalList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        Animal animal = new Animal(name, art);
        animalList.add(animal);
        return animal;
    }

    //    YXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYX
    public void simulateDay(ZooKeeper zk) {
        System.out.printf("%s Fuetter die Tiere und Reinigt das Gehege %s\n",
                zk.getName(),
                name);
    }
}


