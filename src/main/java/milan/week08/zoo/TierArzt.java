package milan.week08.zoo;

import java.util.Random;

public class TierArzt {

    private static Random ran = new Random();
    private String name;

    public TierArzt(String name) {
        this.name = name;
    }

    public void healAnimal(Tier tier) {
        System.out.println(name + " heilt " + tier.getName());
        tier.heal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

