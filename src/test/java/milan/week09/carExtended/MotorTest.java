package milan.week09.carExtended;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    @Test
    void addKmToKmStand() {
        int testKm = 15;
        Motor testMotor = new Motor("XYZ", 500);
        int testKmBefore = testMotor.getKmStand();
        testMotor.addKmToKmStand(testKm);
        assertEquals(testKmBefore + testKm, testMotor.getKmStand());
    }

    @Test
    void statusUpdate() {
        Motor testMotor = new Motor("XYZ", 500);
        int countTry = 0;
        while (testMotor.getStatusNotDefect() && countTry < 1000){
            testMotor.addKmToKmStand(10000);
            ++countTry;
        }
        assertTrue(countTry < 1000);
    }


    @Test
    void getKmStand() {
        int testKm = 0;
        Motor testMotor = new Motor("xy", 500);
        assertEquals(testKm, testMotor.getKmStand());
    }

    @Test
    void getHersteller() {
        String herstellerName = "Volvo";
        Motor testMotor = new Motor("xy", 500);
        testMotor.setHersteller(herstellerName);
        assertEquals(herstellerName, testMotor.getHersteller());

    }

    @Test
    void getModel() {
        String modelName = "XZ345";
        Motor testMotor = new Motor(modelName, 500);
        assertEquals(modelName, testMotor.getModel());
    }

    @Test
    void getStatusNotDefect() {
        Motor testMotor = new Motor("XYZ", 500);
        testMotor.setStatusNotDefect(false);
        assertFalse(testMotor.getStatusNotDefect());
    }

    @Test
    void setHersteller() {
        Motor testMotor = new Motor("XYZ", 500);
        String herstellerToTest = "ABC";
        testMotor.setHersteller(herstellerToTest);
        assertEquals(herstellerToTest, testMotor.getHersteller());
    }

    @Test
    void getStatusRunning() {
        Motor testMotor = new Motor("XZ345", 500);
        testMotor.setStatusRunning(true);
        assertTrue(testMotor.getStatusRunning());
    }

    @Test
    void getkWLeistung() {
        int testLeistung = 400;
        Motor testMotor = new Motor("xy", testLeistung);
        assertEquals(testLeistung, testMotor.getkWLeistung());
    }

    @Test
    void getMotorStatusText() {
        // Prepare Mock-up
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldPrintStream = System.out;
        System.setOut(new PrintStream(baos));

        // Test
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }

        // Reset Mock-up
        System.setOut(oldPrintStream);


        // Evaluate Test result
        String result = baos.toString();
        System.out.println("Result: \n" + result);

//        assertNotEquals(testMotor.getMotorStatusText(),testMotor2.getMotorStatusText());
//
    }

    @Test
    void testClone() {
        Motor testMotor = new Motor("XYZ",110);
        Motor neu = testMotor.clone();
        assertEquals(testMotor.getModel(),neu.getModel());
        assertEquals(testMotor.getkWLeistung(),neu.getkWLeistung());
    }
}