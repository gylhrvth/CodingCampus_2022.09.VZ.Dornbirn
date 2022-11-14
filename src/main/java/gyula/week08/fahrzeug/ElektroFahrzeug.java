package gyula.week08.fahrzeug;

public class ElektroFahrzeug extends MotorisiertesFahrzeug{
    private int ladekabelLaenge;

    public ElektroFahrzeug(String id, String hersteller, float leistungKW, int ladekabelLaenge){
        super(id, hersteller, leistungKW);
        this.ladekabelLaenge = ladekabelLaenge;
    }

    @Override
    public String toString() {
        return "Ich bin ein Elektrofahrzeug. " + super.toString();
    }
}
