package berna.week10.CarSimulationExtended;

public class Engine {
    public int kW;
    public Tank tank;
    public double breakdownProbability;
    public double maxDistanceEngine;
    public double coveredDistanceEngine;
    public boolean needToRepair;
    public boolean engineRandomBroken;

    public int counterStarts;

    public Tank myTank;


    public Engine(int kW,int maxCapacityTank, double fillLevel ) {

        this.kW = kW;
        this.myTank = new Tank(maxCapacityTank,fillLevel);
        maxDistanceEngine = 30000; // after 30000km, change myEngine
        breakdownProbability = 0.3; //initial value
        needToRepair = false;
        engineRandomBroken = false;
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

    public boolean isEngineRandomBroken() {
        //TODO: formula for breakdownProbability is nonsense!!
        //the more you drive, and the more often you started, the higher the failure prob
        if (coveredDistanceEngine > 0) { //but you must drive to change P(break)!
            breakdownProbability = (breakdownProbability * coveredDistanceEngine *counterStarts)/100;
            return true;
        } else {
            return false;
        }
    }


    public boolean isNeedToRepair() {
        //when is the myEngine broken? either max distance is reached or P(break)>0.7
        if (coveredDistanceEngine == maxDistanceEngine || isEngineRandomBroken()) {
            needToRepair = true;
        } else {
            needToRepair = false;
        }
        return needToRepair;
    }

    public void setNeedToRepair(boolean needToRepair) { //the repair Station resets the motor
        this.needToRepair = needToRepair;
    }

    public void resetCoveredDistanceEngine() {
        coveredDistanceEngine = maxDistanceEngine;
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
}

