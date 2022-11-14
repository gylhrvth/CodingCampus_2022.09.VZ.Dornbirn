package viktor.week08.HomePractice2;

public abstract class Reptile extends Animal {

    public Reptile(String name){
        super(name,"Reptil");
    }

    @Override
    public void iAmLiving(){
        System.out.println("Ich bin " + getName() + " und ich lebe im Wasser und an Land!");
    }

    @Override
    public int calculateSleepHoursPerDay(){
        return 20;
    }


}
