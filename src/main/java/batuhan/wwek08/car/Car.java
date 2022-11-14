package batuhan.wwek08.car;

import java.util.Random;

public class Car {
    private String manufacturer;
    private String model;
    private int kw;
    private String typeOfDrive;
    private double weight;
    private double tank;
    private double currenttankcontent;
    private Engine motor;
    private RepairStation myRepairStation;
    private Engine startStop;


    public Car(String manufacturer, String model, int kw, String typeOfDrive, double weight, double tank, Engine motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.tank = tank;
        this.kw = kw;
        this.typeOfDrive = typeOfDrive;
        this.weight = weight;
        this.currenttankcontent = tank;
        this.motor = motor;


    }

  public boolean stopStart(){
      boolean startStop = stopStart();

        return stopStart();
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

    public Engine getMotor() {
        return motor;
    }

    public int drive(int km) {

        double maxDistanceKM = currenttankcontent / calculateFuelUsagePerKM() * 100;
        System.out.println(stopStart() +"Maximale Distanz: " + maxDistanceKM + "km bei aktuellem Tankinhalt: " + currenttankcontent + "L\n\n");
        int driveKM;
        if (maxDistanceKM >= km) {
            driveKM = km;
            defekt(motor);




        } else {
            driveKM = (int) maxDistanceKM;
        }
        System.out.println("Ich fahre: " + driveKM + "km, fahren möchte ich: " + km + "km");
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

    public void refuel() {
        currenttankcontent = tank;
    }

    public void setMyRepairStation(RepairStation myRepairStation) {
        this.myRepairStation = myRepairStation;
    }

    public void defekt(Engine motor) {
        Random random = new Random();
        int random1 = random.nextInt(10);
        if (random1 > 5) {
            if (myRepairStation != null) {
                System.out.println(myRepairStation.toSting() + motor.toString());

            } else {
                System.out.println("Panne auf der Autobahn und wir haben keinen RepairStation");
            }

        } else System.out.println("");
    }




}




