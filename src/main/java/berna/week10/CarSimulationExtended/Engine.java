package berna.week10.CarSimulationExtended;

public class Engine {
    public int kW;

    public double breakdownProbability;
    public double initialMaxDistanceEngine;
    public double maxDistLeftEngine;
    public boolean needToRepair;
    public boolean engineRandomBroken;

    public int counterStarts;

    public Tank myTank;



    public Engine(int kW, Tank myTank) {

        this.kW = kW;
        this.myTank = myTank;
        initialMaxDistanceEngine = 30000; // after 30000km, change engine
        breakdownProbability = 0.01; //initial value
        maxDistLeftEngine = initialMaxDistanceEngine;
        needToRepair = false;
        engineRandomBroken = false;
    }
    public int getKW() {
        return kW;
    }

    //TODO: 14.11.22: implement the random broken engine
/*    public double getMaxDistLeftEngine(double distanceDriven) {
        maxDistLeftEngine = initialMaxDistanceEngine - distanceDriven;
        return maxDistLeftEngine;
    }*/


    private boolean isEngineRandomBroken() {
        double distanceSoFar= initialMaxDistanceEngine - maxDistLeftEngine;

        // the more you drive, the higher the prob!
        if (distanceSoFar > 0) { //but you must drive to change P(break)!
            breakdownProbability = (breakdownProbability * distanceSoFar) / 100;
        }return true;
    }


    public boolean isNeedToRepair() {
        //when is the engine broken?
        //either max distance is reached or P(break)>0.7
        if (maxDistLeftEngine <= 0) {
            needToRepair = true;
        } else if (isEngineRandomBroken()) {
            needToRepair = true;
        } else {
            needToRepair = false;
        }
        return needToRepair;
    }

    public void setNeedToRepair(boolean needToRepair) {
        this.needToRepair = needToRepair;
    }

    public boolean setEngineOn(boolean bool) {
        if (bool) {
            counterStarts = counterStarts + 1;
        }
        return true;
    }


    public double resetMaxDistanceEngine() {
        maxDistLeftEngine = initialMaxDistanceEngine;
        return maxDistLeftEngine;
    }

    public String printEngineInfo() {
        return
                "Engine: " + kW + " kW, maximal Distance before repair needed: " + initialMaxDistanceEngine + "\n" +
                        "You can still drive " + maxDistLeftEngine + " km. Then maintenance is needed!" + "\n";
    }
}

