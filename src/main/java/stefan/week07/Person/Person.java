package stefan.week07.Person;

public class Person {

    private int age;
    private int height;
    private int weight;
    private String name;
    private String lastName;

    public Person(int age ,int height,int weight, String name,String lastName) {

        this.age = age;
        this.height = height;
        this.weight=weight;
        this.name = name;
        this.lastName = lastName;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
@Override
    public String toString() {
        return "\tfirstname: "+name+"\tLastname: "+lastName+"\tAge:"+age+"\tHeight:"+height+"\tWeight: "+weight+"\n";
    }
}
