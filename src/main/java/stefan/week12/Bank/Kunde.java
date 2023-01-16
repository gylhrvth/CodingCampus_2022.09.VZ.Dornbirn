package stefan.week12.Bank;

public class Kunde {


private String kundenname;
private Integer kundenId = null;

    public Kunde(String kundenname) {
        this.kundenname = kundenname;

    }

    public String getKundenname() {
        return kundenname;
    }

    public void setKundenname(String kundenname) {
        this.kundenname = kundenname;
    }

    public Integer getKundenId() {
        return kundenId;
    }

    public void setKundenId(Integer kundenId) {
        this.kundenId = kundenId;
    }

    @Override
    public String toString() {
        return "Kunde" +
                "kundenname " + kundenname +
                "kundenId " + kundenId ;
    }
}
