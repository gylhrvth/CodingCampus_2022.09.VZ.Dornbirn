package lukas.week10.uebungsfirma.model;

import java.util.Date;

public class Projekt {
    private String projektName;
    private Date startDatum;
    private Date endDatum;

    public Projekt(String projektName, Date startDatum, Date endDatum) {
        this.projektName = projektName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
    }

    public String getProjektName() {
        return projektName;
    }

    public void setProjektName(String projektName) {
        this.projektName = projektName;
    }

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
    }

    public Date getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(Date endDatum) {
        this.endDatum = endDatum;
    }
}
