package franz.week08.Person2;

public class Person2 {
    private int height;
    private int age;
    private String name;
    private int weight;


    public Person2(int height, int age, String name, int weight) {

        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
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


    public String toString() {
        return "Height:" + height + "| Age:" + age + "| Name:" + name + "| Weight:" + weight;
    }

}