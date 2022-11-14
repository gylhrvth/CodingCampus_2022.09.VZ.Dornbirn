package milan.week09.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationCar {
    public static Random ran = new Random();

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            Car vw = new Car("Golf" + i, "Volkswagen", 60 + ran.nextInt(40), 80 + ran.nextInt(40), 1.2 + ran.nextDouble(0.8));
            carList.add(vw);
        }


        int entfernung = 10000;

        for (Car x : carList) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(x.getModell() + " fährt los: ");
            System.out.println();
            x.carSimulation(entfernung);
        }

    }
}
