package stefan.week12.Bank;

import java.util.Random;

public class Konten {

private int Kontostand;
private int kontenummer;

    public Konten(int kontostand, int kontenummer) {
        Kontostand = kontostand;
        this.kontenummer = kontenummer;


    }

    public int getKontostand() {
        return Kontostand;
    }

    public void setKontostand(int kontostand) {
        Kontostand = kontostand;
    }

    public int getKontenummer() {
        return kontenummer;
    }

    public void setKontenummer(int kontenummer) {
        this.kontenummer = kontenummer;
    }
}
