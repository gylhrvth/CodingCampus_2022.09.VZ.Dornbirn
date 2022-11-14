package milan.week09.carExtended;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationCar {
    public static Random ran = new Random();

    public static void main(String[] args) {

        Motor v8 = new Motor("V8", 180);
        Motor v6 = new Motor("V8", 180);

        NormalCar bmw = new NormalCar(v8, "i4", "BMW", 1.2 + ran.nextDouble(0.8));
        SelfRepairingCar bmw2 = new SelfRepairingCar(v6, "i4", "BMW", 1.2 + ran.nextDouble(0.8));


        Tank tank = new Battery("Varta");
        bmw.setTank(tank);

        bmw.carSimulation(3000);
        bmw2.carSimulation(3000);

        RepairStation oeamtc = new RepairStation("ÖMTC");

        for (int i = 0; i < 20; i++) {
            Motor engine = new Motor("xy" + i, 80 + ran.nextInt(80));
            oeamtc.addMotorToList(engine);
        }
        bmw.setMotor(v8);

        System.out.println("Vor dem Tausch: " + bmw.getMotorName());
        oeamtc.changeEnginge(bmw);
        System.out.println("Nach dem Tausch: " + bmw.getMotorName());


    }
}
