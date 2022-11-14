package viktor.week08.HomePractice;

public class ElektroFahrzeug extends MotFahrzeug {

    private double chargingCableLength;

    public ElektroFahrzeug(String id, String producer, double powerInKW, double chargingCableLength) {
        super(id, producer, powerInKW);
        this.chargingCableLength = chargingCableLength;
    }

    @Override
    public String toString() {
        return super.toString() + " (Es ist ein Elektro-Fahrzeug!)";
    }
}
