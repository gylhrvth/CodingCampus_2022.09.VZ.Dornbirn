package milan.week09.car;

public class Car {

    enum Antriebsart {
        BENZIN,
        DIESEL,
        GAS,
        STROM,
    }

    private String hersteller;
    private String modell;
    private int kWLeistung;
    private double tankinhalt;
    public double gewicht;

    public Car(String modell, String hersteller) {
        this.modell = modell;
        this.hersteller = hersteller;

    }

    public int drive(int kilometer) {
//        if (tankinhalt > 0) {
//
//        }
        return kilometer;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
