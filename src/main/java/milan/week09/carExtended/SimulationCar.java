package milan.week09.carExtended;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationCar {
    public static Random ran = new Random();

    public static void main(String[] args) {

        Motor v8 = new Motor("V8");

        List<Car> carList = new ArrayList<>();

        for (int i = 1; i < 2; i++) {
            Car vw = new Car("Golf" + i, "Volkswagen", 60 + ran.nextInt(40), 80 + ran.nextInt(40), 1.2 + ran.nextDouble(0.8));
            carList.add(vw);
            vw.setMotor(v8);

        }


        int entfernung = 500000;

        for (Car x : carList) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(x.getModell() + " fährt los: ");
            System.out.println(x.getMaxTankinhalt() + "\n" + x.calculateVerbrauch());
            System.out.println();
            x.carSimulation(entfernung);

        }


    }
}
