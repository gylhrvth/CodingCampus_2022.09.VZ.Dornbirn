package lukas.week08.animals;

public abstract class Animal {
    public static final String MAGIC_CONSTANT = "Hallo";
    private final String name;
    private final String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void doLive() {
        System.out.println("I am: " + name + " and I am alive!");
    }

    public boolean die() {
        System.out.println("I am: " + name + " and sadly I died!");
        return true;
    }

    public void sleep() {
        System.out.println("I am: " + name + " and I sleep!" + " And I sleep: " + calculateSleepHoursPerDay());
    }

    public void eat() {
        System.out.println("I am: " + name + " and I a eat!");
    }

    //Methode kann nicht mehr überschrieben werden!!!
    public final String getName() {
        return name;
    }

    //Methode kann nicht mehr überschrieben werden!!!
    @SuppressWarnings("unused")
    public final String getSpecies() {
        return species;
    }

    public abstract int calculateSleepHoursPerDay();
}
