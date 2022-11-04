package fatima.week08.zoo;

import java.util.List;
import java.util.Vector;

public class Zookeeper {

    private String name;
    private List<ToDosInEnclosure> toDosInEnclosureList;

    public Zookeeper(String name) {
        this.name = name;

        toDosInEnclosureList = new Vector<>();
    }

    public String getName() {
        return name;
    }
}
