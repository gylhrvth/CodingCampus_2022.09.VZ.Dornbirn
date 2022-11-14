package viktor.week08.HomePractice2;

public abstract class Mammal extends Animal{

    public Mammal(String name){
        super(name,"Säugetier");
    }

    @Override
    public void iAmLiving(){
        System.out.println("Ich heiße " + getName());

    }
}
