package martin.week08;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static martin.week08.ZooExample.printZooStructure;
import static org.junit.jupiter.api.Assertions.*;

class ZooExampleTest {

    @Test
    void testDaySimulation() {
        /* Prepare Mock-Up */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldSystemOut = System.out;
        System.setOut(new PrintStream(baos));
        /* Prepare Objects */
        Zoo testZoo = new Zoo();
        Enclosure enAttrappe = testZoo.searchAndMakeEncl("Attrappen");
        enAttrappe.addAnimal(new Animal("Rufus", "Pappe"));
        testZoo.searchAndCreateCaretaker("Max Musterman", enAttrappe);
        /* The core of the test */
        testZoo.shuffleEnclosures();
        testZoo.shuffleCaret();
        printZooStructure(testZoo);
        testZoo.simulateDay();
        /* Repair Mock-up */
        System.setOut(oldSystemOut);
        /* Evaluate Result from Mock-Up */
        String testString = "Max Musterman füttert die Tiere," +
                " reinigt das Attrappen Gehege und beobachtet Rufus, Pappe.";
        assertTrue(baos.toString().contains(testString),
                "\"" + baos + "\" doesn't contains \"" + testString + "\"");
    }
}