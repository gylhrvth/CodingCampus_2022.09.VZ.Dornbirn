package berna.week10.CarSimulationExtended;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {



    @Test
    void addDistance(){
        Engine engine = new Engine(40,50,50);

        double originalCoveredDistance = engine.getCoveredDistanceEngine();
        double distCovTest = 3000;
        engine.addDistance(distCovTest);

        assertEquals(distCovTest + originalCoveredDistance, engine.getCoveredDistanceEngine());
    }



    @Test
    void setNeedToRepair() {
        Engine engine = new Engine(40,50,50);

        engine.setNeedToRepair(true);
        assertTrue(engine.isNeedToRepair());

        engine.setNeedToRepair(false);
        assertFalse(engine.isNeedToRepair());
    }

    @Test
    void checkNeedToRepair_AsLongAsNotFailed(){
        Engine engine = new Engine(40,50,50);
        engine.resetCoveredDistanceEngine();

        int countTry = 0;
        while (!engine.isNeedToRepair() && countTry < 1000){
            engine.addDistance(10000);
            engine.checkNeedToRepair();
            ++countTry;
        }
        assertTrue(countTry < 1000);
    }



    @Test
    void isEngineRandomBroken(){

    }

}