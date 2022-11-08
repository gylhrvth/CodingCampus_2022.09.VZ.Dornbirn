package michel.week08.Tiergarten;

import java.util.Random;

public class Doctor {
    private static final Random rand = new Random();
    private final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void simulateHealing(Animal illestAnimal) {
        int maxRand = illestAnimal.getMaxHealth() - illestAnimal.getActualHealth();
        int healingAmount = rand.nextInt((int) (maxRand * 0.3), maxRand);
        int newHealth = illestAnimal.getActualHealth() + healingAmount;

        illestAnimal.setActualHealth(newHealth);

        System.out.println("│      ├── Der Doc: " + name
                + " ist gekommen und hat " + illestAnimal.getName()
                + "'s Gesundheit um " + healingAmount
                + " Hp erhöht die neue Gesundheit beträgt nun " + newHealth + " Hp");
    }
}
