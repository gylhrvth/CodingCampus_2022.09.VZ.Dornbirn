package stefan.ExampleProjekt;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Aufgaben> aufgabens = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addPeson() {
        addPeson();
    }

    @Override
    public String toString() {
        return "Person: " + "\n" +
                "Name: " + name + "\n" +
                "Alter:" + age;
    }

    public void toJobs() {
        for (Aufgaben a : aufgabens) {

        }
        System.out.println("Person:"+name);
    }

}
