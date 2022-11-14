package milan.week09.carExtended;

import java.util.Random;
import java.util.Vector;

public class RepairStation {

    public static Random ran = new Random();
    private String name;
    private Vector<Motor> motorenListe = new Vector<>();
    private Vector<Tank> tankListe = new Vector<>();


    public RepairStation(String name) {
        this.name = name;
    }

    public void changeEnginge(Car kunde){
        kunde.setMotor(motorenListe.get(ran.nextInt(motorenListe.size())));
    }
    public String getName() {
        return name;
    }

    public void addTankToList(Tank tank) {
        tankListe.add(tank);
    }

    public void addMotorToList(Motor motor) {
        motorenListe.add(motor);
    }
}
