package fatima.week08.zoo;

import java.util.*;

public class Enclosure {

    private String nameOfEnclosure;

    private List<Animals> animalsList;
    private List<Zookeeper> zookeeperList;
    private List<ToDosInEnclosure> toDosInEnclosureList;


    public Enclosure(String nameOfEnclosure) {
        this.nameOfEnclosure = nameOfEnclosure;

        animalsList = new Vector<>();
        zookeeperList = new Vector<>();
        toDosInEnclosureList = new Vector<>();
    }

    public void addAnimals(Animals... animals) {
        animalsList.addAll(Arrays.asList(animals));
    }

    public void addToDosInEnclosure(ToDosInEnclosure... toDosInEnclosures) {
        toDosInEnclosureList.addAll(Arrays.asList(toDosInEnclosures));
    }

    public void doWork() {
        System.out.println("Working progress in " + "'" + nameOfEnclosure + "'...");
        for (ToDosInEnclosure todos : toDosInEnclosureList) {
            System.out.printf("%-5s %-7s %-5s\n", todos.getZookeeper().getName(), " -----> ", todos.getToDos(), "\n");
        }
    }

    public void printStructure() {
        StringBuilder sB = new StringBuilder();

        Map<Zookeeper, String> zookeeperTaskMap = new HashMap<>();

        for (ToDosInEnclosure toDo : toDosInEnclosureList) {
            String allTodosOfZookeeper = zookeeperTaskMap.get(toDo.getZookeeper());
            if (allTodosOfZookeeper == null) {
                allTodosOfZookeeper = toDo.getToDos();
            } else {
                allTodosOfZookeeper += ", " + toDo.getToDos();
            }
            zookeeperTaskMap.put(toDo.getZookeeper(), allTodosOfZookeeper);
        }

        for (Map.Entry<Zookeeper, String> zookeeperTodoEntry : zookeeperTaskMap.entrySet()) {
            sB.append(zookeeperTodoEntry.getKey().getName() + " → " + zookeeperTodoEntry.getValue() + "; ");
        }

        String str2 = sB.toString();

        if (toDosInEnclosureList.isEmpty()) {
            System.out.println("│   ├── enclosure: " + nameOfEnclosure + " ▶ no keeper");
        } else {
            System.out.println("│   ├── enclosure: " + nameOfEnclosure + " ▶ keeper: " + str2.substring(0, str2.length() - 2));
        }

        if (animalsList.isEmpty()) {
            System.out.println("│       ├── (empty)");
        } else {
            for (Animals ani : animalsList) {
                ani.printStructure();
            }
        }
    }
}

