package berna.week08.Person2;


public class Person {
    //props

    public int size;
    public int age;
    public String name;
    public int weight;


    public Person(String name, int age, int size, int weight) {

        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
    }


    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return getName() +
                ", age " + getAge() +
                ", size " + getSize() +
                ", weight " + getWeight() + "\n";
    }
}
