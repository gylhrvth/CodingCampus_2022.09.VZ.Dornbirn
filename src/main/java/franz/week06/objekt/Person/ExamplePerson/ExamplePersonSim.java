package franz.week06.objekt.Person.ExamplePerson;

import java.util.ArrayList;
import java.util.List;

public class ExamplePersonSim {
    public static void main(String[] args) {
        List<ExamplePerson> personList = new ArrayList<>();

        ExamplePerson p1 = new ExamplePerson("ZAlfons", 15, Gender.MALE);
        ExamplePerson p2 = new ExamplePerson("Barbara", 16, Gender.FEMALE);
        ExamplePerson p3 = new ExamplePerson("Claudi", 17, Gender.DIVERS);
        ExamplePerson p4 = new ExamplePerson("Detlef", 18, Gender.MALE);
        ExamplePerson p5 = new ExamplePerson("Elena", 19, Gender.FEMALE);
        ExamplePerson p6 = new ExamplePerson("Franzi", 20, Gender.DIVERS);
        House h1 = new SortedHouse(1, 1, "Haus 1");
        House h2 = new House(2, 2, "Haus 2");
        House h3 = new House(3, 3, "Hause 3");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);

        List<House> houseList = new ArrayList<>();
        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);

        printExamplePeople(personList);

        h1.addPerson(p1);
        h1.addPerson(p2);
        h2.addPerson(p3);
        h2.addPerson(p4);
        h3.addPerson(p5);
        h3.addPerson(p6);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

    public static void printExamplePeople(List<ExamplePerson> personList) {
        for (ExamplePerson p : personList) {
            System.out.println(p);
        }
    }
}


