package stefan.ExampleProjekt;

import java.util.ArrayList;
import java.util.List;

public class HausSimulation {


    public static void main(String[] args) {
        List<Haus> hausList = new ArrayList<>();

        Haus hause1 = new Haus("Sulz", 4, 10);
        Haus hause2 = new Haus("Feldkirch", 10, 20);

        hausList.add(hause1);


        List<Person> personlist = new ArrayList<>();


        Person p1 = new Person("Anita", 45);
        Person p2 = new Person("Klaus", 20);
        Person p3 = new Person("Peter", 29);


        personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);


        Aufgaben auf1 = new Aufgaben("Fenster Putzen");
        Aufgaben auf2 = new Aufgaben("Renovieren");

        hause1.addAufgaben(auf1);
        hause1.addAufgaben(auf2);
        hause1.addPersonlist(p1);

        System.out.println("Haus1");
        System.out.println(hause1);
        System.out.println(p1);

    }
}