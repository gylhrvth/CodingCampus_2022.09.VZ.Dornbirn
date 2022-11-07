package martin.week08;

import java.util.LinkedList;
import java.util.List;

public class Caretaker {
    private String name;
    private List<Enclosure> encl = new LinkedList<>();
    private List<Enclosuretasks> enTasks = new LinkedList<>();

    public Caretaker() {
        name = "Jemand";
    }

    public Caretaker(String name) {
        this.name = name;
    }

    public void addEnclosureAndTask(Enclosure encl, Enclosuretasks enTasks) {
        this.encl.add(encl);
        this.enTasks.add(enTasks);
    }

    @Override
    public String toString() {
        return "Pfleger: " + name;
    }
}