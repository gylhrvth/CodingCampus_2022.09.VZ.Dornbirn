package patric.week08.Zoo;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private int yearOfFounding;

    ArrayList<Gehege> list = new ArrayList<>();

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

    public void printListWithGehege() {

        System.out.println("|----Zoo: " + name + ", Gründungsjahr " + yearOfFounding);
        for (Gehege g : list) {
            g.printGehege();

        }
    }

    public String toString() {
        return "|------Zoo:" + name + "Gründungsjahr" + yearOfFounding;
    }


}
