package viktor.week08;

public class Tier {

    private String name;
    private String gattung;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    @Override
    public String toString() {
        return name + ", " + gattung + "\n";
    }

}
