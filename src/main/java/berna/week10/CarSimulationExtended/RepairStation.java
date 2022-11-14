package berna.week10.CarSimulationExtended;


public class RepairStation {

    public CarExtended carToRepair;

    public  RepairStation(CarExtended carToRepair) {
        this.carToRepair = carToRepair;
        carToRepair.getEngine().resetMaxDistanceEngine(); // reset km Max of engine
        carToRepair.getEngine().setNeedToRepair(false);
    }
    public String printRepairStation(){
        return "    Welcome to the repair Station!\n"+
                "   Your engine is changed now, have a good journey!";
    }
}
