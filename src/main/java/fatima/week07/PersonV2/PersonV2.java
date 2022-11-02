package fatima.week07.PersonV2;

public class PersonV2 {

    private int height;
    private int age;
    private String firstname;
    private String lastname;
    private int weight;

    public PersonV2(String firstname, String lastname, int age, int height, int weight) {
        this.height = height;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
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

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return  firstname + " " +
                lastname + " (" +
                "age: " + age + ", " +
                "height: " + height + " cm" + ", " +
                "weight: " + weight + " kg)";
    }
}
