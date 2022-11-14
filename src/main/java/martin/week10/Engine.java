package martin.week10;

import martin.week09.EngineType;

public class Engine {
    private static int globalIdCounter = 0;
    private int id;
    private final EngineType engineType;
    private int condition;
    private int KW;
    public Engine(EngineType engineType, int condition,int KW) {
        globalIdCounter++;
        id = globalIdCounter;
        this.engineType = engineType;
        this.condition = condition;
        this.KW=KW;
    }
    public int getKW() {
        return KW;
    }
}