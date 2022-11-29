package berna.week09.CarSimulation;

public class Car {
    public String brand;
    public String modell;
    public int kW;
    public double maxFuel;
    public double actualAmountFuel;

    public double fuelConsumptionReference;

    public int weightOfCar;

    public Car(int kW, int maxFuel, int weightOfCarKilo) {
        this.kW = kW;
        this.actualAmountFuel = maxFuel; // assume that car has a full tank!
        this.maxFuel = maxFuel;
        this.weightOfCar = weightOfCarKilo;

        double weightFactor1 = (weightOfCar / (kW * 1000.0));
        // higher consumption with higher factor
        fuelConsumptionReference = 7.0 + (7 * weightFactor1); // reference consumption per 100km

    }

    public double drive(int distanceWanted) {
        //drive as long you have fuel
        //reduce the amount of fuel in dependence of kW and weight

        double reachableDistance = (actualAmountFuel / fuelConsumptionReference) * 100;
        double drivenDistance;

        if (distanceWanted <= reachableDistance) {
            drivenDistance = distanceWanted;
        } else {
            System.out.println("Not enough fuel for this distance!");
            System.out.printf("you only drove %.2f km ! %n", reachableDistance);
            drivenDistance = reachableDistance;
        }

        double fuelConsumed = (drivenDistance / 100) * fuelConsumptionReference;
        //System.out.printf("consumed fuel : %.2f units %n ", fuelConsumed);
        actualAmountFuel -= fuelConsumed;

        System.out.printf(" You reached your goal! Fuel left: %.2f units %n", actualAmountFuel);

        return drivenDistance;
    }

    public double refill(double howMuch) {
        if (howMuch + actualAmountFuel > maxFuel) {
            System.out.println("Stupid! Your tank still has " + actualAmountFuel + " units and you can only have  " + maxFuel + " units. Try again!");
        } else {
            actualAmountFuel = actualAmountFuel + howMuch;
            System.out.printf("successfully refilled! new actual amount of fuel %.02f units %n ", actualAmountFuel);
        }
        return actualAmountFuel;
    }


}


