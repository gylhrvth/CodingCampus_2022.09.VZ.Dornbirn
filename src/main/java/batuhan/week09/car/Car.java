package batuhan.week09.car;

import java.util.Random;

public class Car {
    private String manufacturer;
    private String model;

    private String typeOfDrive;
    private double weight;
    private double tank;
    private double currenttankcontent;
    private Engine motor;
    private RepairStation myRepairStation;


    public Car(String manufacturer, String model, String typeOfDrive, double weight, double tank, Engine motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.tank = tank;
        this.typeOfDrive = typeOfDrive;
        this.weight = weight;
        this.currenttankcontent = tank;
        this.motor = motor;


    }




    public int psleistung() {
        double ps = motor.getKw() * 1.35962;
        return (int) Math.ceil(ps);
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    private double calculateFuelUsagePerKM() {
        return weight * 0.005 + motor.getKw() * 0.025;
    }

    public Engine getMotor() {
        return motor;
    }
    public void istmeinAutoan(){
        motor.istmeinMotoran();
    }

    public int drive(int km) {

        double maxDistanceKM = currenttankcontent / calculateFuelUsagePerKM() * 100;
        System.out.println( "Maximale Distanz: " + maxDistanceKM + "km bei aktuellem Tankinhalt: " + currenttankcontent + "L\n\n");
        int driveKM;
        motor.setStarEngine(true);
        motor.istmeinMotoran();
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
                "Der Waagen hat einen " + typeOfDrive + " Motor mit " + motor.getKw() + "kw und " + psleistung() + "ps leistung";

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

                motor.setStarEngine(false);
                motor.istmeinMotoran();
                System.out.println(myRepairStation.toSting() + motor.toString());
            motor.setStarEngine(true);
            motor.istmeinMotoran();


            } else {

                System.out.println("Panne auf der Autobahn und wir haben keinen RepairStation");

                motor.setStarEngine(false);
                motor.istmeinMotoran();
            }

        } else System.out.println("");
    }




}




