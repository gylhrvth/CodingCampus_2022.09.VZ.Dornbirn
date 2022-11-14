package mase.week08.Zoo;

import mase.week08.Zoo.Animal;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private String description;

    private List<Animal> animalList = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public Enclosure(String description){
        this.description= description;
    }

    public void printEnclosure(){
        System.out.println( "|   |--- Gehege: " + description);
        if(animalList.size()>0) {
            for (Animal a : animalList) {
                System.out.println("|        |--- " + a.toString());
            }
        }else{
            System.out.println("|        |--- " + "(leer)");
        }
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    @Override
    public String toString() {
        return   description;
    }


}
