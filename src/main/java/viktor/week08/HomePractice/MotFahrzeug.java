package viktor.week08.HomePractice;

public class MotFahrzeug extends Fahrzeug {

    private double powerInKW;

    public MotFahrzeug(String id, String producer, double powerInKW) {
        super(id, producer);
        this.powerInKW = powerInKW;
    }

}
