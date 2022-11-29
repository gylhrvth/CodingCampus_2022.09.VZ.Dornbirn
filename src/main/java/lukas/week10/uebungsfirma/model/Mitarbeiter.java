package lukas.week10.uebungsfirma.model;

public class Mitarbeiter {
    private String svn;
    private String name;
    private int abteilungAbteilungsnummerFk;
    private String vorgesetzterFk;

    public Mitarbeiter(String svn, String name, int abteilungAbteilungsnummerFk, String vorgesetzterFk) {
        this.svn = svn;
        this.name = name;
        this.abteilungAbteilungsnummerFk = abteilungAbteilungsnummerFk;
        this.vorgesetzterFk = vorgesetzterFk;
    }

    public String getSvn() {
        return svn;
    }

    public void setSvn(String svn) {
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

    public String getVorgesetzterFk() {
        return vorgesetzterFk;
    }

    public void setVorgesetzterFk(String vorgesetzterFk) {
        this.vorgesetzterFk = vorgesetzterFk;
    }
}
