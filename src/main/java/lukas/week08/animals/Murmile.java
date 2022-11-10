package lukas.week08.animals;

public class Murmile extends Mammal {
    public Murmile(String name) {
        super(name);
    }

    @Override
    public void doLive() {
        super.doLive();
        System.out.println("...und ich bin im Winterschlaf in den schönen Bergen! Fiep fiep fiep!");
    }

    @Override
    public void eat() {
        System.out.println("Ich esse feines Murmilefressla, nämlich Kräuter!");
    }

    @Override
    public int calculateSleepHoursPerDay() {
        if (Math.random() > 0.5) {
            //Winter
            return 30;
        } else {
            //Sommer
            return 10;
        }
    }
}
