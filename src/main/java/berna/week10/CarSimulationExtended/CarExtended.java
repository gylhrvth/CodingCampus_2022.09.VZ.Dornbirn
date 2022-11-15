package berna.week10.CarSimulationExtended;


//TODO 15.11.22 {Bugs: P should not be larger than one (or change the Breakdown criteria!), solve tank issue!!


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

    public void drive(double distanceWanted) {
        //drive as long you have fuel

        double reachableDistance = (tank.actualAmountFuel / fuelConsumptionAverage) * 100;
        double drivenDistance;

        if (distanceWanted <= reachableDistance) {
            drivenDistance = distanceWanted;
            System.out.printf("     You drove %.2f km, you reached your goal! ", drivenDistance);

        } else {
            drivenDistance = reachableDistance;
            System.out.printf("     Not enough fuel for this distance! %n");
            System.out.printf("     You only drove %.2f km ! %n", reachableDistance);
        }
        //you drove, so reduce the amount of fuel in dependence of the car´s fuelConsumptionAverage
        tank.reduceTankFillLevel(drivenDistance, fuelConsumptionAverage);
        engine.addDistance(drivenDistance);

        System.out.printf("%n >> Info from board computer << %n");
        System.out.printf("     TANK:  %.2f units left %n", tank.getTankFillLevel());
        System.out.printf("     ENGINE:  %d starts, total covered distance:  %.2f km, P(breakdown) = %.5f %n", engine.getCounterStarts(),engine.getCoveredDistanceEngine(),engine.getBreakdownProbability());
        System.out.println("-------------------------------------------------------------------------");
    }


    public void simulateDriving(int distanceWanted) {
        System.out.println("So you want to drive " + distanceWanted + " km? ");

        if (engine.isNeedToRepair() || tank.actualAmountFuel <= 0) {
            System.out.println("There is a problem:");
            if (engine.isNeedToRepair()) {
                System.out.println("    Your engine is broken! Let your car pick up... ");
                RepairStation garage = new RepairStation(this);
                System.out.println(garage.printRepairStation());
                go = true;
            }
            if (tank.actualAmountFuel <= 0) {
                System.out.println("    The tank is empty! Let your car pick up... ");
                GasStation gasStation = new GasStation();
                System.out.println(gasStation.printGasStationInfo());
                go = true;
            }
        } else {
            go = true;
        }

        if (go) {
            System.out.println("Engine is o.k and you have fuel, so let´s drive ... ");
            //double smallSteps = distanceWanted / 10.0;
            engine.setEngineOn(true);
            drive(distanceWanted);
            engine.isEngineRandomBroken();
            engine.setEngineOn(false);
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
