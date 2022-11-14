package batuhan.week08zoo;

import java.util.Map;
import java.util.Random;
import java.util.Vector;

public class Gehege {
    //   private String animalname;
//    private String animalbreed;
    private String animalenclosure;   //Tiergehege
    private static int lastID = 1;
    private int id;
    public Vector<Animal> listOfAnimal = new Vector<Animal>();


    public Gehege(String animalenclosure) {
        id = lastID;
        lastID++;
        this.animalenclosure = animalenclosure;
//        animalname = "Leo";
//        animalbreed = "Lion";


    }

    public Vector<Animal> getListOfAnimal() {
        return listOfAnimal;
    }

    public int getId() {
        return id;
    }

    public String getAnimalenclosure() {
        return animalenclosure;
    }

    //public void setAnimalname(String animalname){
//        this.animalname = animalname;
//}
//public void setAnimalbreed(String animalbreed){
//        this.animalbreed = animalbreed;

//}


    public void putAnimal(Animal animals) {
        listOfAnimal.add(animals);


    }

    public String toString(){

        return animalenclosure;
    }

//    public void printStuktur(){
//
//
//    }   System.out.println("│   ├── Gehege: " + animalenclosure);

    public void printStuktur() {
        System.out.println("│   ├── Gehege: " + animalenclosure  );

        if (listOfAnimal.size() == 0) {
            System.out.println("│      ├──   leer" );
        } else {


            for (Animal a :listOfAnimal) {
                System.out.println(a.toSting());

            }
        }
    }
    public String watchFavAnimal(Zookeeper zookeeper) {
        Random random = new Random();
        int randomindex = random.nextInt(listOfAnimal.size());
        Animal animal = listOfAnimal.get(randomindex);
        return animal.getAnimalName();
    }



    public void calculateFoodMap(Map<Animalfeed, Double> foodMap) {
        for (Animal a : listOfAnimal){
            a.calculateFoodMap(foodMap);
        }
    }

}
