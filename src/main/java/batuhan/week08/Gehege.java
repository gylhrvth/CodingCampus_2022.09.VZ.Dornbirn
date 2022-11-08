package batuhan.week08;

import java.util.Vector;

public class Gehege {
    //   private String animalname;
//    private String animalbreed;
    private String animalenclosure;   //Tiergehege
    private static int lastID = 1;
    private int id;
    public Vector<Animals> listOfAnimal = new Vector<Animals>();


    public Gehege(String animalenclosure) {
        id = lastID;
        lastID++;
        this.animalenclosure = animalenclosure;
//        animalname = "Leo";
//        animalbreed = "Lion";


    }

    public int getId() {
        return id;
    }
//public void setAnimalname(String animalname){
//        this.animalname = animalname;
//}
//public void setAnimalbreed(String animalbreed){
//        this.animalbreed = animalbreed;

//}


    public void putAnimal(Animals animals) {
        listOfAnimal.add(animals);


    }

//    public void printStuktur(){
//
//        System.out.println("│   ├── Gehege: " + animalenclosure);
//    }

    public void printStuktur() {
        System.out.println("│   ├── Gehege: " + animalenclosure  );

        if (listOfAnimal.size() == 0) {
            System.out.println("│      ├──   leer" );
        } else {


            for (Animals a :listOfAnimal) {
                System.out.println(a.toSting());

            }
        }
    }
}
