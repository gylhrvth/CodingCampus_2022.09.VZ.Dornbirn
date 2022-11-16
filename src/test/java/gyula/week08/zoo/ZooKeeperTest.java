package gyula.week08.zoo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ZooKeeperTest {

    @Test
    void getName() {
        String nameToTest = "Quentin";
        ZooKeeper zk = new ZooKeeper(nameToTest);
        assertEquals(nameToTest, zk.getName());
    }

    @Test
    void addResponsibility() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));


        /* Prepare Objects */
        ZooKeeper zk = new ZooKeeper("Alfonso");
        Enclosure enc = new Enclosure("Savanna");
        /* The core of the test */
        zk.addResponsibility(enc);
        /* Make Result visible */
        zk.printStructure();

        /* Repair Mock-Up */
        System.setOut(oldSystemOut);
        /* Evaluate Result from Mock-Up */
        assertEquals("│   ├── Pfleger: Alfonso, Verantwortlich für Savanna\n", baos.toString().replaceAll("\r\n", "\n"));
    }

    @ParameterizedTest(name = "Test ZooKeeper.getName_asList for name: {0}.")
    @ValueSource(strings = { "", "racecar", "radar", "able was I ere I saw elba" })
    void getName_asList(String nameToTest) {
        ZooKeeper zk = new ZooKeeper(nameToTest);
        assertEquals(nameToTest, zk.getName());
    }

    @Test
    void printStructure() {
    }

    @Test
    void simulateDay() {
    }

}