package franz.week08.Cars;

import java.util.Random;

public class Engine {

    public String getName() {
        return name;
    }

    private String name;
    private int gefahreneKm;
    private int kw;

    private boolean defekt;

    public Engine(String name, int kw) {
        this.gefahreneKm = 0;
        this.name = name;
        this.kw = kw;
        this.defekt = false;
    }

    public int getkw() {
        return kw;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public int drive(int distanceinkm) {
        defekt = (new Random().nextInt(100000) < gefahreneKm);
        if (defekt) {
            distanceinkm = new Random().nextInt(distanceinkm);
        }
        gefahreneKm += distanceinkm;

        return distanceinkm;
    }
}
