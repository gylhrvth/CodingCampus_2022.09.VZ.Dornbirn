package berna.week08.ZooExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Zoo {

    public String zooName;
    public int yearFounded;

    private List<Enclosure> enclosureList;

    private List<ZooKeeper> keeperList;

    public String keeperForEnclosure;
    private static Random rand = new Random();


    public Zoo(String zooName, int yearFounded) {

        this.zooName = zooName;
        this.yearFounded = yearFounded;
        enclosureList = new ArrayList<>();
        keeperList = new ArrayList<>();
    }


    public List<Enclosure> getEnclosures(Enclosure... addEnclosure) {
        enclosureList.addAll(Arrays.asList(addEnclosure));
        return enclosureList;
    }

    public List<ZooKeeper> getAllKeepers(ZooKeeper... addKeeper) {
        keeperList.addAll(Arrays.asList(addKeeper));
        return keeperList;
    }

    public String chooseKeeper (){
        int index = rand.nextInt(0, keeperList.size());
        keeperForEnclosure = (keeperList.get(index)).nameKeeper;
        return keeperForEnclosure;
    }

    public void simulateOneDay()  {
        System.out.println("The day starts... ");
        for (Enclosure e : enclosureList) {
            System.out.println("In enclosure " + e.nameOfEnclosure + "");
            System.out.println("    there is still a lot to do at the beginning of the day ...");
            //it´s just a simplification, stupid!
            System.out.println("        >> send Keeper " + chooseKeeper());
            //TODO: check if keeper has the required skills
            System.out.println("        >> work in progress");
            //TODO: add a delay
            e.simulateOneDay();
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("Zoo: " + zooName + ", founded " + yearFounded + "\n");
        for (Enclosure e : enclosureList) {
            text.append(e.printEnclosures());
        }
        text.append("\nZookeepers hired: \n");
        for (ZooKeeper k : keeperList) {
            text.append(k.printDataOfKeeper());
        }
        return text.toString();
    }
}

