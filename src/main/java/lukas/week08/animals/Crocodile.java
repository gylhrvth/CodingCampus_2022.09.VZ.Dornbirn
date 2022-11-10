package lukas.week08.animals;

public class Crocodile extends Reptile {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Ich esse mit hoher Beißkraft!!! 2 Tonnen");
    }
}
