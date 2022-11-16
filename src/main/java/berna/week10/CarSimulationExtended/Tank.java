package berna.week10.CarSimulationExtended;

public class Tank {

    public int maxCapacityTank;
    public double actualAmountFuel;

    public Tank( int maxCapacityTank, double fillLevel) {
        this.maxCapacityTank = maxCapacityTank;
        this.actualAmountFuel = fillLevel;
    }

    //TODO: 14.11.22 is refill really in class Tank?
    public void refill(double howMuch) {

        if (howMuch + actualAmountFuel > maxCapacityTank) {
            System.out.println("Stupid! Your tank still has " + actualAmountFuel + " units and you can only have  " + maxCapacityTank + " units in total. Try again!");
        } else {
            actualAmountFuel = actualAmountFuel + howMuch;
            System.out.printf("successfully refilled! new actual amount of fuel %.02f units %n ", actualAmountFuel);
        }
    }

    public double reduceTankFillLevel(double drivenDistance, double fuelConsumptionReference){
        double fuelConsumed = (drivenDistance / 100) * fuelConsumptionReference;
        //System.out.printf("consumed fuel : %.2f units %n ", fuelConsumed);
        actualAmountFuel = actualAmountFuel - fuelConsumed;
        return actualAmountFuel;
    }

    public double getTankFillLevel() {
        return actualAmountFuel;
    }

    public String printTankInfo(){
        return
                "Tank:  " + maxCapacityTank + " units max. capacity,  "+ actualAmountFuel + " units actually available.\n ";
    }



}
