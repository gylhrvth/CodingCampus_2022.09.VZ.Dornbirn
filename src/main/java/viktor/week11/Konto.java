package viktor.week11;

import java.math.BigDecimal;

public class Konto {

    private int kontoid;
    private BigDecimal kontostand;
    private String ibanNr;

    public Konto(int kontoid, BigDecimal kontostand, String ibannr){

        this.kontoid = kontoid;
        this.kontostand = kontostand;
        this.ibanNr = ibannr;
    }

    public int getKontoid() {
        return kontoid;
    }

    public void setKontoid(int kontoid) {
        this.kontoid = kontoid;
    }

    public BigDecimal getKontostand() {
        return kontostand;
    }

    public void setKontostand(BigDecimal kontostand) {
        this.kontostand = kontostand;
    }

    public String getIbanNr() {
        return ibanNr;
    }

    public void setIbanNr(String ibanNr) {
        this.ibanNr = ibanNr;
    }
}
