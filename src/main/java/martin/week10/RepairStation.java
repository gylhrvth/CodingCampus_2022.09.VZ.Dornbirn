package martin.week10;

import martin.week09.EngineType;
import martin.week10.Engine;

import java.util.Random;

public class RepairStation {
    private String name;
    public static final Random rand = new Random();
    private Engine[] avEngines;

    public RepairStation(String name, int ammAvEngines) {
        this.name = name;
        this.avEngines = new Engine[ammAvEngines];
        fillRepairStation();
    }

    public String getName() {
        return name;
    }



    public Engine makeRandEngine() {
        EngineType[] enTypes = EngineType.values();
        int enTy = rand.nextInt(EngineType.values().length);
        return new Engine(
                enTypes[enTy],
                100 + rand.nextInt(700, 900),
                50 + rand.nextInt(0, 50)
        );
    }

    public void fillRepairStation() {
        for (int i = 0; i < avEngines.length; i++) {
            avEngines[i] = makeRandEngine();
        }
    }
}
