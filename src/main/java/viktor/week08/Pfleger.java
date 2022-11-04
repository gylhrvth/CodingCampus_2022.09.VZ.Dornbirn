package viktor.week08;

import java.util.ArrayList;
import java.util.List;

public class Pfleger {

    private String name;
    List<String> tasksOfMaintener = new ArrayList<>();


    public Pfleger(String name){
        this.name = name;
    }

    public void putTasksToMaintener(String name){
        tasksOfMaintener.add(name);
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pfleger: " + name + " " + tasksOfMaintener;
    }
}
