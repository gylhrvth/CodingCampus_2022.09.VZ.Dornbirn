package stefan.week08.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AufgabenTest {

    @Test
    void getAufgabenName() {
  String aufgabe = "Futtert";
  Aufgaben zk =new Aufgaben(aufgabe);
  assertEquals(aufgabe,zk.getAufgabenName());
    }

    @Test
    void setAufgabenName() {

    Aufgaben zk = new Aufgaben("putzen");
    String aufgabe1= "Kochen";
    zk.setAufgabenName(aufgabe1);
    assertEquals(aufgabe1,zk.getAufgabenName());
    }
}