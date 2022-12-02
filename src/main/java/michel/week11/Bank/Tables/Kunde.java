package michel.week11.Bank.Tables;

import michel.week11.Bank.DatabaseManager;

import java.sql.SQLException;


public class Kunde {
    private String vorname;
    private String nachname;
    private Integer kundennummer;
    private String telefonnummer;

    public Kunde(Integer kundennummer, String vorname, String nachname, String telefonnummer){
        this.vorname = vorname;
        this.nachname = nachname;
        this.kundennummer = kundennummer;
        this.telefonnummer = telefonnummer;
        try {
            DatabaseManager.getInstance().insertKunde(this);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Integer getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(Integer kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kundennummer=" + kundennummer +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }
}
