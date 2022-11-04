package mase.week08.Person;



import mase.week08.Person.Person2;
import mase.week08.Person.SortAge;
import mase.week08.Person.SortHeight;
import mase.week08.Person.SortName;
import mase.week08.Person.SortWeight;
import michel.week07.PersonList.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Person2Obj {

    private enum Criteria{
        weight,
        age,
        height,
        name,
    }
    public static void main(String[] args) {


        System.out.println("======ÄPFEL SIND BESSER WIE FENSTER====");
        List<Person2> persons = new Vector<>();
        Person2 mike = new Person2(2.02f, 28, "Mike Suter", 70);
        Person2 patric = new Person2(1.90f, 42, "Patric Boso", 90);
        Person2 gyula = new Person2(2.20f, 20, "Gyula Horvath", 50);
        persons.add(mike);
        persons.add(gyula);
        persons.add(patric);
        System.out.println(persons);
        getMaxMinAvgSize(persons);
        System.out.println("======ÄPFEL SIND BESSER WIE FENSTER====");
        getMinMaxAvgAge(persons);
        getMinMaxAvgWeight(persons);
        sortPerson(persons,Criteria.age);

    }
    public static void sortPerson(List<Person2> l, Criteria sortAfter) {
        switch (sortAfter) {
            case name -> Collections.sort(l,new SortName());
            case age -> Collections.sort(l,new SortAge());
            case height -> Collections.sort(l,new SortHeight());
            default -> Collections.sort(l,new SortWeight());
        }
    }
public static void sort(List<Person2> l, Criteria sortAfter){
    if (sortAfter == Criteria.age) {
        //nach alter sortieren
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getAge();
            if (min.getAge() > e.getAge()) {
                min = e;
            }
            if (max.getAge() < e.getAge()) {
                max = e;
            }
        }
        System.out.println(Criteria.age);
    } else if (sortAfter == Criteria.weight) {
        //nach gewicht sortieren
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getSize();
            if (min.getSize() > e.getSize()) {
                min = e;
            }
            if (max.getSize() < e.getSize()) {
                max = e;
            }
        }
        System.out.println(Criteria.weight);
    } else {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getWeight();
            if (min.getWeight() > e.getWeight()) {
                min = e;
            }
            if (max.getWeight() < e.getWeight()) {
                max = e;
            }
        }
        System.out.println(Criteria.height);

    }
}
    public static void getMaxMinAvgSize(List<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getSize();
            if (min.getSize() > e.getSize()) {
                min = e;
            }
            if (max.getSize() < e.getSize()) {
                max = e;
            }
        }
        double avg = sum / l.size();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("AVG: " + avg);
    }

    public static void getMinMaxAvgAge(List<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getAge();
            if (min.getAge() > e.getAge()) {
                min = e;
            }
            if (max.getAge() < e.getAge()) {
                max = e;
            }
        }
        double avg = sum / l.size();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("AVG: " + avg);
    }

    public static void getMinMaxAvgWeight(List<Person2> l) {
        Person2 min = l.get(0);
        Person2 max = l.get(0);
        double sum = 0;
        for (Person2 e : l) {
            sum += e.getWeight();
            if (min.getWeight() > e.getWeight()) {
                min = e;
            }
            if (max.getWeight() < e.getWeight()) {
                max = e;
            }
        }
        double avg = sum / l.size();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("AVG: " + avg);
    }

}
