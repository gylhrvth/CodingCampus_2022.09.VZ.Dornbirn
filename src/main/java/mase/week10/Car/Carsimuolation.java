package mase.week10.Car;

import mase.week10.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class Carsimuolation {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Mercedes Benz","E63",450,34,Car.Antriebe.Benzin,1990);
        Car car2 = new Car("Tesla", "S",750,30,Car.Antriebe.Strom,2042);
        Car car3 = new Car("VW","Transporter T5",150,50,Car.Antriebe.Diesel,1930);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car car : cars) {
            System.out.println(car.getModel());
            for (int i = 0; i < 5; i++) {
                car.drive(600);
                if (car.getAktuellerTankinhalt() <= 1) {
                    car.fillTank();
                }
                System.out.println();
            }
        }
    }
}
