package viktor.week08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PflegerTest {

    @Test
    void getName() {

        String nameToTest = "Peter";
        Pfleger pfleger = new Pfleger(nameToTest);
        assertEquals(nameToTest,pfleger.getName());
    }

    @Test
    void addGehegeForPfleger() {
    }

    @Test
    void printStructure() {
    }

    @Test
    void simulateDay() {
    }
}