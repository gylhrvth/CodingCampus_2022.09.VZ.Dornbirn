package michel.week05.PersonExample;

public class PersonSimulation {
    public static void main(String[] args) {
        Person p1 = new Person(1.78,23,"Jungspund Mase",80);
        Person p2 = new Person(1.66,44,"Patric Star",124);
        p1.setSize(2.20);
        p1.setWeight(65);
        p1.setName("Almöhe");
        System.out.println(p1);
        System.out.println(p2);
    }


}
