package batuhan.wwek08.car;

public class Car {
    private String manufacturer;
    private String model;
    private int kw;
    private String typeOfDrive;
    private double weight;
    private double tank;
    private double currenttankcontent;


    public Car(String manufacturer, String model, int kw, String typeOfDrive, double weight, double tank) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.tank = tank;
        this.kw = kw;
        this.typeOfDrive = typeOfDrive;
        this.weight = weight;
        this.currenttankcontent = tank;


    }

    public int psleistung() {
        double ps = kw * 1.35962;
        return (int) Math.ceil(ps);
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    private double calculateFuelUsagePerKM() {
        return weight * 0.005 + kw * 0.025;
    }

    public int drive(int km) {
        double maxDistanceKM = currenttankcontent / calculateFuelUsagePerKM() * 100;
        System.out.println("Maximale Distanz: " + maxDistanceKM + "km bei aktuellem Tankinhalt: " + currenttankcontent+"L");
        int driveKM;
        if (maxDistanceKM >= km) {
            driveKM = km;
        } else {
            driveKM = (int) maxDistanceKM;
        }
        System.out.println("Ich fahre: " + driveKM + "km, fahren möchte ich: " + km+"km");
        double consumptionFOrDrivenKM = (calculateFuelUsagePerKM() / 100) * driveKM;
        currenttankcontent -= consumptionFOrDrivenKM;
        return driveKM;
    }

    public double getCurrenttankcontent() {
        return currenttankcontent;
    }

    public String toString() {
        return "Hallo willkommen in unserem Showroom \n" +
                "Hier finden Sie einen " + model +
                " von der Marke " + manufacturer + "\n" +
                "Der Waagen hat einen " + typeOfDrive + " Motor mit " + kw + "kw und " + psleistung() + "ps leistung";

    }
    public void refuel(){
        currenttankcontent = tank;
    }


}
