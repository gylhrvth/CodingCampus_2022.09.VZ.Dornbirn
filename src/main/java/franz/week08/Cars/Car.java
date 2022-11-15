package franz.week08.Cars;

public class Car {
    private String hersteller;
    private String model;
    private int kw;
    private float tankinhalt;
    private String kraftstoff;
    private float gewicht;
    private int aktuellerTankFuellstand;


    public Car(String hersteller, String model, int kw, int tankinhalt, String kraftstoff, float gewicht) {
        this.hersteller = hersteller;
        this.model = model;
        this.kw = kw;
        this.tankinhalt = tankinhalt;
        this.kraftstoff = kraftstoff;
        this.gewicht = gewicht;
        this.aktuellerTankFuellstand = tankinhalt;

    }

    public double fuelUsagePer100KM() {
        return gewicht * 0.005 + kw * 0.025;
    }

    public int getAktuellerTankFuellstand() {
        return aktuellerTankFuellstand;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public int drive(int kilometer) {
        double maxDistanceKilometer = aktuellerTankFuellstand / fuelUsagePer100KM() * 100;

        int drivenKM;
        if (maxDistanceKilometer >= kilometer) {
            drivenKM = kilometer;
        } else {
            drivenKM = (int) maxDistanceKilometer;
        }
        double consumptionForDrivenKM = (fuelUsagePer100KM() / 100) * drivenKM;
        aktuellerTankFuellstand -= consumptionForDrivenKM;
        return drivenKM;


    }

    public String toString() {
        return "Hersteller: " + hersteller +
                "Model: " + model +
                "Leistung: " + kw +
                "Tankinhalt: " + tankinhalt +
                "Kraftstoff:" + kraftstoff +
                "Gewicht: " + gewicht;
    }

}

