package viktor.week11;

import java.math.BigDecimal;

public class Transaktion {

    private int transID;
    private int kontoKontoIDfkQuelle;
    private int kontoKontoIDfkZiel;
    private BigDecimal betrag;

    public Transaktion(int transID, int kontoKontoIDfkQuelle, int kontoKontoIDfkZiel, BigDecimal betrag){
        this.transID = transID;
        this.kontoKontoIDfkQuelle = kontoKontoIDfkQuelle;
        this.kontoKontoIDfkZiel = kontoKontoIDfkZiel;
        this.betrag = betrag;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public int getKontoKontoIDfkQuelle() {
        return kontoKontoIDfkQuelle;
    }

    public void setKontoKontoIDfkQuelle(int kontoKontoIDfkQuelle) {
        this.kontoKontoIDfkQuelle = kontoKontoIDfkQuelle;
    }

    public int getKontoKontoIDfkZiel() {
        return kontoKontoIDfkZiel;
    }

    public void setKontoKontoIDfkZiel(int kontoKontoIDfkZiel) {
        this.kontoKontoIDfkZiel = kontoKontoIDfkZiel;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }

    public void setBetrag(BigDecimal betrag) {
        this.betrag = betrag;
    }
}
