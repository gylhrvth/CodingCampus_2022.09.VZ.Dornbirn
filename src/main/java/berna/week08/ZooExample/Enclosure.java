package berna.week08.ZooExample;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    public String nameOfEnclosure;
    private List<Animal> animalsInEnclosure;
    private List<String> tasksInEnclosure = new ArrayList<>();
    public List<String> tasksDone= new ArrayList<>();


    public Enclosure(String nameOfEnclosure, String...enclosureTasks) {

        this.nameOfEnclosure = nameOfEnclosure;
        animalsInEnclosure = new ArrayList<>();

        tasksInEnclosure.addAll(List.of(enclosureTasks));
        tasksDone.addAll(List.of(enclosureTasks)); // in the morning, all tasks are undone
    }

    public List<Animal> getAnimalsIntoEnclosure(Animal... animals) {
        animalsInEnclosure.addAll(List.of(animals));
        return animalsInEnclosure;
    }

    public void simulateOneDay() {

        System.out.println("        News from the enclosure " + nameOfEnclosure + ":");

        for (int i = 0; i < tasksDone.size(); i++) {
            System.out.println("            "+ tasksDone.get(i) + " done, one task less!");
            }
        System.out.println("            Everything´s done!\n");
        }

    public String printEnclosures() {
        StringBuilder text = new StringBuilder("    Enclosure: " + nameOfEnclosure + "\n");
        if (!animalsInEnclosure.isEmpty()) {
            for (Animal a : animalsInEnclosure) {
                text.append("         " + a.printAnimal() + "\n");
            }
        } else {
            text.append("         " + "(empty)" + "\n");
        }
        return text.toString();
    }




}
