package franz.week08.Cars;

public class AeroDynamicCar extends Car {


    public AeroDynamicCar(String hersteller, String model, int maxTankinhalt, String kraftstoff, float gewicht, Engine engine) {
        super(hersteller, model, maxTankinhalt, kraftstoff, gewicht, engine);
    }

    @Override
    public double fuelUsagePer100KM() {
        return super.fuelUsagePer100KM() / 2;
    }
    
}

