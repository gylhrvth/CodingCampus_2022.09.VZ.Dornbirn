package stefan.Test.OopExample1;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;

    public enum person {
        female,
        male,
        diverse;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        System.out.println("Seine Name ist");
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println(" Alter ist " + age);
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void addPeson() {
        addPeson();
    }

    public void schlafen() {
        System.out.println(name + "\t Schläft ");
    }

    public void female() {
        System.out.println(name + "\t ist \t" + person.female);
    }
public void male(){
    System.out.println(name +"\t ist \t"+person.male);
}
}
