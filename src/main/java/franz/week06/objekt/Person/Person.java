package franz.week06.objekt.Person;

public class Person {
    private int size;
    private int age;
    private String name;
    private int weight;


    public Person(int size, int age, String name, int weight) {

        this.size = size;
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    public int getSize() {
        return size;
    }

    public int getage() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getweight() {
        return weight;
    }

    public String toString() {
        return size + " " + age + " " + name + " " + weight;
    }
}
