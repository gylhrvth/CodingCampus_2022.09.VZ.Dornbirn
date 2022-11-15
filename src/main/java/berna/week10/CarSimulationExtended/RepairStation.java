package berna.week10.CarSimulationExtended;


public class RepairStation {

    public CarExtended carToRepair;

    public  RepairStation(CarExtended carToRepair) {
        this.carToRepair = carToRepair;
        carToRepair.getMyEngine().resetCoveredDistanceEngine(); // reset km covered to zero
        carToRepair.getMyEngine().setNeedToRepair(false);  // no need to repair anymore
    }
    public String printRepairStation(){
        return "        Welcome to the repair Station!\n"+
                "       Your myEngine is maintained now, have a good journey!";
    }
}
