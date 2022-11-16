package michel.week09.AufgabeCarSimulation;

import java.util.Random;

public class Car {
    public Random rand = new Random();
    private final String manufacturer;
    private final String model;
    private final int powerKW;
    private final int tankCapacity;
    private int actualTank;

    enum DriveType {benzin, diesel, gas, strom}

    private final DriveType driveType;
    private final int weight;

    public Car(String manufacturer, String model, int powerKW, int tankCapacity, DriveType driveType, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerKW = powerKW;
        this.tankCapacity = tankCapacity;
        this.driveType = driveType;
        this.weight = weight;
        this.actualTank = tankCapacity;
    }

    public double fuelUsage100km() {
        return weight * 0.0005 + powerKW * 0.025;
    }

    public int drive(int distance) {
        double maxDistanceCar = (actualTank / fuelUsage100km()) * 100;
        int drivenDistance;
        if (maxDistanceCar >= distance) {
            drivenDistance = distance;
        } else {
            drivenDistance = (int) maxDistanceCar;
        }
        double consumedFuelDrivenKm = (fuelUsage100km() / 100) * drivenDistance;
        actualTank -= (int) consumedFuelDrivenKm;
        System.out.print("Zurückgelegte Distanz: " + drivenDistance + " km, Füllstand Tank: < " + actualTank + " l");
        return drivenDistance;
    }

    public void fillTank() {
        int fill = actualTank + rand.nextInt(10, (tankCapacity - actualTank));
        setActualTank(fill);
        System.out.print(", es wurden: " + fill + " l getankt");
    }
    public double getActualTank() {
        return actualTank;
    }

    public String getModel() {
        return model;
    }

    public void setActualTank(int actualTank) {
        this.actualTank = actualTank;
    }
    public String toString() {
        return "Car{" +
                "Hersteller = " + manufacturer +
                ", Model = " + model +
                ", Leistung = " + powerKW +
                " kW, Kapazität Tank = " + tankCapacity +
                " l, Aktueller Füllstand = " + actualTank +
                " l, Antriebsart = " + driveType +
                ", Gewicht = " + weight + " kg" +
                '}';
    }
}
