package batuhan.week08zoo;

import batuhan.wwek08.car.week08zoo.Animal;
import batuhan.wwek08.car.week08zoo.Animalfeed;
import batuhan.wwek08.car.week08zoo.Gehege;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GehegeTest {

    @Test
    void getAnimalenclosure() {
        String nametoTest = "quentin";
        Gehege gehege = new Gehege(nametoTest);
        assertEquals(nametoTest,gehege.getAnimalenclosure());
    }

    @Test
    void getListOfAnimal() {
        Gehege gehege =new Gehege("Afrika");
        Animal animal = new Animal("Lion","Leo",new Animalfeed("Fleisch",20.99,10),10);

    }

    @Test
    void getId() {
    }

    @Test
    void testGetAnimalenclosure() {
    }

    @Test
    void putAnimal() {
    }

    @Test
    void printStuktur() {
    }

    @Test
    void watchFavAnimal() {
    }

    @Test
    void calculateFoodMap() {
    }
}