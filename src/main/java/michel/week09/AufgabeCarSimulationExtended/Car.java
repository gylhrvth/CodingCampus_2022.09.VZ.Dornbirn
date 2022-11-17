package michel.week09.AufgabeCarSimulationExtended;

public class Car {

    private final String manufacturer;
    private final String model;
    private int actualTank;
    private final int weight;
    private Engine engine;
    private Tank tank;


    public Car(String manufacturer, String model, int weight, Engine engine, Tank tank) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.engine = engine;
        this.tank = tank;
    }

    public double fuelUsage100km() {
        return weight * 0.0005 + engine.getLeistungKW() * 0.025;
    }

    public int drive(int distance) {
        actualTank = tank.getActualTankCapacity();
        double maxDistanceCar = (actualTank / fuelUsage100km()) * 100;
        int drivenDistance;
        engine.startMotor();
        if (maxDistanceCar >= distance) {
            drivenDistance = distance;
        } else {
            drivenDistance = (int) maxDistanceCar;
        }

        double consumedFuelDrivenKm = (fuelUsage100km() / 100) * drivenDistance;
        tank.setActualTankCapacity((actualTank -= (int) consumedFuelDrivenKm));

        System.out.print("Zurückgelegte Distanz: " + drivenDistance + " km, Füllstand Tank: < " + actualTank + " l");

        engine.setKmStand(drivenDistance);

        if (!engine.getFunctionStatus()) {
            System.out.println("\nAchtung Motorschaden!! Bei km -> " + engine.getKmStand());
            engine.stopMotor();
        }
        return drivenDistance;
    }

    public void changeEngine(String model, int leistungKW) {
        Engine engine = new Engine(model, leistungKW);
        setEngine(engine);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void changeTank(String model, int capacity) {
        Tank tank = new Tank(model, capacity);
        setTank(tank);
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Tank getTank() {
        return tank;
    }

    public int getActualTank() {
        return actualTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public String toString() {
        return "Hersteller: " + manufacturer + ", Model: " + model + ", Gewicht: " + weight + " Kg\n └──" + engine + "\n └──" + tank;
    }
}
