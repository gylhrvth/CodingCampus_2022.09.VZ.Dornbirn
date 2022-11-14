package batuhan.week08zoo;

import java.util.Map;

public class Animal {


    private String animalBreed;
    private String animalName;
    private Animalfeed food;
    private double amountOfFood;


    public Animal(String animalBreed, String animalName, Animalfeed food, double amountOfFood){
        this.animalBreed =animalBreed;
        this.animalName = animalName;
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
        return "│      ├──   " + animalName + " the " +animalBreed  ;
    }


    public void calculateFoodMap(Map<Animalfeed, Double> foodMap) {
        if (food != null) {
            Double amount = 0.0;
            if (foodMap.containsKey(food)) {
                amount = foodMap.get(food);
            }
            amount += amountOfFood;
            foodMap.put(food, amount);
        }
    }

}
