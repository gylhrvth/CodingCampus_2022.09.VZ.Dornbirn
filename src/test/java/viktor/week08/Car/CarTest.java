package viktor.week08.Car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getModell() {
        String modellToTest = "Mustang";
         Car car = new Car(modellToTest,20,400,Car.Antriebsart.BENZIN,1500);
         assertEquals(modellToTest,car.getModell());
    }

    @Test
    void getTankInhalt() {
        double tankInhaltToTest = 25.5;
        Car car = new Car("Mustang",tankInhaltToTest,400,Car.Antriebsart.BENZIN,1400);
        assertEquals(tankInhaltToTest,car.getTankInhalt());

    }

    @Test
    void getGewicht() {
        double gewichtToTest = 1500;
        Car car = new Car("Mustang",30,400,Car.Antriebsart.BENZIN,gewichtToTest);
        assertEquals(gewichtToTest,car.getGewicht());

    }

    @Test
    void drive() {
    }

    @Test
    void defekt() {

        int drivenKM = 120;
        assertTrue(drivenKM > 100);
        assertFalse(drivenKM < 100);
    }

    @Test
    void checkTankContant() {
        double tankInhaltToTest = 5;
        assertTrue( tankInhaltToTest > 1);
        assertFalse(tankInhaltToTest < 1);
    }

    @Test
    void refill() {


    }
}