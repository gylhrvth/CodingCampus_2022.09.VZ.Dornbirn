package gyula.week08.fahrzeug;

public class MotorisiertesFahrzeug extends Fahrzeug {
    private float leistungKW;

    public MotorisiertesFahrzeug(String id, String hersteller, float leistungKW){
        super(id, hersteller);
        this.leistungKW = leistungKW;
    }
}
