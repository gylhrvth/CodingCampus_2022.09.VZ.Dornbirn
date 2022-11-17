package milan.week08.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AufgabeTest {

    @Test
    void getAufgabeNamen() {
        String aufgabeNameToTest = "ausmisten";
        Aufgabe zooAufgabe1 = new Aufgabe(aufgabeNameToTest);
        assertEquals(aufgabeNameToTest, zooAufgabe1.getAufgabeNamen());
    }

    @Test
    void setAufgabe() {
        Aufgabe ausmisten = new Aufgabe("ausmisten");
        String aufgabeNameToTest = "füttern";
        ausmisten.setAufgabe(aufgabeNameToTest);
        assertEquals(aufgabeNameToTest, ausmisten.getAufgabeNamen());
    }
}