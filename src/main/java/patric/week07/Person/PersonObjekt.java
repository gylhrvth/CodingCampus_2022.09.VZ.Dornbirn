package patric.week07.Person;

import mase.week06.Person;

public class PersonObjekt {
    public static void main(String[] args) {
        Person mike = new Person("Mike Suter", 29, 1.83, 50);
        Person berna = new Person("Berna Köchle", 20, 1.91, 46);
        Person lukas = new Person("Lukas", 25, 2.01, 70);
        mike.setAge(299);
        System.out.println(lukas);
        System.out.println(mike);
        System.out.println(berna);
    }
}
