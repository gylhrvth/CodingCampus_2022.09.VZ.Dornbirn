package viktor.week11;

import java.util.Date;

public class Kunde {

    private int kundenid;
    private String name;
    private Date eintritt;
    private int bankidfk;

    public Kunde(int kundenid, String name, Date eintritt, int bankidfk){
        this.kundenid = kundenid;
        this.name = name;
        this.eintritt = eintritt;
        this.bankidfk = bankidfk;
    }

    public int getKundenid() {
        return kundenid;
    }

    public void setKundenid(int kundenid) {
        this.kundenid = kundenid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEintritt() {
        return eintritt;
    }

    public void setEintritt(Date eintritt) {
        this.eintritt = eintritt;
    }

    public int getBankidfk() {
        return bankidfk;
    }

    public void setBankidfk(int bankidfk) {
        this.bankidfk = bankidfk;
    }
}
