package martin.week08;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Caretaker {
    private String name;
    private List<Enclosure> enclListOfCT = new LinkedList<>();
    private Map<Enclosure, Enclosuretasks> enTasksOfCT = new HashMap<>();

    public Caretaker() {
        name = "Jemand";
    }

    public Caretaker(String name) {
        this.name = name;
    }

    public void addEnclosureAndTask(Enclosure encl, Enclosuretasks enTasks) {
        enclListOfCT.add(encl);
        encl.addEnclTask(enTasks);
    }

    public void remEnclosureAndTask(Enclosure encl, Enclosuretasks enTasks){
        enclListOfCT.remove(encl);
        encl.remEnclTask(enTasks);
    }

    @Override
    public String toString() {
        return "Pfleger: " + name;
    }
}