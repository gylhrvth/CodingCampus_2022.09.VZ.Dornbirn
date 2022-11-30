package batuhan.week11.bank;

public class TAN {

    private int transaktionsnummer;
    private int zeit;
    private int zielKontoIbanFk;

    public TAN(int transaktionsnummer, int zeit, int zielKontoIbanFk) {

    }

    public int getTransaktionsnummer() {
        return transaktionsnummer;
    }

    public void setTransaktionsnummer(int transaktionsnummer) {
        this.transaktionsnummer = transaktionsnummer;
    }

    public int getZeit() {
        return zeit;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }

    public int getZielKontoIbanFk() {
        return zielKontoIbanFk;
    }

    public void setZielKontoIbanFk(int zielKontoIbanFk) {
        this.zielKontoIbanFk = zielKontoIbanFk;
    }





}
