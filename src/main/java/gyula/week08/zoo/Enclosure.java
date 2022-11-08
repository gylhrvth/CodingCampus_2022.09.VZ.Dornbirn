package gyula.week08.zoo;

import javax.lang.model.element.AnnotationMirror;
import java.util.Vector;

public class Enclosure {
    private String name;

    private Vector<Animal> animalList = new Vector<>();

    public Enclosure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.printf("│   ├── Gehege: %s\n", name);
        for (Animal animal: animalList){
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

    public void simulateDay(ZooKeeper zk){
        System.out.printf("%s füttert die Tiere und reinigt das Gehege %s\n",
                zk.getName(),
                name);
    }
}