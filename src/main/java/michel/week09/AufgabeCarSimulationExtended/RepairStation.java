package michel.week09.AufgabeCarSimulationExtended;

public class RepairStation {

    private String name;
    private Car carToRepair;

    public RepairStation(String name) {
        this.name = name;
    }

    public void repairEngine(Car car) {
        car.changeEngine(car.getEngine().getModel(), car.getEngine().getLeistungKW());
        car.getEngine().setFunctionStatus(true);
        System.out.println("\nMotor wurde getauscht! Kilometerstand wieder auf 0 Km");
    }

    public void upgradeEngine(Car car, String model, int leistungKw) {
        car.changeEngine(model, leistungKw);
        System.out.println("Der Motor von -> " + car.getManufacturer() + " " + car.getModel() + " <- wurde gewechselt. Der neue " + car.getEngine());
}

    public void upgradeTank(Car car, String model, int capacity) {
        car.changeTank(model,capacity);
//        car.setTank(new Tank(model, capacity));
        System.out.println("Der Tank von -> " + car.getManufacturer() + " " + car.getModel() + " <- wurde gewechselt. Der neue " + car.getTank());
    }

}
