package fatima.week06.Person;

public class Person {

    private int height;
    private int age;
    private String firstname;
    private String lastname;
    private int weight;

    public Person(String firstname, String lastname, int age, int height, int weight) {
        this.height = height;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return firstname + " " + lastname + " (" + age + ")" + " is " + height + " cm tall and weighs " + weight + " kg.";
    }
}
