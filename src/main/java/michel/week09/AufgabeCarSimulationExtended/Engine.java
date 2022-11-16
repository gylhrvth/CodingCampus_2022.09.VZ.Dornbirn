package michel.week09.AufgabeCarSimulationExtended;

import java.util.Random;

public class Engine {
    private static final Random rand = new Random();
    private final String model;
    private final int leistungKW;

    private int kmStand;
    private boolean functionStatus;

    public Engine(String model, int leistungKW) {
        this.model = model;
        this.leistungKW = leistungKW;

        kmStand = 0;
        functionStatus = true;
    }

    public void setKmStand(int kmStand) {
        this.kmStand += kmStand;
        functionStatusUpdate();
    }

    public void functionStatusUpdate() {
        if (kmStand > rand.nextInt(8000, 60000)) {
            functionStatus = false;
        }
    }

    @Override
    public String toString() {
        return "Motor -> " + "Model: " + model  + ", LeistungKW: " + leistungKW + ", KmStand: " + kmStand;
    }

    public void setFunctionStatus(boolean functionStatus) {
        this.functionStatus = functionStatus;
    }

    public String getModel() {
        return model;
    }

    public int getLeistungKW() {
        return leistungKW;
    }


    public int getKmStand() {
        return kmStand;
    }

    public boolean getFunctionStatus() {
        return functionStatus;
    }
}
