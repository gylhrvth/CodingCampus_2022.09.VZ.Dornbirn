package viktor.week07;

import java.util.ArrayList;

public class PersonTwoPointNull {

    private int height;
    private int age;
    private String name;
    private int weight;


    public PersonTwoPointNull(int height, int age, String name, int weight){
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }



    public int getHeight(){
        return height;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "\tHeight: " + height + " \t Age: " + age + " \t Name: " + name + " \t Weight: " + weight + "\n";
    }




}
