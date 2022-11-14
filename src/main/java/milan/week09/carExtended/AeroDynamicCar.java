package milan.week09.carExtended;

public class AeroDynamicCar extends Car {


    public AeroDynamicCar(String modell, String hersteller, double gewicht) {
        super(modell, hersteller, gewicht);


    }

    @Override
    public double calculateVerbrauch() {
        return ((motor.getkWLeistung() / gewicht / 7.5) / 2);
    }

//    Alternative mit (Car -> get.Motor()) Methode "protected"!!!
//    @Override
//    public double calculateVerbrauch() {
//        return ((getMotor().getkWLeistung() / gewicht / 7.5) / 2);
//    }

}
