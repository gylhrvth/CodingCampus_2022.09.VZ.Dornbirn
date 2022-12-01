package mase.week11.Bank;

public class Konto {
    private int kontonr;
    private double kontostand;



    public Konto(int kontonr, double kontostand) {
        this.kontonr = kontonr;
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontonr=" + kontonr +
                ", kontostand=" + kontostand +
                '}';
    }
}
