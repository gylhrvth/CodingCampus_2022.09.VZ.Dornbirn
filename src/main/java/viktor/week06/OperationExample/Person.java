package viktor.week06.OperationExample;

public class Person {

    private int height;
    private int age;
    private String name;
    private int weight;

    public Person(){

    }

    public Person(int height){
        this(height,0," ",0);
    }

    public Person(int height, int age){
        this(height,age," ",0);
    }

    public Person(int height, int age, String name, int weight ){

        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String toString(){

        return "Height: " + height + "\n" +
                "Age: " + age + "\n" +
                "Name: " + name + "\n" +
                "Weight: " + weight + "\n";
    }
}
