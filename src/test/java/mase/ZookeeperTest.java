package mase;


import mase.week08.Zoo.ZooKeeper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZookeeperTest {

    @Test
    void getName(){
        String nameToTest = "beni";
        ZooKeeper zooKeeper = new ZooKeeper(nameToTest);
        assertEquals(nameToTest,zooKeeper.getName());
    }

}
