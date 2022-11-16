package stefan.week08.CarV2;


import java.util.ArrayList;
import java.util.List;

public class CarV2 {
    private String hersteller;
    private String modell;

    private Engine engine;
    private int gewicht;
    private Tank tank;
    private double tankinhaltUebrig;
    private RepairStation repairStation;

    public CarV2(String hersteller, String modell, int gewicht, int kw, int tankinhalt) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.engine = new Engine(kw);
        tank = new Tank(tankinhalt);
        this.gewicht = gewicht;
        this.tankinhaltUebrig = tankinhalt;
        repairStation = new RepairStation(kw);
    }


    private int calculateMaxKmToDrive() {
        double litersPerKM = calculateLitersPer100KM() / 100;
        return (int) (tank.getTankinalt() / litersPerKM);

    }

    public double calculateLitersPer100KM() {
        return gewicht / 100.00 + engine.getLeistung() / 15.00;

    }

    public int drive(int kmToDrive) {

        int maxKilometersToDrive = calculateMaxKmToDrive();

        int acutalDrivenKM;
        if (maxKilometersToDrive > kmToDrive) {
            acutalDrivenKM = kmToDrive;

        } else {
            acutalDrivenKM = maxKilometersToDrive;
        }

        double consumedFuel = calculateLitersPer100KM() / 100 * acutalDrivenKM;

        tankinhaltUebrig = tankinhaltUebrig - consumedFuel;


        if (tankinhaltUebrig < 1) {
            tankinhaltUebrig = 0;
        }

        return acutalDrivenKM;

    }

    public void fillup() {

        tankinhaltUebrig = tank.getTankinalt();

        System.out.println(hersteller + " Tankt " + tankinhaltUebrig + "l");
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }


    public int getGewicht() {
        return gewicht;
    }

    public Tank getTank() {
        return tank;
    }

    public double getTankinhaltUebrig() {
        return tankinhaltUebrig;
    }

    public Engine getEngine() {

        return engine;
    }

    public void repairCar() {
repairStation=new RepairStation(100);
    }
}








