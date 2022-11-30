package milan.week11.bank.model;

public class Kunde {


    private int kundenNummer;
    private String name;

    public Kunde(int kundenNummer, String name) {
        this.kundenNummer = kundenNummer;
        this.name = name;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
