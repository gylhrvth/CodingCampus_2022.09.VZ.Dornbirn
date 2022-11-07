package michel.week08.Tiergarten;



public class Animal {
    private String name;
    private String gattung;
    private AnimalFeed food;
    private double amountOfFood;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGattung() {
        return gattung;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }

    public AnimalFeed getFood() {
        return food;
    }
    public double getAmountOfFood() {
        return amountOfFood;
    }

    public Animal(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }

    public void setFood(AnimalFeed food, double amountOfFood) {
        this.food = food;
        this.amountOfFood = amountOfFood;
    }


    public String toString() {
        return name + ", " + gattung;
    }
}
