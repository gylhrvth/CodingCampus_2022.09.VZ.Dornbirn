package viktor.week08.Car;

public class Car {

    private String hersteller;
    private String modell;
    private int ps;
    private double tankInhalt;
    private double maxTankInhalt;

    public enum Antriebsart {BENZIN, DIESEL, GAS, ELECTRICITY}

    private double gewicht;


    public Car(String modell, double tankInhalt, int ps, Antriebsart art, double gewicht) {
        this.modell = modell;
        this.maxTankInhalt = tankInhalt;
        this.tankInhalt = tankInhalt;
        this.ps = ps;
        this.gewicht = gewicht;
    }

    public String getModell() {
        return modell;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int drive(int km) {
        double consumptionPerKM = (gewicht * 0.005 + ps * 0.025) / 100.0;
        double maxDistance = tankInhalt / consumptionPerKM;
        int currentState;

        if (maxDistance >= km) {
            currentState = km;
        } else {
            currentState = (int) maxDistance;
        }

        double consumptionForDrive = consumptionPerKM * currentState;
        tankInhalt -= consumptionForDrive;

        if (tankInhalt > 0) {
            System.out.println("Tankinhalt : " + tankInhalt);
        } else {
            System.out.println("Dein Tank ist leer!");
        }

        return currentState;

    }

    public void refill() {
        this.tankInhalt = maxTankInhalt;
    }
}
