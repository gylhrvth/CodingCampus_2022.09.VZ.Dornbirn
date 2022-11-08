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

    public Tier(String name, String gattung, int biss) {
        this.name = name;
        this.gattung = gattung;
        maxGesundheit = 100;
        this.biss = biss;
        gesundheit = maxGesundheit;
    }

    public void attack(Tier opfer) {
        int wahrscheinlichkeit = ran.nextInt(100);
        if (gesundheit > 0 && wahrscheinlichkeit < 40) {
            opfer.setGesundheit(opfer.getGesundheit() - biss);
            System.out.println(getName() + " beisst " + opfer.getName() + " und zieht " + opfer.getName() + " " + biss + " Gesundheit ab!");
        }
    }

    public double getRelativeGesundheit() {
        return 100.0 / getMaxGesundheit() * getGesundheit();
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

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public void heal() {
        int before = gesundheit;
        gesundheit += (0.3 + ran.nextDouble() * 0.7) * maxGesundheit;
        if (gesundheit > maxGesundheit) {
            gesundheit = maxGesundheit;
        }
        int diff = gesundheit - before;
        System.out.println("und die Gesundheit steigt um " + diff + " auf " + gesundheit + ".");
    }
}
