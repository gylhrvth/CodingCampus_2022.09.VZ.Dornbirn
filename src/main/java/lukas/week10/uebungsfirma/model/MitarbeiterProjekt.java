package lukas.week10.uebungsfirma.model;

import java.sql.Date;

public class MitarbeiterProjekt {
    private int mitarbeiterSvnFk;
    private int projektProjektNameFk;
    private Date von;
    private Date bis;

    public MitarbeiterProjekt(int mitarbeiterSvnFk, int projektProjektNameFk, Date von, Date bis) {
        this.mitarbeiterSvnFk = mitarbeiterSvnFk;
        this.projektProjektNameFk = projektProjektNameFk;
        this.von = von;
        this.bis = bis;
    }

    public int getMitarbeiterSvnFk() {
        return mitarbeiterSvnFk;
    }

    public void setMitarbeiterSvnFk(int mitarbeiterSvnFk) {
        this.mitarbeiterSvnFk = mitarbeiterSvnFk;
    }

    public int getProjektProjektNameFk() {
        return projektProjektNameFk;
    }

    public void setProjektProjektNameFk(int projektProjektNameFk) {
        this.projektProjektNameFk = projektProjektNameFk;
    }

    public Date getVon() {
        return von;
    }

    public void setVon(Date von) {
        this.von = von;
    }

    public Date getBis() {
        return bis;
    }

    public void setBis(Date bis) {
        this.bis = bis;
    }
}
