package berna.week10.CarSimulationExtended;


//TODO 15.11.22 {Bugs: P should not be larger than one (or change the Breakdown criteria!), solve tank issue!!


public class CarExtended {

    public Engine myEngine;
    public Tank myTank;
    public int weightOfCar;
    public double fuelConsumptionAverage;
    public boolean go;

    public CarExtended(Engine engine, int weightOfCarKG) {
        this.myEngine = engine;
        this.myTank = engine.getTank();
        this.weightOfCar = weightOfCarKG;
        double weightFactor1 = (weightOfCarKG / (engine.getKW() * 1000.0));
        // higher consumption with higher factor
        fuelConsumptionAverage = 7.0 + (7 * weightFactor1); // reference consumption per 100km
    }



    public void drive(double distanceWanted) {
        //drive as long you have fuel

        double reachableDistance = (myTank.actualAmountFuel / fuelConsumptionAverage) * 100;
        double drivenDistance;

        if (distanceWanted <= reachableDistance) {
            drivenDistance = distanceWanted;
            System.out.printf("     You drove %.2f km and you reached your goal! ", drivenDistance);

        } else {
            drivenDistance = reachableDistance;
            System.out.printf("     Not enough fuel! %n");
            System.out.printf("     You only drove %.2f km now you have to refill your tank to continue! %n", reachableDistance);
        }
        //you drove, so reduce the amount of fuel and add driven distance to engines distance
        myTank.reduceTankFillLevel(drivenDistance, fuelConsumptionAverage);
        myEngine.addDistance(drivenDistance);

        System.out.printf("%n   << Info from board computer >> %n");
        System.out.printf("     ENGINE:  %d starts, total covered distance:  %.2f km, P(breakdown) = %.5f %n", myEngine.getCounterStarts(), myEngine.getCoveredDistanceEngine(), myEngine.getBreakdownProbability());
        System.out.printf("     TANK:    %.2f units left %n", myTank.getTankFillLevel());
        System.out.println("-------------------------------------------------------------------------");
    }


    public void simulateDriving(int distanceWanted) {

        System.out.println("So you want to drive " + distanceWanted + " km? ");
        //Check first if the myEngine is ok and if you have fuel
        if (myEngine.isNeedToRepair() || myTank.actualAmountFuel <= 0) {
            System.out.println("There is a problem:");
            if (myEngine.isNeedToRepair()) {
                System.out.println("    Your myEngine is broken! Let your car pick up... ");
                RepairStation garage = new RepairStation(this);
                System.out.println(garage.printRepairStation());
                go = true;
            }
            if (myTank.actualAmountFuel <= 0) {
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
            myEngine.setEngineOn(true);
            drive(distanceWanted);
            myEngine.checkNeedToRepair();
            myEngine.setEngineOn(false);
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("\n ===========================================================\n");
        text.append("No more Bobby Cars...\nCAR SIMULATION EXTENDED VERSION \n" +
                    "===========================================================\n" +
                    "   << YOUR CAR >> \n" +
                    myEngine +
                    "Tank:   " + myTank.maxCapacityTank + " units total tank capacity, " + myTank.actualAmountFuel + " units actually available \n" +
                    "===========================================================\n");
        return text.toString();
    }

    public Engine getMyEngine() {return myEngine;}

    public Tank getTank() {return myTank;}

}
