package berna.week06.PersonExample;

public class Person {

    //attributes

    private int size;
    private int age;
    private String name;
    private int weight;

    //Constructor

    public Person(String name, int age, int size, int weight){
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
    }

    //methods

    @Override
    public String toString (){
        return "Personal data: " + "\n" +
                "name: " +name + "\n" +
                "age: " + age + "\n" +
                "size: " +name + "\n" +
                "wieght: " +name + "\n" ;

    }

}
