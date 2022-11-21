package berna.week10.CarSimulationExtended;

import java.util.Random;

public class Engine {
    private static Random rand = new Random();

    private int kW;
    private Tank tank;
    private double breakdownProbability;
    private double maxDistanceEngine;
    private double coveredDistanceEngine;
    private boolean needToRepair;
    private boolean engineRandomBroken;

    private int counterStarts;

    private Tank myTank;


    public Engine(int kW,int maxCapacityTank, double fillLevel ) {

        this.kW = kW;
        this.myTank = new Tank(maxCapacityTank,fillLevel);
        maxDistanceEngine = 3000000; // after 30000km, change myEngine
        breakdownProbability = 0.3; //initial value
        needToRepair = false;
        engineRandomBroken = false;
        coveredDistanceEngine = 0.0;
    }

    public int getKW() {
        return kW;
    }
    public Tank getTank() {return myTank;}


    public boolean setEngineOn(boolean startEngine) {
        if (startEngine) {
            counterStarts = counterStarts + 1;
            return true;
        } else {
            return false;
        }
    }

    public void addDistance(double distanceCovered) {
        coveredDistanceEngine = coveredDistanceEngine + distanceCovered;
    }



    public boolean checkNeedToRepair() {
        //when is the myEngine broken? either max distance is reached or P(break)>0.7
        double probability = (maxDistanceEngine - coveredDistanceEngine) / maxDistanceEngine;
        System.out.printf("Probability of engine failure: %.2f%%\n", (1-probability)*100);
        if (probability < rand.nextDouble()) {
            needToRepair = true;
        } else {
            needToRepair = false;
        }
        return needToRepair;
    }

    public boolean isNeedToRepair() {
        return needToRepair;
    }

    public void setNeedToRepair(boolean needToRepair) { //the repair Station resets the motor
        this.needToRepair = needToRepair;
    }

    public void resetCoveredDistanceEngine() {
        coveredDistanceEngine = 0.0;
    }
    public double getCoveredDistanceEngine(){return coveredDistanceEngine;}

    public int getCounterStarts() {return counterStarts;}

    public double getBreakdownProbability() {
        return breakdownProbability;
    }

    public String printEngineInfo() {
        return
                "Engine: " + kW + " kW, maximal Distance before repair needed: " + maxDistanceEngine + "\n" +
                        "You can still drive " + coveredDistanceEngine + " km. Then maintenance is needed!" + "\n";
    }

    @Override
    public String toString() {
        return "Engine: " + kW + " kW , total driven distance: " + coveredDistanceEngine + " km \n";
    }
}

