package berna.week10.CarSimulationExtended;

public class GasStation {
    public CarExtended carToRefill;
    public Tank tankToFill;
    public double howMuch;

    public void GasStation(CarExtended carToRefill){
        this.carToRefill = carToRefill;
        tankToFill = carToRefill.getTank();
        tankToFill.refill(20);

    }
    public String printGasStationInfo(){
        return "         Welcome to the gas station! \n" +
                "        Your car is refilled with 20 units. Have a good journey!";
    }
}
