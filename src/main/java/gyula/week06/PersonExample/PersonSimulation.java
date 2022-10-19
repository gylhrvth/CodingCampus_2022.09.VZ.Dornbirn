package gyula.week06.PersonExample;

public class PersonSimulation {
    public static void main(String[] args) {
        Person p1 = new Person("Gyula", "Horvath");
        Person p2 = new Person("Alfonso", "Albert");
        Person p3 = new Person("Beatrix", "Burkhard");
        p1.setAge(43);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        for (int i = 0; i < 10; i++) {
            Person p = new Person("Thomas", "Test" + i);
            System.out.println(p);
        }
    }
}
