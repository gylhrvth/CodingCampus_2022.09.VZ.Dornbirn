package viktor.week11;

public class Rolle {

    private int kundeKundenidfk;
    private int kontoKontoidfk;
    public enum Rules {B,ZB}
    public Rules rolle;

    public Rolle(int kundeKundenidfk, int kontoKontoidfk, Rules rolle){
        this.kundeKundenidfk = kundeKundenidfk;
        this.kontoKontoidfk = kontoKontoidfk;
        this.rolle = rolle;
    }

    public int getKundeKundenidfk() {
        return kundeKundenidfk;
    }

    public void setKundeKundenidfk(int kundeKundenidfk) {
        this.kundeKundenidfk = kundeKundenidfk;
    }

    public int getKontoKontoidfk() {
        return kontoKontoidfk;
    }

    public void setKontoKontoidfk(int kontoKontoidfk) {
        this.kontoKontoidfk = kontoKontoidfk;
    }

    public Rules getRolle() {
        return rolle;
    }

    public void setRolle(Rules rolle) {
        this.rolle = rolle;
    }
}
