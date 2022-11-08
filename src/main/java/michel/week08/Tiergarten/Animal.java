package michel.week08.Tiergarten;



public class Animal {
    private String name;
    private String gattung;

    private AnimalFeed food;
    private double amountOfFood;

    public Animal(String name, String gattung,AnimalFeed food, double amountOfFood) {
        this.name = name;
        this.gattung = gattung;
        this.food = food;
        this.amountOfFood = amountOfFood;
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

    public void printAnimal(){
        System.out.println("│      ├── " + name + ", " + gattung);
    }
}
