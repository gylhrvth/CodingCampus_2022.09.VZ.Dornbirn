package michel.week09.AufgabeCarSimulationExtended;

import gyula.week08.zoo.Enclosure;
import gyula.week08.zoo.ZooKeeper;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void startMotor() {
        Engine engine = new Engine("amg", 600);
        assertTrue(engine.startMotor());
    }

    @Test
    void stopMotor() {
        Engine engine = new Engine("amg", 600);
        assertFalse(engine.stopMotor());
    }

    @Test
    void setKmStand() {
        Engine engine = new Engine("amg", 600);
        engine.setKmStand(100);
        assertEquals(100, engine.getKmStand());
    }

    @Test
    void functionStatusUpdate() {
        Engine engine = new Engine("amg", 600);

        int countTry = 0;
        while (engine.getFunctionStatus() && countTry < 100) {
            engine.setKmStand(1000);
            ++countTry;
        }
        System.out.println("Nach " + countTry + " versuche und " + engine.getKmStand() + " gefahrenen km, ist der MotorStatus: " + engine.getFunctionStatus());
        assertTrue(countTry < 100);
    }

    @Test
    void testToString() {
        Engine engine = new Engine("Small 1.5", 45);
        engine.setKmStand(0);

        String result = engine.toString();

        assertEquals("Motor -> Model: Small 1.5, LeistungKW: 45, KmStand: 0", result);
    }

    @Test
    void setFunctionStatus() {
        Engine engine = new Engine("amg", 600);
        engine.setFunctionStatus(true);
        assertTrue(engine.getFunctionStatus());
    }

    @Test
    void getModel() {
        Engine engine = new Engine("amg",1200);
        assertEquals("amg", engine.getModel());
    }

    @Test
    void getLeistungKW() {
        Engine engine = new Engine("amg", 600);
        assertEquals(600, engine.getLeistungKW());
    }

    @Test
    void getKmStand() {
        Engine engine = new Engine("amg", 600);
        engine.setKmStand(1299);
        assertEquals(1299, engine.getKmStand());
    }

    @Test
    void getFunctionStatus() {
        Engine engine = new Engine("amg", 600);
        engine.setFunctionStatus(true);
        assertTrue(engine.getFunctionStatus());
    }
}