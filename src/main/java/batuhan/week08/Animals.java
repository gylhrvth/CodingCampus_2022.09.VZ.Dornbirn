package batuhan.week08;

public class Animals {


    private String animalBreed;
    private String animalName;
    private Animalfeed food;
    private double amountOfFood;

    public Animals(String animalBreed, String animalName){
        this.animalBreed =animalBreed;
        this.animalName = animalName;
    }

    public void setFood(Animalfeed food, double amountOfFood) {
        this.food = food;
        this.amountOfFood = amountOfFood;
    }



    public void setAnimalBreed(){
        this.animalBreed = animalBreed;
    }
    public void setAnimalName(){
        this.animalName = animalName;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getAnimalName() {
        return animalName;
    }
    public String toSting(){
        return "│      ├──   " + animalName + " the " +animalBreed + food ;
    }
}
