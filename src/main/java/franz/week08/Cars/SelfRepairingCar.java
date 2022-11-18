package franz.week08.Cars;

public class SelfRepairingCar extends Car {

    public SelfRepairingCar(String hersteller, String model, int maxTankinhalt, String kraftstoff, float gewicht, Engine engine) {
        super(hersteller, model, maxTankinhalt, kraftstoff, gewicht, engine);
    }

    @Override
    public int drive(int kilometer) {
        int drivenkm = super.drive(kilometer);
        if (kilometer == drivenkm) {
            return kilometer;
        }
        if (this.isEngineDefect()) {
            changeEngine(new Engine("newEngine", this.kwOfCar()));
            return this.drive(kilometer - drivenkm);
        }
        return drivenkm;
    }
}

