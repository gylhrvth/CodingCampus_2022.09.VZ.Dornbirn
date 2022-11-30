package batuhan.week11.bank;


public class Kunde {

    private int kontonummer;
    private String kontoInhaber;
    private int geburtsdatum;
    private String staatangehoerigkeit;
    private int telefonnummer;





    public Kunde(int kontonummer, String kontoInhaber, int geburtsdatum, String staatangehoerigkeit, int telefonnummer) {

        this.geburtsdatum = geburtsdatum;
        this.kontonummer = kontonummer;
        this.kontoInhaber = kontoInhaber;
        this.staatangehoerigkeit = staatangehoerigkeit;
        this.telefonnummer = telefonnummer;
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

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getStaatangehoerigkeit() {
        return staatangehoerigkeit;
    }

    public void setStaatangehoerigkeit(String staatangehoerigkeit) {
        this.staatangehoerigkeit = staatangehoerigkeit;
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
