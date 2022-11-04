package michel.week05.PersonExample;

public class Person {
    private static int lastID = 1;

    private int id;
    private double size;
    private int age;
    private String name;
    private int weight;

    public Person(double size, int age, String name, int weight) {
        id = lastID;
        ++lastID;
        this.size = size;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getID() {
        return id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "ID: " + id +
                " - Name: " + name +
                ", Alter: " + age +
                " Jahre, Größe: " + size +
                "m, Gewicht: " + weight + "kg";
    }
}
