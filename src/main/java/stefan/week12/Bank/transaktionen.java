package stefan.week12.Bank;

public class transaktionen {

private String ueberweisungGrund;
private int betrag;
private int  quelle;
private int ziel;

    public transaktionen(String ueberweisungGrund, int betrag, int quelle, int ziel) {
        this.ueberweisungGrund = ueberweisungGrund;
        this.betrag = betrag;
        this.quelle = quelle;
        this.ziel = ziel;
    }


    public String getUeberweisungGrund() {
        return ueberweisungGrund;
    }

    public void setUeberweisungGrund(String ueberweisungGrund) {
        this.ueberweisungGrund = ueberweisungGrund;
    }

    public int getBetrag() {
        return betrag;
    }

    public void setBetrag(int betrag) {
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
