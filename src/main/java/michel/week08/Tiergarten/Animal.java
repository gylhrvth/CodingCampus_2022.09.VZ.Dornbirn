package michel.week08.Tiergarten;


public class Animal {
    private String name;
    private String gattung;

    private AnimalFeed food;
    private double amountOfFood;

    private int maxHealth;

    private int actualHealth;

    private int bite;

    public Animal(String name, String gattung, AnimalFeed food, double amountOfFood, int bite, int maxHealth) {
        this.name = name;
        this.gattung = gattung;
        this.food = food;
        this.amountOfFood = amountOfFood;
        this.bite = bite;
        this.maxHealth = maxHealth;
        actualHealth = maxHealth;
    }

    public int getActualHealth() {
        return actualHealth;
    }

    public String getName() {
        return name;
    }

    public AnimalFeed getFood() {
        return food;
    }

    public double getAmountOfFood() {
        return amountOfFood;
    }

    public void printAnimal() {
        System.out.println("│      ├── " + name + ", " + gattung + ", Gesundheit: " + actualHealth + " HP");
    }

    public void bite(Animal otherAnimal) {
        actualHealth -= otherAnimal.bite;
        if (actualHealth < 0) {
            System.out.println("Das Tier: " + name + " wurde von " + otherAnimal.getName() + " getötet");
        }
    }

}
