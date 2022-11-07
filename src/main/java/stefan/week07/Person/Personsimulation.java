package stefan.week07.Person;

import fatima.week06.Person.PersonSimulation;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class Personsimulation {

    public static void main(String[] args) {
        List<Person> persons = new Vector<>();
        Person p1 = new Person(63, 100, 55, "Silber", "Black");
        Person p2 = new Person(55, 175, 99, "Daniel", "Nudel");
        Person p3 = new Person(44, 180, 80, "Thomas", "Gugus");
        Person p4 = new Person(33, 210, 87, "Anna", "Lang");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println();

       printline("X",80);
        maxAge(persons);
        printline("X", 80);
        maxMinHeigh(persons);
        printline("X", 80);
        minMaxWeight(persons);

    }

    public static void maxAge(List<Person> a) {
        Person max = a.get(0);
        Person min = a.get(0);
        int sum = 0;
        for (Person x : a) {
            sum += x.getAge();
            if (min.getAge() > x.getAge()) {
                min = x;
            }
            if (max.getAge() < x.getAge()) {
                sum += x.getAge();
            }

        }
        int age = sum / a.size();
        System.out.println("Age sort");
        System.out.println("Older person: " + max);
        System.out.println("younger: " + min);
        System.out.println("Average: " + age);

    }

    public static void maxMinHeigh(List<Person> h) {
        Person max = h.get(0);
        Person min = h.get(0);
        int sum = 0;
        for (Person x : h) {
            sum += x.getHeight();
            if (min.getHeight() > x.getHeight()) {
                min = x;

            }
            if (max.getHeight() < x.getHeight()) {
                max = x;

            }
        }
        int heigh = sum / h.size();
        System.out.println("Heigh sort");
        System.out.println("Biggest: " + max);
        System.out.println("smallest:" + min);
        System.out.println("Average: " + heigh);
    }

    public static void minMaxWeight(List<Person> a) {
        Person max = a.get(0);
        Person min = a.get(0);
        int sum = 0;
        for (Person x : a) {
            sum += x.getWeight();
            if (min.getWeight() > x.getWeight()) {
                min = x;
            }
            if (max.getWeight() < x.getWeight()) {
                max = x;
            }
        }
        int weight = sum / a.size();
        System.out.println("Weight sort");
        System.out.println("Max Weight: " + max);
        System.out.println("Min Weight: " + min);
        System.out.println("Average:" + weight);
    }

    public static void printline(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();
    }
}

