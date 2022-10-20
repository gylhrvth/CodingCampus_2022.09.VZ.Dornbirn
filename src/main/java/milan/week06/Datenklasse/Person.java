package milan.week06.Datenklasse;

public class Person {

    private int height;

    private int age;

    private String firstname;

    private String lastname;

    private int weight;

    public Person(String firstname, String lastname, int height, int weight, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String toString() {
        return "Vorname: " + firstname + "\n" +
                "Nachname: " + lastname + "\n" +
                "Alter: " + age + " Jahre" + "\n" +
                "Größe: " + height + " cm" + "\n" +
                "Gewicht: " + weight + " kg" + "\n";

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
