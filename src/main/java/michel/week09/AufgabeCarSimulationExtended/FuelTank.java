package michel.week09.AufgabeCarSimulationExtended;

public class FuelTank extends Tank {
    private enum FuelType {BENZIN, DIESEL, GAS, ELEKTRO}

    private FuelType fuel;

    public FuelTank(String tankModel, int tankCapacy, FuelType fuel) {
        super(tankModel, tankCapacy);
        this.fuel = fuel;

    }
}
