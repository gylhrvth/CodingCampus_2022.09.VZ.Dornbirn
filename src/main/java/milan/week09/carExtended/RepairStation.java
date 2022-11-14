package milan.week09.carExtended;

import java.util.Random;
import java.util.Vector;

public class RepairStation {

    public static Random ran = new Random();
    private String name;

    public RepairStation(String name) {
        this.name = name;
    }

    public void changeEnginge(Car kunde){
        Motor altMotor = kunde.getMotor();
        Motor motor = altMotor.clone();
        kunde.setMotor(motor);
    }
    public String getName() {
        return name;
    }

}
