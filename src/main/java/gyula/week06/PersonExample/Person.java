package gyula.week06.PersonExample;

public class Person {

    private static int lastID = 1;

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String place;
    private double distance;

    public Person(String firstName, String lastName){
        id = lastID;
        ++lastID;
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
        place = "Wien";
        distance = 0.0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  id +
                ": Ich bin " +
                firstName +
                " " +
                lastName +
                " aus " +
                place +
                " und bin " +
                age +
                " Jahre alt.";
    }
}
