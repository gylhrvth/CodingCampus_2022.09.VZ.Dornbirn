package berna.week10.CarSimulationExtended;

public class GasStation {
    public CarExtended carToRefill;
    public Tank tankToFill;

    public void GasStation(CarExtended carToRefill, double howMuch){
        this.carToRefill = carToRefill;
        tankToFill = carToRefill.getTank();
        tankToFill.refill(howMuch);
    }
    public String printGasStationInfo(){
        return "Welcome to the gas station! \n" +
                "Your car is refilled. Have a good journey!";
    }
}
