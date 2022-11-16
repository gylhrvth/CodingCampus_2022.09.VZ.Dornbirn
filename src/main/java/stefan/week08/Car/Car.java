package stefan.week08.Car;

public class Car {
    private String hersteller;
    private String modell;
    private String antriebsart;
    private int tankinhalt;
    private double tankinhaltUebrig;
    private int gewicht;
    private int kw;


    public Car(String hersteller, String modell, String antriebsart, int tankinhalt, int gewicht, int kw) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.antriebsart = antriebsart;
        this.tankinhalt = tankinhalt;
        this.gewicht = gewicht;
        this.tankinhaltUebrig = tankinhalt;
        this.kw = kw;
    }


    public double calculateLitersPer100KM() {
        return gewicht / 1000.0 + kw / 15.0;
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getTankinhaltUebrig() {
        return tankinhaltUebrig;
    }

    public String getModell() {
        return modell;
    }

    private int calculateMaxKmToDrive() {
        double litersPerKM = calculateLitersPer100KM() / 100;
        return (int) (tankinhaltUebrig / litersPerKM);
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

        //Verdunstet
        if (tankinhaltUebrig < 1) {
            tankinhaltUebrig = 0 ;
        }
        return acutalDrivenKM;
    }


    public String getAntriebsart() {
        return antriebsart;
    }

    public void fillUp() {

        tankinhaltUebrig = tankinhalt;

        System.out.println(hersteller+" Tankt "+tankinhaltUebrig+"l "+antriebsart);

    }

}
