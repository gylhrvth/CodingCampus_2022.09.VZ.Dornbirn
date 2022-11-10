package milan.week09.carExtended;

import java.util.Vector;

public class RepairStation {

    private String name;
    private Vector<Motor> motorenListe = new Vector<>();
    private Vector<Tank> tankListe = new Vector<>();

    public RepairStation(String name) {
        this.name = name;
    }
}
