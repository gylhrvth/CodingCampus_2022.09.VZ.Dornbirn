package stefan.week08.Car;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void calculateLitersPer100KM() {

    }

    @Test
    void getHersteller() {
        String nameToTest = "Bmw";
        Car car = new Car(nameToTest, "m3", "benzin", 80, 2000, 80);
        assertEquals(nameToTest, car.getHersteller());
    }

    @Test
    void getTankinhaltUebrig() {

        int numberToTest = 80;
        Car car1 = new Car("Bmw", "m3", "benzin", 80, 2000, 80);
        assertEquals(numberToTest, car1.getTankinhaltUebrig());
    }

    @Test
    void getModell() {
        String nameToTest = "m3";
        Car car = new Car(nameToTest, "m3", "benzin", 80, 2000, 80);
        assertEquals(nameToTest, car.getModell());
    }

    @Test
    void drive() {
        int kmToTest = 1000;
        Car car1 = new Car("Bmw", "m3", "benzin", 80, 2000, 80);
        double originalTank = car1.getTankinhaltUebrig();
        int kmHasDriven = car1.drive(1000);

        assertTrue(kmHasDriven <= 1000);
        assertTrue(kmHasDriven == 0 || car1.getTankinhaltUebrig() < originalTank);

    }

    @Test
    void getAntriebsart() {
        String nameToTest = "benzin";
        Car car = new Car(nameToTest, "m3", "benzin", 80, 2000, 80);
        assertEquals(nameToTest, car.getAntriebsart());
    }

    @Test
    void fillUp() {
        int numberToTest = 80;
        Car car1 = new Car("m3", "benzin", "benzin", 80, 2000, 80);
        assertEquals(numberToTest, car1.getTankinhaltUebrig());
    }


}
