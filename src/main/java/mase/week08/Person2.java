package mase.week08;

public class Person2 {

    private float size;
    private int age;
    private String name;
    private int weight;


    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person2(float size, int age, String name, int weight){
    this.size= size;
    this.age = age;
    this.name = name;
    this.weight = weight;
}

    @Override
    public String toString() {
        return "Hello I'm " + name +  " and I am " + age + " years old" + "\n "+"My size is " + size + "m" + " and my weight is " + weight + "kg";

    }
}
