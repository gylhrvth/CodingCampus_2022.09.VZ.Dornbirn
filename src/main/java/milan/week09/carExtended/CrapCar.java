package milan.week09.carExtended;

public class CrapCar extends Car{

    public CrapCar(String modell, String hersteller, double gewicht) {
        super(
                new CrapMotor("Crap", 80),
                modell,
                hersteller,
                gewicht);
    }

}
