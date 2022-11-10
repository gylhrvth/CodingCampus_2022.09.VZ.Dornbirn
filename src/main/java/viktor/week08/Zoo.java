package viktor.week08;

import java.util.ArrayList;


public class Zoo {

    private String name;
    private int yearOfFounding;


    ArrayList<Gehege> list = new ArrayList<Gehege>();
    ArrayList<Pfleger> pflegerList = new ArrayList<>();


    public Zoo(String name, int yearOfFounding) {
        this.name = name;
        this.yearOfFounding = yearOfFounding;
    }

    public Gehege putGehegeToZoo(String name) {
        for (Gehege g : list) {
            if (g.getDiscription().equals(name)) {
                return g;
            }
        }

        Gehege gehege = new Gehege(name);
        list.add(gehege);
        return gehege;
    }

    public void removeGehege(Gehege g){
        list.remove(g);
    }


    public Tier putTierToGehege(String gehegename, String tiername, String tierart) {
        Gehege gehege = putGehegeToZoo(gehegename);
        return gehege.putTierToGehege(tiername, tierart);
    }


    public void removeGehegeFromZoo(Gehege s) {
        list.remove(s);
    }


    public Pfleger putPflegerToGehege(String name, String... gehegeNamen) {

        for (Pfleger p : pflegerList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }

        Pfleger p = new Pfleger(name);
        pflegerList.add(p);

        for (String gname : gehegeNamen) {
            p.addGehegeForPfleger(putGehegeToZoo(gname));
        }
        return p;
    }



    public void printListWithEnclosures() {

        System.out.println("|----Zoo: " + name + ", gegründet " + yearOfFounding);
        for (Gehege g : list) {
            g.printGehege();
        }
        for (Pfleger p : pflegerList) {
            p.printStructure();
        }
    }

    public void simulateDay() {
        ArrayList<Gehege> zuPutzendeGehegen = new ArrayList<>();
        zuPutzendeGehegen.addAll(list);

        int zählerDerNochNichtGeputztenGehegen = Integer.MAX_VALUE;

        while (!zuPutzendeGehegen.isEmpty() && zuPutzendeGehegen.size() < zählerDerNochNichtGeputztenGehegen) {
            zählerDerNochNichtGeputztenGehegen = zuPutzendeGehegen.size();

            for (Pfleger p : pflegerList) {

                p.simulateDay(zuPutzendeGehegen);
            }
        }
        for (Gehege g : zuPutzendeGehegen) {
            System.out.println(g.getDiscription() + " hat keinen Pfleger!");
        }
    }
}




