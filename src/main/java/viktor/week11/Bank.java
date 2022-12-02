package viktor.week11;

public class Bank {

    private int bankid;
    private String name;
    private String standort;

    public Bank(int bankid, String name, String standort){
        this.bankid = bankid;
        this.name = name;
        this.standort = standort;
    }

    public int getBankid() {
        return bankid;
    }

    public void setBankid(int bankid) {
        this.bankid = bankid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
}
