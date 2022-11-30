package batuhan.week08zoo;

import batuhan.wwek08.car.week08zoo.Animal;
import batuhan.wwek08.car.week08zoo.Animalfeed;
import batuhan.wwek08.car.week08zoo.Gehege;
import batuhan.wwek08.car.week08zoo.Zookeeper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZookeeperTest {

    @Test
    void getTimetoClean_notYetCleand() {
        Zookeeper zk = new Zookeeper("Batuhan");
        Gehege savanna = new Gehege("Savana");
        Animal giraffe = new Animal("Giraffe", "Gedeon", new Animalfeed("Heu", 1.99, 50), 33.5);

        String result = zk.timeToClean(savanna, giraffe, false);
        assertEquals("Batuhan says: The Savana enclosure form the Giraffe`s needs cleanig", result);
    }

    @Test
    void getTimetoClean_hasBeebCleand() {
        Zookeeper zk = new Zookeeper("Batuhan");
        Gehege savanna = new Gehege("Savana");
        Animal giraffe = new Animal("Giraffe", "Gedeon", new Animalfeed("Heu", 1.99, 50), 33.5);

        String result = zk.timeToClean(savanna, giraffe, true);
        assertNotEquals("Batuhan says: The Savana enclosure form the Giraffe`s needs cleanig", result);
        assertTrue(result.contains("already been cleaned"));
    }


    void timeToEat_notyetEat() {
        Zookeeper zk = new Zookeeper("Batuhan");
        Gehege savanna = new Gehege("Savana");
        Animal giraffe = new Animal("Giraffe", "Gedeo", new Animalfeed("heu", 1, 10), 1.99);
        String result = zk.timeToEat(giraffe, false);
        assertTrue(result.contains("still needs to be fed"));
    }

    void timeToEat_hasbeebEat() {
        Zookeeper zk = new Zookeeper("Batuhan");
        Gehege savanna = new Gehege("Savana");
        Animal giraffe = new Animal("Giraffe", "Gedeo", new Animalfeed("heu", 1, 10), 1.99);
        String result = zk.timeToEat(giraffe, true);
        assertTrue(result.contains("was fed"));
    }

    @Test
    void timeToEat() {
        timeToEat_hasbeebEat();
        timeToEat_notyetEat();

    }

    @Test
    void timeToClean() {
        getTimetoClean_hasBeebCleand();
        getTimetoClean_notYetCleand();
    }

    @Test
    void getZookeeper() {
        Zookeeper zk = new Zookeeper("Batuhan");
        String result = zk.getZookeeper();
        assertEquals(zk.getZookeeper(), result);

    }

    @Test
    void getTimetoClean() {
        Zookeeper zk = new Zookeeper("Batuhan");
        String result = zk.getTimetoClean();
        assertEquals(zk.getTimetoClean(),result);
    }
}