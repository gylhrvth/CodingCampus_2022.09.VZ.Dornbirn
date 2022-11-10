package lukas.week08.animals;

public class Cat extends Mammal {
    public static final int CAT_MAX_LIFE = 9;
    private int dieCount = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean die() {
        dieCount++;
        if (dieCount < CAT_MAX_LIFE) {
            System.out.println("I am not dead, I have too many lifes!!! " + (CAT_MAX_LIFE - dieCount) + " lifes left!");
            return false;
        }
        return true;
    }

    @Override
    public void sleep() {
        System.out.println("I make purrrrrrrrr!!!!!!");
    }

    @Override
    public void eat() {
        System.out.println("Ich heiße " + getName() + " und esse gerne Mäuse und Vögel und Hennile!");
    }

    @Override
    public int calculateSleepHoursPerDay() {
        return (int) (26 / 0.8f);
    }
}
