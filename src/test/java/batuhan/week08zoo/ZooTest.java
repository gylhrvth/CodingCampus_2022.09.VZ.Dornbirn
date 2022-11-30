package batuhan.week08zoo;

import batuhan.wwek08.car.week08zoo.Zookeeper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getZooname() {
        String nametoTest = "quentin";
        Zookeeper zk = new Zookeeper(nametoTest);
        assertEquals(nametoTest,zk.getZookeeper());
    }



    @ParameterizedTest(name = "Test ZooKeeper.getName_asList for name: {0}.")
    @ValueSource(strings = { "", "racecar", "radar", "able was I ere I saw elba" })
    void getName_asList(String nameToTest) {
        Zookeeper zk = new Zookeeper(nameToTest);
        assertEquals(nameToTest, zk.getZookeeper());
    }

    @Test
    void printStuktur() {
    }

    @Test
    void calculateFoodMap() {
    }
}