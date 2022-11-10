package patric.week08.Zoo;


import java.util.Map;

public class Tier {

    private String name;
    private String gattung;
    private int gesundheit;
    private int maxGesundheit;
    private int biss;

    private Futter futter;
    private double amountOfFutter;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        this.gesundheit = gesundheit;
        this.biss = biss;
        this.maxGesundheit = maxGesundheit;
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
        return name + ", " + gattung + " Futter: " + futter + " Futtermenge: " + amountOfFutter + "\n";
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

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public int getBiss() {
        return biss;
    }

    public void biss(Tier otherTier) {
        gesundheit -= otherTier.biss;
        if (gesundheit <= 0) {
            System.out.println("R.I.P. " + name + ". " + otherTier.name + " hat " + name + " tot gebissen und wird entfernt");
        }
    }

    public void calculateFoodMap(Map<Futter, Double> futterAmountMap){
        if (futter == null){
            System.out.println("!!! " + name + " wird sich verhungern. Kein Futter wurde zugewiesen.");
            return;
        }
        Double currentSumOfTierFutter = futterAmountMap.get(futter);
        if (currentSumOfTierFutter == null) {
            currentSumOfTierFutter = amountOfFutter;
        } else {
            currentSumOfTierFutter += amountOfFutter;
        }
        futterAmountMap.put(futter, currentSumOfTierFutter);
    }

    public double calculateFoodPricePerDay() {
        if (futter == null){
            System.out.println("!!! " + name + " wird sich verhungern. Kein Futter wurde zugewiesen.");
            return 0;
        }
        return futter.getEinheitPreis() * amountOfFutter;
    }
}
