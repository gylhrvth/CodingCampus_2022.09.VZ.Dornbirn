package milan.week11.bank.model;

import java.sql.Date;

public class Transaktion {

    private int transaktionsnummer;
    private Date datum;
    private String referenz;
    private double betrag;
    private int quelle;
    private int ziel;

    public Transaktion(int transaktionsnummer, Date datum, String referenz, double betrag, int quelle, int ziel) {
        this.transaktionsnummer = transaktionsnummer;
        this.datum = datum;
        this.referenz = referenz;
        this.betrag = betrag;
        this.quelle = quelle;
        this.ziel = ziel;
    }

    public int getTransaktionsnummer() {
        return transaktionsnummer;
    }

    public void setTransaktionsnummer(int transaktionsnummer) {
        this.transaktionsnummer = transaktionsnummer;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getReferenz() {
        return referenz;
    }

    public void setReferenz(String referenz) {
        this.referenz = referenz;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public int getQuelle() {
        return quelle;
    }

    public void setQuelle(int quelle) {
        this.quelle = quelle;
    }

    public int getZiel() {
        return ziel;
    }

    public void setZiel(int ziel) {
        this.ziel = ziel;
    }
}
