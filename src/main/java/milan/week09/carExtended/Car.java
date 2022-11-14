package milan.week09.carExtended;


public abstract class Car {

    private String hersteller;
    private String modell;

    protected double gewicht;
    protected Motor motor;
    private Tank tank;


    public Car(String modell, String hersteller, double gewicht) {
        this(
                new Motor("Dummy Motor", 75),
                modell,
                hersteller,
                gewicht
        );
    }
    public Car(String motorType, int leistung, String modell, String hersteller, double gewicht) {
        this(
                new Motor(motorType, leistung),
                modell,
                hersteller,
                gewicht
        );
    }

    public Car(Motor motor, String modell, String hersteller, double gewicht) {
        this.motor = motor;
        this.modell = modell;
        this.hersteller = hersteller;
        this.gewicht = gewicht;
        tank = new FuelTank(" ");
    }


    public void carSimulation(int kilometerZumZiel) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nDer " + getModell() + " fährt los!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int kmSumme = 0;
        while (kmSumme < kilometerZumZiel) {
            int kmProEttape = drive(kilometerZumZiel);
            if (kmProEttape < kilometerZumZiel) {
                kmSumme += kmProEttape;
                if (kmSumme < kilometerZumZiel) {
                    System.out.println("Nach " + kmProEttape + " km war der " + getSpeicherName() + " leer. (Zurückgelegte Gesamtstrecke: " + kmSumme + " km).");
                    addKmToKmStand(kmProEttape);
                    if (!getStatus()) {
                        break;
                    }
                    refuelCar();
                } else {
                    addKmToKmStand(kilometerZumZiel - (kmSumme - kmProEttape));
                    System.out.println("Nach " + (kilometerZumZiel - (kmSumme - kmProEttape)) + " km wurde das Ziel erreicht. (Zurückgelegte Gesamtstrecke: " + kilometerZumZiel + " km).\n");
                    if (!getStatus()) {
                        break;
                    }
                }
            } else {
                System.out.println("Nach " + kilometerZumZiel + " km wurde das Ziel erreicht.\n");
                break;
            }

        }
    }

    public void refuelCar() {
        tank.refuelTank();
    }

    public int drive(int kilometer) {
        motor.setStatusRunning(true);
        double neededFuel = (calculateVerbrauch() / 100 * kilometer);
        if (neededFuel > getTankinhalt()) {
            double rest = getTankinhalt();
            setTankinhalt(0);
            motor.setStatusRunning(false);
            return (int) ((rest / calculateVerbrauch()) * 100);
        }
        setTankinhalt(getTankinhalt() - ((kilometer * calculateVerbrauch()) / 100));
        addKmToKmStand(kilometer);
        motor.setStatusRunning(false);
        return kilometer;
    }

    public void addKmToKmStand(int kilometer) {
        motor.addKmToKmStand(kilometer);
    }

    public double calculateVerbrauch() {
        return (motor.getkWLeistung() / gewicht / 7.5);
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public double getTankinhalt() {
        return tank.getTankinhalt();
    }

    public void getTankinhaltText() {
        tank.getTankinhaltText();
    }

    public double getMaxTankinhalt() {
        return tank.getMaxTankinhalt();
    }

    public boolean getStatus() {
        return motor.getStatusNotDefect();
    }

    public void getMotorStatusText() {
        motor.getMotorStatusText();
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
        tank.setTankinhalt(tankinhalt);
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public String getMotorName() {
        return motor.getModel();
    }

    protected Motor getMotor() {
        return motor;
    }

    public String getSpeicherName() {
        return tank.getSpeicherName();
    }
}
