package michel.week11.Bank.Tables;

import java.math.BigDecimal;

public class Konto {
    private String besitzer;
    private int kontonummer;
    private int kontostand;

    public Konto(String besitzer, int kontonummer, int kontostand) {
        this.besitzer = besitzer;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}
