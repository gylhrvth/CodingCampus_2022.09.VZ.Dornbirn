package stefan.week08.Car;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {

    public static void main(String[] args) {
        List<Car> carlist = new ArrayList<>();
        Car car1 = new Car("Bmw", "m3", "Benzin", 80, 2000, 80);
        Car car2 = new Car("Mercedes", "amg", "Diesel", 100, 1500, 105);
        carlist.add(car1);
        carlist.add(car2);
        car1.calculateLitersPer100KM();
        cardrive(carlist);
    }


    public static void cardrive(List<Car> carList) {
        for (Car c : carList) {
            System.out.println(c.getHersteller() + " " + c.getModell() + " Verbraucht " + c.calculateLitersPer100KM() + "l auf 100km ");
            for (int i = 0; i < 30; i++) {

                int drivenKM = c.drive(1000);
                System.out.println(c.getHersteller() + " " + c.getModell() + " fährt " + drivenKM + " km");
                if (drivenKM < 100) {
                    c.fillUp();
                    System.out.println("Es wurde getankt "+c.getAntriebsart()+"l");
                }
            }
        }
    }

}


