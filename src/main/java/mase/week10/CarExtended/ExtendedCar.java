package mase.week10.CarExtended;

public class ExtendedCar {
    public String hersteller;
    public String model;
    public int gewicht;
    public Engine engine;
    public Tank tank;
    public int actualTank;


    public ExtendedCar(String hersteller, String model, int gewicht, Engine engine, Tank tank) {
        this.hersteller = hersteller;
        this.model = model;
        this.gewicht = gewicht;
        this.engine = engine;
        this.tank = tank;
    }

    public double fuelUse100km() {
        return gewicht * 0.0005 + engine.getKw() * 0.025;
    }

    public int drive(int distance) {
        double maxDistanceCar = (actualTank / fuelUse100km()) * 100;
        int drivenDistance;
        if (maxDistanceCar >= distance) {
            drivenDistance = distance;
        } else {
            drivenDistance = (int) maxDistanceCar;
        }
        double consuemedFuel = (fuelUse100km() / 100) * drivenDistance;
        actualTank -= (int) consuemedFuel;
        System.out.println("Zurückgelegte Distanz: " + drivenDistance + "km, Füllstand Tank: <" + actualTank + " l");
        engine.setKmstand(drivenDistance);
        return drivenDistance;
    }
}


