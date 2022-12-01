package milan.week11.bank.model;

import java.sql.SQLException;
import java.util.Vector;

public class Kunde {


    private Integer kundenNummer;
    private String name;
    private Vector<Konto> kontos = new Vector<>();

    public Kunde(String name) {
        this.kundenNummer = null;
        this.name = name;

        try {
            DatabaseManager.getInstance().insertKunde(this);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public Kunde(int kundenNummer, String name) {
        this.kundenNummer = kundenNummer;
        this.name = name;
    }

    @Override
    public String toString() {
        return getKundenNummer() + " " +
                getName();
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

    public void addKonto(Konto k) {
        if (!kontos.contains(k)) {
            kontos.add(k);
            k.addInhaber(this);
        }
    }
    public void deleteKunde() {
        for (Konto x : kontos) {
            x.removeInhaberFromKonto(this);
        }
        try {
            DatabaseManager.getInstance().deleteKunde(this);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
