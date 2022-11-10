package berna.week08.ZooExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enclosure {
    private static Random rand = new Random();
    public String nameOfEnclosure;
    private List<Animal> animalsInEnclosure;
    private List<String> tasksInEnclosure = new ArrayList<>();
    public List<String> tasksDone = new ArrayList<>();


    public Enclosure(String nameOfEnclosure, String... enclosureTasks) {

        this.nameOfEnclosure = nameOfEnclosure;
        animalsInEnclosure = new ArrayList<>();

        tasksInEnclosure.addAll(List.of(enclosureTasks));
        tasksDone.addAll(List.of(enclosureTasks)); // in the morning, all tasks are undone
    }

    public List<Animal> getAnimalsIntoEnclosure(Animal... animals) {
        animalsInEnclosure.addAll(List.of(animals));
        return animalsInEnclosure;
    }


    public void simulateAnimalsFighting() {

            for (Animal aggressor : animalsInEnclosure) {
                if (rand.nextInt(100) < 40) {
                    Animal victim = animalsInEnclosure.get(rand.nextInt(animalsInEnclosure.size()));
                    if (!aggressor.equals(victim)) {
                        System.out.printf("\"          >> %s and %s are fighting!%n", victim.printAnimal(), aggressor.printAnimal());
                        victim.gotBitten(aggressor);
                    }
                }
            }
            System.out.println("         >> All seem tired; they stop fighting... ");
        }

    public void simulateOneDay() {

        System.out.println("            News from the enclosure " + nameOfEnclosure + ":");

        for (int i = 0; i < tasksDone.size(); i++) {
            System.out.println("             " + tasksDone.get(i) + " done, one task less!");
        }
        System.out.println("         >> Everything´s done!");
        System.out.println();
        System.out.println("    As the keeper is gone, we observe the following ... ");

        if (animalsInEnclosure.size() > 2) {
            System.out.println("         >> Are the animals fighting?!? ... ");
            simulateAnimalsFighting();
        }else if(animalsInEnclosure.size() == 1){
            System.out.println("         >> " + animalsInEnclosure.get(0).printAnimal() + " enjoys the peaceful silence...");
        } else {
            System.out.println("         >> a lovely enclosure, but where are the animals?!?");
        }

        System.out.println("\n");
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
