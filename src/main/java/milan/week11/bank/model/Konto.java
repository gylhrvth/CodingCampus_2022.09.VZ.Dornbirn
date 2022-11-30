package milan.week11.bank.model;

public class Konto {


    private int kontoNummer;
    private double kontostand;

    public Konto(int kontoNummer, double kontostand) {
        this.kontoNummer = kontoNummer;
        this.kontostand = kontostand;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
