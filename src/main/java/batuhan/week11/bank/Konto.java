package batuhan.week11.bank;

public class Konto {


    private int iban;
    private int kontonummerFK;
    private double kontoStand;
    private int transaktionsnummerFK;


    public Konto(int iban, int kontonummerFK, double kontoStand, int transaktionsnummerFK) {
        this.kontoStand = kontoStand;
        this.kontonummerFK = kontonummerFK;
        this.iban = iban;
        this.transaktionsnummerFK = transaktionsnummerFK;
    }


    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int getKontonummerFK() {
        return kontonummerFK;
    }

    public void setKontonummerFK(int kontonummerFK) {
        this.kontonummerFK = kontonummerFK;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public int getTransaktionsnummerFK() {
        return transaktionsnummerFK;
    }

    public void setTransaktionsnummerFK(int transaktionsnummerFK) {
        this.transaktionsnummerFK = transaktionsnummerFK;
    }
}
