package stefan.week08.zoo;

public class Tier {

    private String name;
    private String gattung;
    private Futter futter;
    private double futtermenge;
    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    public void setFutter(Futter futter, double futtermenge) {
        this.futter = futter;
        this.futtermenge = futtermenge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGattung() {
        return gattung;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    public Futter getFutter() {
        return futter;
    }

    public double getFuttermenge() {
        return futtermenge;
    }


}
