package martin.week09;

import martin.week10.Engine;
import martin.week10.Tank;

public class Car {
    private static int globalIdCounter = 0;
    private int id;
    private Engine engine;
    private Tank tank;
    private final String hersteller;
    private String modell;
    private int gewicht;

    public Car(Engine engine, Tank tank, int gewicht, String hersteller, String modell) {
        globalIdCounter++;
        id = globalIdCounter;
        this.engine = engine;
        this.tank = tank;
        this.hersteller = hersteller;
        this.modell = modell;
        this.gewicht = gewicht;
    }

    public String getModell() {
        return modell;
    }

    public int getId() {
        return id;
    }

    public int getKW() {
        return this.engine.getKW();
    }

    public int tankInhalt() {
        return this.tank.inhalt();
    }

    public void tankFill(int fillTo) {
        this.tank.fill(fillTo);
    }

    public int getGewicht() {
        return gewicht;
    }

    public int verbrauch() {
        return (gewicht * 3) / (this.engine.getKW() * 5);
    }

    public int drive(int kilometer) {

        int canDrive = (int) Math.ceil(this.tankInhalt() * this.verbrauch());
        if (canDrive > kilometer) {
            this.tankFill(this.tankInhalt() - (kilometer / verbrauch()));
            return kilometer;
        } else {
            this.tankFill(0);
            return canDrive;
        }
    }

    public int refill(int refAmm) {
        this.tank.fill(refAmm);
        return refAmm;
    }

    public boolean needRefill(int needRef) {
        return tank.inhalt() < needRef;
    }
}
