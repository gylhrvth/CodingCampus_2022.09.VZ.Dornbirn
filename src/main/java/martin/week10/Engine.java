package martin.week10;

import martin.week09.EngineType;

public class Engine {
    private static int globalIdCounter = 0;
    private int id;
    private final EngineType engineType;
    private boolean enWorks;
    private int condition;
    private int KW;
    public Engine(EngineType engineType, int condition,int KW) {
        globalIdCounter++;
        id = globalIdCounter;
        this.engineType = engineType;
        this.enWorks =true;
        this.condition = condition;
        this.KW=KW;
    }
    public int getKW() {
        return KW;
    }
    public EngineType getEnType(){
        return this.engineType;
    }
    public boolean getEnWorks(){
        return this.enWorks;
    }
    public void enBreaks(int kmDriven){
        if(kmDriven>condition){
            this.enWorks =false;
        } else {
            this.condition -= this.condition/(kmDriven/10);
        }
    }
}