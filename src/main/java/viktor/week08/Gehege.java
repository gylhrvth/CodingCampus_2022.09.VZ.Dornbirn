package viktor.week08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gehege {

    private String description;

    ArrayList<Tier> animalsOfList = new ArrayList<Tier>();
    Random random = new Random();

    public Gehege(String description) {
        this.description = description;

    }

    public String getDiscription() {
        return description;
    }

    public Tier putTierToGehege(String name, String gattung) {
        for(Tier tier : animalsOfList){
            if (tier.getName().equals(name)){
                return tier;
            }
        }
        Tier tier = new Tier(name,gattung);
        animalsOfList.add(tier);
        return tier;
    }

    public void removeTier(Tier tier){
        animalsOfList.remove(tier);

    }

    public void printGehege() {
        System.out.println("|    |---- Gehege: " + description);


        if (animalsOfList.isEmpty()) {
            System.out.println("|                |---- (Leer)");

        } else {
            for (Tier t : animalsOfList) {
                t.printStructure();
            }
        }
    }

    public void showAnimal(){

        int randomAnimal = random.nextInt(animalsOfList.size());
            Tier t = animalsOfList.get(randomAnimal);
            System.out.println("Der Pfleger schaut das Tier " + t.getName());
    }


    public void simulation(Pfleger p){
        System.out.printf("%s füttert die Tiere, mäht die Rasen und reinigt das Gehege: %s%n", p.getName(), description);
    }
}