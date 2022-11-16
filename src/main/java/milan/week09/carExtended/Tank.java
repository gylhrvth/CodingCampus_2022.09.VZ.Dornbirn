package milan.week09.carExtended;

import java.util.Random;

public abstract class Tank {
    public static Random ran = new Random();

    private String model;
    private String hersteller;
    private double tankinhalt;
    private double maxTankinhalt;

    public Tank(String model) {
        this.model = model;
        hersteller = " ";
        maxTankinhalt = 60;
        tankinhalt = maxTankinhalt;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }
    public void getTankinhaltText() {
        System.out.println("Der Tankinhalt beträgt: " + getTankinhalt() + " Liter.");
    }

    public void refuelTank(){
        setTankinhalt(getMaxTankinhalt() - ran.nextDouble(getMaxTankinhalt() / 10));
        System.out.printf("Es wurden %.2f Liter getankt.\n", getTankinhalt());
    }
    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public void setMaxTankinhalt(double maxTankinhalt) {
        this.maxTankinhalt = maxTankinhalt;
    }

    public abstract String getSpeicherName();
}
