package berna.week09.CarSimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void drive() {

        Car testcar = new Car(40, 50, 1000);
        double distanceDriven = testcar.drive(10000);

        assertTrue(distanceDriven < 10000);
        assertTrue(0 < distanceDriven);

    }
    @Test
    void drive2() {

        Car testcar = new Car(40, 50, 1000);
        double distanceDriven = testcar.drive(10);

        assertEquals(10, distanceDriven);
    }

    @Test
    void refill_toomuch() {
        Car testcar = new Car(40, 50, 1000);
        assertEquals(50, testcar.refill(1));
    }

    @Test
    void refill_negativ() {

        Car testcar2 = new Car(40, 50, 1000);

        assertEquals(49, testcar2.refill(-1));
    }

    @Test
    void refill_positiv() {
        Car testcar2 = new Car(40, 50, 1000);

        double driven = 1.0;
        while (driven > 0) {
            driven = testcar2.drive(10); // Drive as long as Tank not empty
        }
        double fuelLevel = testcar2.refill(20);

        assertTrue(19.5 < fuelLevel);
        assertTrue(fuelLevel < 20.5);
    }



}