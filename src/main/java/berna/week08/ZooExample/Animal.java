package berna.week08.ZooExample;

public class Animal {
    public String nameAnimal;
    public String sortOfAnimal;

    public Animal(String nameAnimal, String sortOfAnimal) {
        this.nameAnimal = nameAnimal;
        this.sortOfAnimal = sortOfAnimal;
    }

    public String printAnimal() {
        return nameAnimal + ", " + sortOfAnimal;
    }

}


