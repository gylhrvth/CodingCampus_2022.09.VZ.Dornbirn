package berna.week08.ZooExample;

public class Animal {

    public String name1;
    public String name2;
    public String name3;
    public String name4;
    public String animal1;
    public String animal2;
    public String animal3;
    public String animal4;




    public Animal() {
        this.name1 = "Rijska";
        this.name2 = "Garmond";
        this.name3 = "Hugo";
        this.name4 = "Idaxis";

        this.animal1 = "Kuh";
        this.animal2 = "Storch";
        this.animal3 = "Storch";
        this.animal4 = "Storch";
    }


    public String getAnimal1() {
        return name1 +", " + animal1;
    }

    public String getAnimal2() {
        return name2 +", " + animal2;
    }

    public String getAnimal3() {
        return name3 +", " + animal3;
    }

    public String getAnimal4() {
        return name4 +", " + animal4;
    }
}


