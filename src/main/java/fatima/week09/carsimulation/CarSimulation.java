package fatima.week09.carsimulation;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Car c1 = new Car("Ford", "Mustang", 175, 1500, 100, 50);
        Car c2 = new Car("Fiat", "500", 80, 1000, 70, 40);

        c1.print();
        c2.print();
        System.out.println();

        cars.add(c1);
        cars.add(c2);

        for (Car car : cars) {
            for (int i = 0; i < 3; i++) {
                car.drive(500);
                if (car.getActualTank() < 1) {
                    car.refuel();
                }
            }
            System.out.println();
        }
    }
}
