package michel.week08.Tiergarten;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    private String description;
    private List<Animal> animalList =new ArrayList<>();
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public Enclosure(String description){
        this.description=description;
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    public void removeAnimal(Animal animal){
        animalList.remove(animal);
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
    @Override
    public String toString() {
       return description;
    }
}

