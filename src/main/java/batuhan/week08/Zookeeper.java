package batuhan.week08;

import java.util.Vector;

public class Zookeeper {


    private String zookeeper;
    private boolean cleanEnclosure;
    private String animalfeed;
    private boolean fed;
    private Vector<Gehege>listofEnclosure = new Vector<Gehege>();



    public Zookeeper(String zookeeper){
        this.zookeeper = zookeeper;
        fed = false;
        cleanEnclosure = false;
        animalfeed = animalfeed;



    }
    public void putEnclosure(Gehege gehege) {
        listofEnclosure.add(gehege);


    }



}
