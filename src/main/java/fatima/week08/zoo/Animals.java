package fatima.week08.zoo;

public class Animals {

    private String nameOfAnimal;
    private String genus;

    public Animals(String nameOfAnimal, String genus) {
        this.nameOfAnimal = nameOfAnimal;
        this.genus = genus;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void printStructure() {
        System.out.println("│           ├── " + nameOfAnimal + ", " + genus);
    }

}



