package franz.week08.Zoo;

public class Futter {
    private String futter;
    private int menge;

    private double preis;

    public Futter(String futter, int menge, int preis) {
        this.futter = futter;
        this.menge = menge;
        this.preis = preis;

    }

    public String getFutter() {
        return futter;
    }

    public int getMenge() {
        return menge;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return futter + "," + menge + "," + preis;
    }
}
