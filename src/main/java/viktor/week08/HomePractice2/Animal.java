package viktor.week08.HomePractice2;

public abstract class Animal {

    private String name;
    private String type;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void iAmLiving(){
        System.out.println("Ich bin ein " + type);
    }

    public boolean iAmDying(){
        System.out.println("Ich bin ein " + name + " und bin gestorben!");
        return true;
    }

    public void iAmSleeping(){
        System.out.println("Ich bin ein " + type + " und ich schlafe jetzt " + calculateSleepHoursPerDay() + " h");
    }

    public void iAmEating(){
        System.out.println("Ich bin ein " + type + " und ich esse gerade.");
    }

    public final String getName() {
        return name;
    }

    public final String getType() {
        return type;
    }

    public abstract int calculateSleepHoursPerDay();
}
