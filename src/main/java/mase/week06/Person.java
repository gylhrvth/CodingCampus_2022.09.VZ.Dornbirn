package mase.week06;

public class Person {
    public double size;
    public int age;
    public String name;
    public float weight;

public Person(String name,int age,double size,float weight){
    this.name = name;
    this.age = age;
    this.size = size;
    this.weight = weight;
}

public int getAge(){
    System.out.println(age);
    return age;
}
public void setAge(int age){
    this.age = age;

}
public String toString(){
    return "Mein Name ist " + name + " Ich bin " + age + " Jahre alt " + "Ich bin " + size + " groß, " + "und wiege " + weight + "kg";
}

}
