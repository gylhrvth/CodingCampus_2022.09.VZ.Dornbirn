package franz.week06.objekt.Person.ExamplePerson;

import org.jetbrains.annotations.NotNull;

public class ExamplePerson {
    private String name;
    private int age;
    private Gender gender;
    private House house;

    public ExamplePerson(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return
                "Name: " + name +
                        " Alter: " + age +
                        " Geschlecht: " + gender;
    }


}
