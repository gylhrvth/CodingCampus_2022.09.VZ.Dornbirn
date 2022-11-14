package milan.week09.carExtended;

public class Battery extends Tank {


    public Battery(String model) {
        super(model);
    }

    @Override
    public void getTankinhaltText() {
        System.out.println("Der Akkustand beträgt: " + getTankinhalt() + " Ah.");
    }

    @Override
    public void refuelTank() {
        setTankinhalt(getMaxTankinhalt() - ran.nextDouble(getMaxTankinhalt() / 10));
        System.out.printf("Es wurden %.2f Ah geladen.\n", getTankinhalt());
    }

    @Override
    public String getSpeicherName() {
        return "Akku";
    }
}
