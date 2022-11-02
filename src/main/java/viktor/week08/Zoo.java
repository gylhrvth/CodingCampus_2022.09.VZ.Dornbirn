package viktor.week08;

import batuhan.week03.Array;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private int yearOfFounding;


    ArrayList<Gehege> list = new ArrayList<Gehege>();

    public Zoo(String name, int yearOfFounding) {
        this.name = name;
        this.yearOfFounding = yearOfFounding;
    }

    public void putGehegeToZoo(Gehege d) {
        list.add(d);
    }

    public void removeGehegeFromZoo(Gehege d) {
        list.remove(d);
    }

    public void printListWithEnclosures() {

        System.out.println("|----Zoo: " + name + ", gegründet " + yearOfFounding);
        for (Gehege g : list) {
            g.printGehege();

        }
    }

    public String toString(){
        return "|----Zoo: " + name + ", gegründet " + yearOfFounding;
    }
}




