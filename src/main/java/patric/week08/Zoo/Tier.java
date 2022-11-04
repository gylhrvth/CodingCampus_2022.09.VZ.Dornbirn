package patric.week08.Zoo;

public class Tier {

    private String name;
    private String gattung;

    private Futter futter;
    private double amountOfFutter;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    public void setFutter(Futter futter, double amountOfFutter) {
        this.futter = futter;
        this.amountOfFutter = amountOfFutter;
    }

    public double getAmountOfFutter() {
        return amountOfFutter;
    }

    public Futter getFutterToTier() {
        return futter;
    }

    @Override
    public String toString() {
        {
            return name + ", " + gattung + " Futter: " + futter + " Futtermenge: " + amountOfFutter + "\n";
        }
    }


}
