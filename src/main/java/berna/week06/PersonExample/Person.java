package berna.week06.PersonExample;

public class Person {

    //attributes

    int size;
    int age;
    String name;
    int weight;

    //Constructor

    public Person(String name, int age, int size, int weight){
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
    }

    //methods

    public String toString (){
        return "Personal data: " + "\n" +
                "name: " +name + "\n" +
                "age: " + age + "\n" +
                "size: " +name + "\n" +
                "wieght: " +name + "\n" ;

    }

}
