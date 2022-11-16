package stefan.Test.OopExample1;

import java.util.ArrayList;
import java.util.List;

public class PersonSimulation {

    public static void main(String[] args) {
        List<Person> personlist2 = new ArrayList<>();
        Person person1 = new Person("Sahra", 30);
        Person person2 = new Person("Tom", 38);
        Person person3 = new Person("Anna", 23);
        Person person4 = new Person("Martin", 18);
        Person person5 = new Person("Alex", 9);
        Person person6 = new Person("john", 67);
        personlist2.add(person1);
        personlist2.add(person2);
        personlist2.add(person3);
        personlist2.add(person4);
        personlist2.add(person5);
        personlist2.add(person6);
        System.out.println("________________");
        allsleep(personlist2);
        System.out.println("________________");
        allefemale(personlist2);
        System.out.println("_________________");
        allemale(personlist2);
    }

    public static void allsleep(List<Person> personList) {
        for (Person p : personList) {
            p.schlafen();

        }
    }

    public static void allefemale(List<Person> personLis) {
        for (Person f : personLis) {
            f.female();
        }
    }
public static void allemale(List<Person>personList){
    for (Person p:personList) {
        p.male();
    }
}
}
