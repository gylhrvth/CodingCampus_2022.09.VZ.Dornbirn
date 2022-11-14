package michel.week09.AufgabeCarSimulation;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Mercedes", "Cla 200d", 150, 35, Car.DriveType.diesel, 1400);
        Car car2 = new Car("Mercedes", "Cla 250d", 200, 35, Car.DriveType.diesel, 1600);
        Car car3 = new Car("Mercedes", "Cla 300d", 250, 35, Car.DriveType.diesel, 1700);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car car : cars) {
            System.out.println(car.getModel());
            for (int i = 0; i < 5; i++) {
                car.drive(600);
                if (car.getActualTank() <= 1) {
                    car.fillTank();
                }
                System.out.println();
            }
        }

    }
}
