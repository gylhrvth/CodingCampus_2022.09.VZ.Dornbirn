package patric.week08.CarSimulation;

public class Car {

    public String hersteller;
    public String model;
    public int kW;
    public int tankinhalt;
    public String antriebsart;
    public int gewicht;
    private int aktuellerTankFuellstand;

    public Car(String hersteller, String model, int kW, int tankinhalt, String antriebsart, int gewicht) {
        this.hersteller = hersteller;
        this.model = model;
        this.kW = kW;
        this.tankinhalt = tankinhalt;
        this.antriebsart = antriebsart;
        this.gewicht = gewicht;
        this.aktuellerTankFuellstand = tankinhalt;
    }

    private double fuelUsagePer100KM() {
        return gewicht * 0.005 + kW * 0.025;
    }

    public int getAktuellerTankFuellstand() {
        return aktuellerTankFuellstand;
    }

    public String getModel() {
        return model;
    }

    public int drive(int km) {
        double maxDistanceKM = aktuellerTankFuellstand / fuelUsagePer100KM() * 100;

        int drivenKM;
        if (maxDistanceKM >= km) {
            drivenKM = km;
        } else {
            drivenKM = (int) maxDistanceKM;
        }

        double consumptionForDrivenKM = (fuelUsagePer100KM() / 100) * drivenKM;
        aktuellerTankFuellstand -= consumptionForDrivenKM;
        return drivenKM;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Hersteller='" + hersteller + '\'' +
                ", Model='" + model + '\'' +
                ", kW=" + kW +
                ", Tankinhalt=" + tankinhalt +
                ", Antriebsart='" + antriebsart + '\'' +
                ", Gewicht=" + gewicht +
                '}';
    }

    public String getHersteller() {
        return hersteller;
    }

    public void refill() {
     aktuellerTankFuellstand = tankinhalt;
    }
}
