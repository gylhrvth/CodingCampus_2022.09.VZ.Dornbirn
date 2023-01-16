package stefan.Example.OopExample1;

public class Person {

    private String name;
    private int age;
    private Geslecht geslecht;

    public enum Geslecht {
        FEMALE, MALE, DIVERSE;

    }

    public Person(String name, int age, Geslecht geslecht) {
        this.name = name;
        this.age = age;
        this.geslecht = geslecht;
    }

    public String getName() {
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
        return "Person: " +
                "name: " + name + " " +
                "  age: " + age +
                " Geschlecht: " + geslecht +
                " ";
    }

    public void addPeson() {
        addPeson();
    }

    public void schlafen() {


    }

    public Geslecht getGeslecht() {
        return geslecht;
    }

    public void setGeslecht(Geslecht geslecht) {
        this.geslecht = geslecht;
    }
}
