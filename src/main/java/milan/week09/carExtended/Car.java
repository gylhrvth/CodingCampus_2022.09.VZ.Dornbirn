package milan.week09.carExtended;

import java.util.Random;

public class Car {

    enum Antriebsart {
        BENZIN,
        DIESEL,
        GAS,
        STROM,
    }

    public static Random ran = new Random();

    private String hersteller;
    private String modell;
    private int kWLeistung;
    private double tankinhalt;
    private double maxTankinhalt;
    private double gewicht;
    private Motor motor;
    private Tank tank;

    public Car(String modell, String hersteller, double maxTankinhalt, int kWLeistung, double gewicht) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.maxTankinhalt = maxTankinhalt;
        tankinhalt = maxTankinhalt;
        this.kWLeistung = kWLeistung;
        this.gewicht = gewicht;
        motor = new Motor(" ");

    }

    public void carSimulation(int kilometerZumZiel) {
        int kmSumme = 0;
        while (kmSumme < kilometerZumZiel) {
            int kmProEttape = drive(kilometerZumZiel);
            if (kmProEttape < kilometerZumZiel) {
                kmSumme += kmProEttape;
                if (kmSumme < kilometerZumZiel) {
                    System.out.println("Nach " + kmProEttape + " km war der Tank leer und es wurde nachgedankt. (Zurückgelegte Gesamtstrecke: " + kmSumme + " km).");
                    addKmToKmStand(kmProEttape);
                    if (!getStatus()) {
                        break;
                    }
                    refuelCar();
                } else {
                    addKmToKmStand(kilometerZumZiel - (kmSumme - kmProEttape));
                    System.out.println("Nach " + (kilometerZumZiel - (kmSumme - kmProEttape)) + " km wurde das Ziel erreicht. (Zurückgelegte Gesamtstrecke: " + kilometerZumZiel + " km).");
                    if (!getStatus()) {
                        break;
                    }
                }
            } else {
                System.out.println("Nach " + kilometerZumZiel + " km wurde das Ziel erreicht.");
                break;
            }

        }
    }

    public void refuelCar() {
        setTankinhalt(maxTankinhalt - ran.nextDouble(maxTankinhalt / 10));
        System.out.printf("Es wurden %.2f Liter getankt.\n", tankinhalt);
    }

    public int drive(int kilometer) {

        double neededFuel = (calculateVerbrauch() / 100 * kilometer);
        if (neededFuel > tankinhalt) {
            double rest = tankinhalt;
            setTankinhalt(0);
            return (int) ((rest / calculateVerbrauch()) * 100);
        }
        setTankinhalt(tankinhalt - ((kilometer * calculateVerbrauch()) / 100));
        addKmToKmStand(kilometer);
        return kilometer;
    }

    public void addKmToKmStand(int kilometer) {
        motor.addKmToKmStand(kilometer);
    }

    public double calculateVerbrauch() {
        return ((kWLeistung * 1.1) / (gewicht * 1.1) / 7.5);
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }

    public boolean getStatus() {
        return motor.getStatus();
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getEngineKmStand() {
        return motor.getKmStand();
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public void setMaxTankinhalt(double maxTankinhalt) {
        this.maxTankinhalt = maxTankinhalt;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
