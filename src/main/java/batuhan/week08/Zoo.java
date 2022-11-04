package batuhan.week08;

import java.util.Vector;

public class Zoo {
    private static int lastId = 1;
    private int id;

    private String zooName;
    private int foundingYear;
    private Vector<Gehege> enclosureList;



    public  Zoo(String name, int year){
        zooName = name;
        foundingYear = year;

        id=lastId;
        lastId++;

        enclosureList = new Vector<>();

    }

    public String getZooname(){
        return zooName;
    }
    public void addgehegelist(Gehege gehege){
        enclosureList.add(gehege);
    }

    public void printStuktur(){
        System.out.println("├── Zoo: " + zooName + ", gegründet " + foundingYear);
        for (Gehege g: enclosureList) {
            g.printStuktur();
           /* for (Animals a :g.listOfAnimal) {
                System.out.println(a.toSting());

            }*/
        }
    }

}
