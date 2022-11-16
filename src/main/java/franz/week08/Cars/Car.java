package franz.week08.Cars;

public class Car {
    private String hersteller;
    private String model;

    private float maxTankinhalt;
    private String kraftstoff;
    private float gewicht;
    private float aktuellerTankFuellstand;
    private Engine engine;


    public Car(String hersteller, String model, int maxTankinhalt, String kraftstoff, float gewicht, Engine engine) {
        this.hersteller = hersteller;
        this.model = model;
        this.maxTankinhalt = maxTankinhalt;
        this.kraftstoff = kraftstoff;
        this.gewicht = gewicht;
        this.aktuellerTankFuellstand = maxTankinhalt;
        this.engine = engine;
    }

    public double fuelUsagePer100KM() {
        return gewicht * 0.005 + engine.getkw() * 0.025;
    }

    public float getAktuellerTankFuellstand() {
        return aktuellerTankFuellstand;
    }

    public float Refuel(float aktuelleFuellung) {
        if (aktuellerTankFuellstand + aktuelleFuellung <= maxTankinhalt) {
            this.aktuellerTankFuellstand += aktuelleFuellung;
        } else {
            aktuelleFuellung = maxTankinhalt - this.aktuellerTankFuellstand;
            this.aktuellerTankFuellstand += aktuelleFuellung;
        }
        return aktuelleFuellung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int kwOfCar() {
        return engine.getkw();
    }

    public String getModel() {
        return model;
    }

    public int drive(int kilometer) {
        double maxDistanceKilometer = aktuellerTankFuellstand / fuelUsagePer100KM() * 100;
        int drivenKM;
        if (maxDistanceKilometer >= kilometer) {
            drivenKM = engine.drive(kilometer);
        } else {
            drivenKM = (int) maxDistanceKilometer;
        }
        double consumptionForDrivenKM = (fuelUsagePer100KM() / 100) * drivenKM;
        aktuellerTankFuellstand -= consumptionForDrivenKM;
        return drivenKM;
    }

    public Engine changeEngine(Engine newEngine) {
        Engine oldEngine = this.engine;
        this.engine = newEngine;
        System.out.println("Changed Engine");
        return oldEngine;
    }

    public String toString() {
        return "Hersteller: " + hersteller +
                "Model: " + model +
                "Leistung: " + engine.getkw() +
                "Tankinhalt: " + maxTankinhalt +
                "Kraftstoff:" + kraftstoff +
                "Gewicht: " + gewicht;
    }

    public boolean isEngineDefect() {
        return engine.isDefekt();
    }
}

