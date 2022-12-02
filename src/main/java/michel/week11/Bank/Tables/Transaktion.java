package michel.week11.Bank.Tables;

import java.math.BigDecimal;
import java.sql.Date;

public class Transaktion {
    private int transaktionsNummer;
    private int betrag;
    private Date datum;
    private int quellKontoNummer;
    private int zielKontoNummer;

    public Transaktion(int transaktionsNummer, int betrag, Date datum, int quellKontoNummer, int zielKontoNummer) {
        this.transaktionsNummer = transaktionsNummer;
        this.betrag = betrag;
        this.datum = datum;
        this.quellKontoNummer = quellKontoNummer;
        this.zielKontoNummer = zielKontoNummer;
    }

    public int getTransaktionsNummer(){
        return transaktionsNummer;
    }

    public void setTransaktionsNummer(int transaktionsNummer) {
        this.transaktionsNummer = transaktionsNummer;
    }

    public int getBetrag() {
        return betrag;
    }

    public void setBetrag(int betrag) {
        this.betrag = betrag;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getQuellKontoNummer() {
        return quellKontoNummer;
    }

    public void setQuellKontoNummer(int quellKontoNummer) {
        this.quellKontoNummer = quellKontoNummer;
    }

    public int getZielKontoNummer() {
        return zielKontoNummer;
    }

    public void setZielKontoNummer(int zielKontoNummer) {
        this.zielKontoNummer = zielKontoNummer;
    }
}
