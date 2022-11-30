package milan.week11.bank.model;

public class KundeKontoVerbindung {

    private int fk_KontoNummer;
    private int fk_KundenNummer;
    private String rolle;

    public KundeKontoVerbindung(int fk_KontoNummer, int fk_KundenNummer, String rolle) {
        this.fk_KontoNummer = fk_KontoNummer;
        this.fk_KundenNummer = fk_KundenNummer;
        this.rolle = rolle;
    }

    public int getFk_KontoNummer() {
        return fk_KontoNummer;
    }

    public void setFk_KontoNummer(int fk_KontoNummer) {
        this.fk_KontoNummer = fk_KontoNummer;
    }

    public int getFk_KundenNummer() {
        return fk_KundenNummer;
    }

    public void setFk_KundenNummer(int fk_KundenNummer) {
        this.fk_KundenNummer = fk_KundenNummer;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }
}
