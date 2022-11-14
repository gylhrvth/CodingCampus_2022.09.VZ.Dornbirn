package viktor.week08.HomePractice2;

public class Murmile extends Mammal {

    public Murmile(String name) {
        super(name);
    }

    @Override
    public void iAmLiving() {
        super.iAmLiving();
        System.out.println("Im Winter schlafe ich länger.....");
    }

    @Override
    public void iAmEating() {

        System.out.println("Ich fresse viel Kräuter!");
    }

    @Override
    public int calculateSleepHoursPerDay() {
        double randomNum = Math.random();
        if (randomNum > 0.5) {
            return 50;
        } else {
            return 20;
        }
    }


}
