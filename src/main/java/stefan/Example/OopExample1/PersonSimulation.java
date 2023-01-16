package stefan.Example.OopExample1;

import java.util.ArrayList;
import java.util.List;

public class PersonSimulation {

    public static void main(String[] args) {
        List<Person> personlist2 = new ArrayList<>();
        Person person1 = new Person("Sahra",12, Person.Geslecht.DIVERSE);
        Person person2 = new Person("Tom",33 , Person.Geslecht.DIVERSE);
        Person person3 = new Person("Anna",44 , Person.Geslecht.FEMALE);
        Person person4 = new Person("Martin",15, Person.Geslecht.FEMALE);
        Person person5 = new Person("Alex", 55,Person.Geslecht.MALE);
        Person person6 = new Person("john",75, Person.Geslecht.MALE);
        personlist2.add(person1);
        personlist2.add(person2);
        personlist2.add(person3);
        personlist2.add(person4);
        personlist2.add(person5);
        personlist2.add(person6);
        System.out.println(personlist2);
    }


}
