package patric.week07.Person;

public class Person {
    public double size;
    public int age;
    public String name;
    public float weight;

    public Person(String name, int age, double size, float weight) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String toString() {
        return "Mein Name ist " + name + " Ich bin " + age + " Jahre alt " + "Ich bin " + size + " groß, " + "und wiege " + weight + "kg";
    }

}
