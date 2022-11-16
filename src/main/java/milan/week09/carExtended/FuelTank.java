package milan.week09.carExtended;

public class FuelTank extends Tank{

    public FuelTank(String model) {
        super(model);
    }

    @Override
    public void getTankinhaltText() {
        System.out.println("Der Tankinhalt beträgt: " + getTankinhalt() + " Liter.");
    }
    @Override
    public void refuelTank(){
        setTankinhalt(getMaxTankinhalt() - ran.nextDouble(getMaxTankinhalt() / 10));
        System.out.printf("Es wurden %.2f Liter getankt.\n", getTankinhalt());
    }

    @Override
    public String getSpeicherName() {
        return "Fueltank";
    }
}
