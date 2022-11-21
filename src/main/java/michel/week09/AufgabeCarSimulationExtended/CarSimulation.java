package michel.week09.AufgabeCarSimulationExtended;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        GasStation omv = new GasStation("OMV Dornbirn");
        RepairStation repairStation = new RepairStation("Sternauto");

        Engine engine = new Engine("Small 1.5",45);
        Tank tank = new Tank("35l",35);

        Car car1 = new Car("Opel", "Corsa", 950,engine,tank);
        Car car2 = new Car("Mercedes", "AMG", 1200,engine,tank);

        repairStation.upgradeEngine(car1,"Hayabusa",350);
        repairStation.upgradeTank(car1,"45l",45);

        repairStation.upgradeEngine(car2,"V8", 600);
        repairStation.upgradeTank(car2,"40l", 55);


        cars.add(car1);
        cars.add(car2);
        System.out.println(engine);

        for (Car car : cars) {
            System.out.println(car.getManufacturer() + car.getModel());
            for (int i = 0; i < 50; i++) {
                car.drive(100000);
                if (car.getActualTank() <= 1 && car.getEngine().getFunctionStatus()) {
                    omv.fillTank(car.getTank());
                } else {
                    repairStation.repairEngine(car);
                }
                System.out.println();
            }
        }
        System.out.println(car1);
        System.out.println(car2);
    }
}
