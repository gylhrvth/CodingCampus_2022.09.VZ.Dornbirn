package milan.week08.zoo;


public class Tier {
    private static int lastId = 1;

    private int id;
    private String name;
    private String gattung;
    private Futter nahrung;
    private double menge;

    public Tier(String name, String gattung) {
        id = lastId;
        ++lastId;
        this.name = name;
        this.gattung = gattung;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public void setNahrung(Futter nahrung) {
        this.nahrung = nahrung;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Futter getNahrung() {
        return nahrung;
    }

    public double getMenge() {
        return menge;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public int getId() {
        return id;
    }
}
