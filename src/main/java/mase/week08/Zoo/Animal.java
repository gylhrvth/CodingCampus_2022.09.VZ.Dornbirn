package mase.week08.Zoo;

public class Animal {
    private String name;
    private String typ;



    public Animal(String name, String typ){
        this.name = name;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return name + " " + typ;
    }
}
