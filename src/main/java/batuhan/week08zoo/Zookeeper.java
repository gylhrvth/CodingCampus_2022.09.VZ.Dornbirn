package batuhan.week08zoo;

import java.util.Vector;

public class Zookeeper {


    private String zookeeper;
    private Animal cleanEnclosure;
    private Animal animalfeed;
    private String timeToEat;
    private String timetoClean;
    private String animalenclosure;


    private Vector<Gehege> listofEnclosure = new Vector<Gehege>();


    public Zookeeper(String zookeeper) {
        this.zookeeper = zookeeper;


    }


    public String getTimetoClean() {
        return timetoClean;
    }

    public String timeToEat(Animal animalToFeed, boolean feedAnimal) {
        this.animalfeed = animalToFeed;
        if (feedAnimal) {
            return zookeeper+ " says: The " + animalfeed.getAnimalBreed() + " " + animalfeed.getAnimalName() + " was fed ";
        } else {
            return zookeeper +" says: The " + animalfeed.getAnimalBreed() + " " + animalfeed.getAnimalName() + " still needs to be fed";
        }
    }

    public void putEnclosure(Gehege gehege) {
        listofEnclosure.add(gehege);

    }

    public String timeToClean(Gehege timetoClean,Animal animal, boolean clean) {
        this.cleanEnclosure = cleanEnclosure;
        if (clean) {
            return zookeeper +" says: The " + timetoClean + " enclosure form the " + animal.getAnimalBreed() + "´s has already been cleaned";
        } else {
            return zookeeper+" says: The " + timetoClean + " enclosure form the " + animal.getAnimalBreed() + "`s needs cleanig";
        }

    }



    public String getZookeeper() {
        return zookeeper;
    }


}




