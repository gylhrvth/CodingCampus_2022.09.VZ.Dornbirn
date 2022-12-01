package batuhan.week11.bank;


public class Kunde {

    private int kontonummer;
    private String kontoInhaber;
    private int geburtsdatum;






    public Kunde(int kontonummer, String kontoInhaber, int geburtsdatum) {

        this.geburtsdatum = geburtsdatum;
        this.kontonummer = kontonummer;
        this.kontoInhaber = kontoInhaber;

    }


    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }



    public int getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(int geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }
}
