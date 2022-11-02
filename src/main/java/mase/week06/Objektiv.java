package mase.week06;

public class Objektiv {
    public int brennweitemin;
    public int brennweitemax;
    public String model;
    public String hersteller;

    public Objektiv(int brennweitemin, int brennweitemax, String model, String hersteller) {
        this.brennweitemin = brennweitemin;
        this.brennweitemax = brennweitemax;
        this.model = model;
        this.hersteller = hersteller;
    }

    public String toString() {
        return "Die maximale Brennweite des Objektives beträgt : " + brennweitemax + "\n"
                + "Die minimale Brennweite beträgt : " + brennweitemin + "\n"
                + "Das Model heißt : " + model + "\n"
                + "Der Hersteller ist : " + hersteller;
    }
}
