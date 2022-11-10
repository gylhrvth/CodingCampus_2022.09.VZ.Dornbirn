package martin.week08;

public class Animal {
    private String name;
    private String gattung;
    private int maxHealth;
    private int health;



    public Animal() {
        name = "Wolpertinger";
        gattung = "Fabelwesen";
        maxHealth = Integer.MAX_VALUE;
        health = maxHealth;
    }

    public Animal(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        maxHealth = Integer.MAX_VALUE / name.hashCode();
        health = maxHealth;
    }

    public Animal(String name, String gattung, int maxGesundheit) {
        this.name = name;
        this.gattung = gattung;
        this.maxHealth = maxGesundheit;
        health = maxGesundheit;
    }

    public String getName() {
        return name;
    }

    public void setGesundheit(int health) {
        this.health = health;
    }

    public void bite(Animal thatBites, Animal beingBiten) {
        int health = beingBiten.health-(2*((int)Math.sqrt(thatBites.health)));
        beingBiten.setGesundheit(Math.max(health, 0));
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, gattung);
    }
}