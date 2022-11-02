package mase.week06;

public class PersonObject {
    public static void main(String[] args) {
        Person mike = new Person("Mike Suter", 29,1.83,50);
        Person berna = new Person("Berna Köchle", 20,1.91,46);
        Person lukas = new Person("Lukas", 25,2.01,70);
        Person patric = new Person("Patric Boso", 20,2.08,150);
        System.out.println(patric);
        mike.setAge(28);
        mike.getAge();
        System.out.println(lukas);
        System.out.println(mike);
        System.out.println(berna);
    }
}
