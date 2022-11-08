package batuhan.week08;

import java.util.Vector;

public class Zookeeper {


    private String zookeeper;
    private Animals cleanEnclosure;
    private Animals animalfeed;
    private String timeToEat;
    private String timetoClean;


    private Vector<Gehege>listofEnclosure = new Vector<Gehege>();




    public Zookeeper(String zookeeper){
        this.zookeeper = zookeeper;






    }
    public String timeToEat(Animals animalToFeed,boolean feedAnimal) {
        this.animalfeed = animalToFeed;
        if (feedAnimal){
            return "The "+animalfeed.getAnimalBreed()+" " +animalfeed.getAnimalName() + " was fed ";
        } else {
            return "The " +animalfeed.getAnimalBreed()+" " +animalfeed.getAnimalName()+ " still needs to be fed";
        }
    }
    public void putEnclosure(Gehege gehege) {
        listofEnclosure.add(gehege);


    }
    public String timeToClean(Gehege timetoClean,boolean clean){
        this.cleanEnclosure = cleanEnclosure;
        if (clean){
            return "The " + listofEnclosure +" from "+animalfeed.getAnimalName() +" is clean";
        }else {
            return "The " + animalfeed.getAnimalName() + "must be clean";
        }

    }

    public String getZookeeper() {
        return zookeeper;
    }
}

