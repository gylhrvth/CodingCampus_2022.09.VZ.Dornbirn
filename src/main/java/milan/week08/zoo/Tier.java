package milan.week08.zoo;


import java.util.Random;

public class Tier {

    private static Random ran = new Random();
    private String name;
    private String gattung;
    private Futter nahrung;
    private double menge;
    private int maxGesundheit;
    private int biss;
    private int gesundheit;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        maxGesundheit = 100;
        biss = 15;
        gesundheit = maxGesundheit;
    }

    public int attack() {
        int wahrscheinlichkeit = ran.nextInt(101);
        if (wahrscheinlichkeit > 40) {
            return 0;
        }
        return getBiss();
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

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public int getBiss() {
        return biss;
    }
}
