package fatima.week09.carsimulation;

import java.util.Random;

public class Car {

    private static Random rand = new Random();
    private final String manufacturer;
    private final String model;
    private final int kW;
    private double actualTank;
    private final int weight;
    private final int maxTankCapacity;

    enum EngineType {
        PETROL,
        DIESEL,
        GASOLINE,
        ELECTRIC
    }

    public Car(String manufacturer, String model, int kW, int weight, int maxTankCapacity, double actualTank) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.weight = weight;

        this.maxTankCapacity = maxTankCapacity;
        this.actualTank = actualTank;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getActualTank() {
        return actualTank;
    }

    private double calculateFuelPerKM() {
        return (((weight * 0.00005) + (kW * 0.0001)));
    }

    public double drive(int kilometers) {
        double fuelPerKm = calculateFuelPerKM();
        int kmHasDriven = 0;
        while (kilometers > 0 && actualTank > fuelPerKm){
            ++kmHasDriven;
            --kilometers;
            actualTank -= fuelPerKm;
        }
        if (kilometers == 0){
            System.out.printf(manufacturer + " " + model + " drove: %d km ▶ left tank: %.2f l\n", kmHasDriven, actualTank);
        } else {
            System.out.printf(manufacturer + " " + model + " only reached: %d km ▶ left km to arrival: %d km ▶ left tank: %s l\n", kmHasDriven, kilometers, actualTank);
        }
        return kmHasDriven;
        /*
        double maxDistanceToDrive = actualTank / calculateFuelPerKM();
        double drivenKilometers = 0;
        if (maxDistanceToDrive >= kilometers) {
            drivenKilometers = kilometers;
            System.out.printf(manufacturer + " " + model + " drove: %.2f km ▶ left tank: %s l\n", drivenKilometers, actualTank);
        } else if (actualTank >= 0) {
            drivenKilometers = maxDistanceToDrive;
            System.out.printf(manufacturer + " " + model + " only reached: %.2f km ▶ left km to arrival: %.2f km ▶ left tank: %s l\n", drivenKilometers, kilometers - drivenKilometers, actualTank);
        }
        double minTank = 0;
        double spendFuel = calculateFuelPerKM() * kilometers;
        if (actualTank >= minTank) {
            actualTank -= spendFuel;
        } else {
            actualTank = 0;
        }
        return drivenKilometers;
         */
    }

    public void refuel() {
        int fill = rand.nextInt(10, (maxTankCapacity - (int)actualTank));
        actualTank += fill;
        System.out.println("–––––––> " + fill + " liters were filled up, ▶ tank status: " + actualTank);
    }

    public void print(){
        System.out.println(manufacturer + " " + model + ", " + kW + " kW, " + weight + " kg, max tank capacity: " + maxTankCapacity + " l, actual tank: " + actualTank + " l");
    }
}
