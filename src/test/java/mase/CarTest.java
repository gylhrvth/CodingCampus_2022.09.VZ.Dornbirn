package mase;

import mase.week10.Car.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void getHersteller() {
        String HerstellerToTest = "Mercedes";
        Car car = new Car("Mercedes", "Amg", 23, 40, Car.Antriebe.Benzin, 2000);
        assertEquals(HerstellerToTest, car.getHersteller());
    }

    @Test
    void fuelUse100km() {
        Car car = new Car("Mercedes", "Amg", 93, 40, Car.Antriebe.Benzin, 2000);
        boolean isFuelConsumInIntervall =
                2.4 < car.fuelUse100km() && 2.5 > car.fuelUse100km();
        assertTrue(isFuelConsumInIntervall);

    }

    @Test
    void getAkutellerTankinhalt() {
        Car car = new Car("tesla", "E", 100, 50, Car.Antriebe.Strom, 2500);
        assertEquals(50, car.getAktuellerTankinhalt());
    }

    @Test
    void drive(){
        Car car = new Car("Bmw", "m3",200,50, Car.Antriebe.Benzin,2000);


    }

    @Test
    void fillTank(){
        Car car = new Car("Ford","Mustang",300,60,Car.Antriebe.Diesel,2500);

    }
}
