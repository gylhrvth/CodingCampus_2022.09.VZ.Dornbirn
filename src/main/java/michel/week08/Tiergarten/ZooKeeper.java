package michel.week08.Tiergarten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ZooKeeper {
    private String name;

//    private List<String> tasksZooKeeper = new ArrayList<>();
    private Map<Enclosure,String>tasksZooKeeperEnclosure=new HashMap<>();

    public ZooKeeper(String name){
        this.name=name;
    }
    public void putTaskToZooKeeper(Enclosure enclosure,String task){
//        tasksZooKeeper.add(task);
        tasksZooKeeperEnclosure.put(enclosure,task);
    }
    public void removeTaskOfZooKeeper(Enclosure enclosure,String task){
        tasksZooKeeperEnclosure.remove(enclosure,task);
    }
    public void printZooKeeperTasks(){
        System.out.println("|--- Pfleger: " + name);
//        for (String p: tasksZooKeeper) {
//            System.out.println("|    |--- "+p);
//        }
        for (Map.Entry<Enclosure, String> tasks : tasksZooKeeperEnclosure.entrySet()) {

            System.out.printf("|   |--- %-17s - %-10s \n", tasks.getKey(), tasks.getValue());
        }
    }
    public String toString(){
        return "Pfleger: " + name + " Aufgaben: " + tasksZooKeeperEnclosure;
    }
}
