package michel.week08.Tiergarten;


public class Animal {
    private final String name;
    private final String gattung;

    private final AnimalFeed food;
    private final double amountOfFood;

    private final int maxHealth;
    private int actualHealth;

    private final int bite;

    public Animal(String name, String gattung, AnimalFeed food, double amountOfFood, int bite, int maxHealth) {
        this.name = name;
        this.gattung = gattung;
        this.food = food;
        this.amountOfFood = amountOfFood;
        this.bite = bite;
        this.maxHealth=maxHealth;
        actualHealth = maxHealth;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
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
        System.out.println("│      ├── " + name + ", " + gattung + ", Gesundheit: " + actualHealth + " HP von " + maxHealth);
    }

    public void bite(Animal otherAnimal) {
        actualHealth -= otherAnimal.bite;
        if (actualHealth < 0) {
            System.out.println("Das Tier: " + name + " wurde von " + otherAnimal.getName() + " getötet");
        }
    }
}
