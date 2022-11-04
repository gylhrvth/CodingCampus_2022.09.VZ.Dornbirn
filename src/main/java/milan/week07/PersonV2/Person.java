package milan.week07.PersonV2;

import java.util.Vector;

public class Person {

    private int height;
    private int age;
    private String firstname;
    private String lastname;
    private int weight;

    public Person(String firstname, String lastname, int age, int height, int weight) {
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person:" +
                " Vorname: " + firstname +
                ", Nachname: " + lastname +
                ", Alter: " + age +
                ", Größe: " + height +
                ", Gewicht: " + weight;
    }
}
