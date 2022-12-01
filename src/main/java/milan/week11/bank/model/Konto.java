package milan.week11.bank.model;

import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Vector;

public class Konto {


    private int kontoNummer;
    private double kontostand;
    private Vector<Kunde> inhaber = new Vector<>();

    public Konto(Kunde kunde, int kontoNummer, double kontostand) {
        this.kontoNummer = kontoNummer;
        this.kontostand = kontostand;

        inhaber.add(kunde);
        kunde.addKonto(this);

        try {
            DatabaseManager.getInstance().insertKonto(this);
            DatabaseManager.getInstance().insertKundeKontoVerbindung(kunde, this);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

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

    public void addInhaber(Kunde k) {
        if (!inhaber.contains(k)) {
            inhaber.add(k);
            try {
                DatabaseManager.getInstance().insertKundeKontoVerbindung(k, this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void removeInhaberFromKonto(Kunde kunde) {
        inhaber.remove(kunde);
        try {
            DatabaseManager.getInstance().deleteKundenKontoVerbindung(kunde, this);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (inhaber.size() == 0) {
            try {
                DatabaseManager.getInstance().deleteKonto(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
