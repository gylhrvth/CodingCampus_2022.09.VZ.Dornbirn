package lukas.week10.uebungsfirma.model;

public class Mitarbeiter {
    private int svn;
    private String name;
    private int abteilungAbteilungsnummerFk;
    private int vorgesetzterFk;

    public Mitarbeiter(String name, int abteilungAbteilungsnummerFk, int vorgesetzterFk) {
        this.name = name;
        this.abteilungAbteilungsnummerFk = abteilungAbteilungsnummerFk;
        this.vorgesetzterFk = vorgesetzterFk;
    }

    public int getSvn() {
        return svn;
    }

    public void setSvn(int svn) {
        this.svn = svn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbteilungAbteilungsnummerFk() {
        return abteilungAbteilungsnummerFk;
    }

    public void setAbteilungAbteilungsnummerFk(int abteilungAbteilungsnummerFk) {
        this.abteilungAbteilungsnummerFk = abteilungAbteilungsnummerFk;
    }

    public int getVorgesetzterFk() {
        return vorgesetzterFk;
    }

    public void setVorgesetzterFk(int vorgesetzterFk) {
        this.vorgesetzterFk = vorgesetzterFk;
    }
}
