package berna.week10.CarSimulationExtended;

public class CarExtended {
    public Engine engine;
    public Tank tank;
    public int weightOfCar;
    public double fuelConsumptionAverage;
    public boolean go;

    public CarExtended(Engine engine, Tank tank, int weightOfCar) {
        this.engine = engine;
        this.tank = tank;
        this.weightOfCar = weightOfCar;
        double weightFactor1 = (weightOfCar / (engine.getKW() * 1000.0));
        // higher consumption with higher factor
        fuelConsumptionAverage = 7.0 + (7 * weightFactor1); // reference consumption per 100km
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    public String getStateOfEngine() {
        if (engine.isNeedToRepair()) {
            return "Engine needs to be repaired! \n";
        } else {
            return "Engine is ok. No maintenance needed yet! \n";
        }
    }

    public String getFillLevelTank() {
        return "Actual fill level: " + tank.getTankFillLevel() + " units. \n";
    }

    public double drive(double distanceWanted) {
        //drive as long you have fuel

        double reachableDistance = (tank.actualAmountFuel / fuelConsumptionAverage) * 100;
        double drivenDistance;

        if (distanceWanted <= reachableDistance) {
            System.out.println("You reached your goal!");
            drivenDistance = distanceWanted;
            System.out.printf("You drove %.2f km ", drivenDistance);
        } else {
            System.out.println("Not enough fuel for this distance!");
            System.out.printf("You only drove %.2f km ! %n", reachableDistance);
            drivenDistance = reachableDistance;
        }

        //you drove, so reduce the amount of fuel in dependence of the car´s fuelConsumptionAverage
        tank.reduceTankFillLevel(drivenDistance, fuelConsumptionAverage);
        System.out.printf("and you have %.2f units left in your tank! %n", tank.getTankFillLevel());
        return drivenDistance;
    }


    public void driveSimulation(int distanceWanted) {
        System.out.println("So you want to drive " + distanceWanted + " km? ");

        if (engine.isNeedToRepair() || tank.actualAmountFuel <= 0) {
            System.out.println("There is a problem:");
            if (engine.isNeedToRepair()) {
                System.out.println("Your engine is broken! Let your car pick up... ");
                RepairStation garage = new RepairStation(this);
                System.out.println(garage.printRepairStation());
                go = true;
            }
            if (tank.actualAmountFuel <= 0) {
                System.out.println("The tank is empty! Let your car pick up... ");
                GasStation gasStation = new GasStation();
                System.out.println(gasStation.printGasStationInfo());
                go = true;
            }
        } else {
            go = true;
        }

        if (go) {
            System.out.println("Let´s drive ... ");
            //double smallSteps = distanceWanted / 10.0;
            drive(distanceWanted);
            engine.setEngineOn(true);
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("===========================================================\n");
        text.append("No more Bobby Cars...\nCAR SIMULATION EXTENDED VERSION \n");
        text.append("===========================================================\n");
        text.append(getStateOfEngine());
        text.append(getFillLevelTank());
        return text.toString();
    }

}
