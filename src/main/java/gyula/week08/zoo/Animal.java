package gyula.week08.zoo;

public class Animal {
    private String name;
    private String art;

    public Animal(String name, String art){
        this.name = name;
        this.art = art;
    }

    public void printStructure() {
        System.out.printf("│      ├── Tier: %s, %s\n", name, art);
    }

    public String getName() {
        return name;
    }
}
