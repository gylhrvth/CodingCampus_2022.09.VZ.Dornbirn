package lukas.week08.animals;

public abstract class Reptile extends Animal {
    public Reptile(String name) {
        super(name, "Reptilie");
    }

    @Override
    public void doLive() {
        System.out.println("Ich heiße: " + getName() + " lebe so gerne im Wasser!!! Aber ich atme gerne an Land!");
    }

    @Override
    public int calculateSleepHoursPerDay() {
        return 16;
    }
}
