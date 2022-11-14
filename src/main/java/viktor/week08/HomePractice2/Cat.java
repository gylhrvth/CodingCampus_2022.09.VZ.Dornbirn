package viktor.week08.HomePractice2;

public class Cat extends Mammal {

    public static final int MAX_CAT_LIFE = 9;
    private int countToCatLife = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean iAmDying() {
        countToCatLife++;
        if (countToCatLife < MAX_CAT_LIFE) {
            System.out.println("Ich habe noch " + (MAX_CAT_LIFE - countToCatLife) + " leben!");
            return false;
        }
        return true;
    }


    @Override
    public void iAmSleeping(){
        System.out.println("Die Katze schläft jetzt!");
    }

    @Override
    public void iAmEating(){
        System.out.println("Ich bin " + getName() + " und esse Mäuse und Vögel!");
    }

    @Override
    public int calculateSleepHoursPerDay(){
        return (int) (30/0.8f);
    }

}
