package milan.week11.bank.model;

public class Kunde {


    private Integer kundenNummer;
    private String name;

    public Kunde(String name) {
        this.kundenNummer = null;
        this.name = name;
    }
    public Kunde(int kundenNummer, String name) {
        this.kundenNummer = kundenNummer;
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " " +
                getKundenNummer();
    }

    public Integer getKundenNummer() {
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
