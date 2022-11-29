package lukas.week10.uebungsfirma.model;

public class Abteilung {
    private int abteilungsNummer;
    private String name;
    private String stockwerk;

    public Abteilung(int abteilungsNummer, String name, String stockwerk) {
        this.abteilungsNummer = abteilungsNummer;
        this.name = name;
        this.stockwerk = stockwerk;
    }

    public int getAbteilungsNummer() {
        return abteilungsNummer;
    }

    public void setAbteilungsNummer(int abteilungsNummer) {
        this.abteilungsNummer = abteilungsNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStockwerk() {
        return stockwerk;
    }

    public void setStockwerk(String stockwerk) {
        this.stockwerk = stockwerk;
    }
}
