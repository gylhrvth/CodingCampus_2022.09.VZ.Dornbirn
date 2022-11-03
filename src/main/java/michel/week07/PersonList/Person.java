package michel.week07.PersonList;

public class Person {
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    private final String name;
    private final int size;
    private final int age;
    private final double weight;

    public Person(String name, int size, int age, double weight) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return "\tName: " + name
                + "\tGröße: " + size
                + "\tAlter: " + age
                + "\tGewicht: " + weight + " kg\n";
    }
}
