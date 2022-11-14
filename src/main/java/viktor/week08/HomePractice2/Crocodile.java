package viktor.week08.HomePractice2;

public class Crocodile extends Reptile {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void iAmEating() {
        System.out.println("Ich esse viel Fleisch!");
    }
}
