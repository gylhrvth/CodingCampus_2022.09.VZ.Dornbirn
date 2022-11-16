package franz.week08.Zoo;

public class Animal {

    private String name;

    private String art;


    public Animal(String name, String art) {
        this.name = name;
        this.art = art;

    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.printf("|        |-- Tier: %s, %s\n", name, art);
    }
    //    YXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYXYX


}
