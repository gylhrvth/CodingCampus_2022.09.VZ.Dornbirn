package michel.week07.PersonList;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class PersonSimulation {
    public static void main(String[] args) {

        List<Person> l1 = new Vector<>();
        Person p1 = new Person("Masena", 178, 23, 78);
        Person p2 = new Person("Patric", 177, 36, 79.5);
        Person p3 = new Person("Martin", 183, 26, 73.5);
        Person p4 = new Person("Franky", 180, 30, 92.5);
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);
        getMinMaxAvgPersonSize(l1);
        getMinMaxAvgPersonAge(l1);
        getMinMaxAvgPersonWeight(l1);
        sort(l1, PersonCriteria.name);
        System.out.println(l1);
    }
    public enum PersonCriteria {
        name,
        size,
        age,
        weight
    }
    public static void sort(List<Person> l, PersonCriteria sortAfter) {
        switch (sortAfter) {
            case name -> Collections.sort(l, new SortName());
            case age -> Collections.sort(l, new SortAge());
            case size -> Collections.sort(l, new SortSize());
            default -> Collections.sort(l, new SortWeight());
        }
    }
    public static void getMinMaxAvgPersonSize(List<Person> l) {
        Person min = l.get(0);
        Person max = l.get(0);
        double sum = 0;
        for (Person p : l) {
            sum += p.getSize();
            if (min.getSize() > p.getSize()) {
                min = p;
            }
            if (max.getSize() < p.getSize()) {
                max = p;
            }
        }
        double avg = sum / l.size();
        System.out.println("Min Max Avg of sizes:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of sizes: %5.3f%n \n", avg);
    }
    public static void getMinMaxAvgPersonAge(List<Person> l) {
        Person min = l.get(0);
        Person max = l.get(0);
        double sum = 0;
        for (Person p : l) {
            sum += p.getAge();
            if (min.getAge() > p.getAge()) {
                min = p;
            }
            if (max.getAge() < p.getAge()) {
                max = p;
            }
        }
        double avg = sum / l.size();
        System.out.println("Min Max Avg of ages:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of ages: %5.3f%n\n", avg);
    }
    public static void getMinMaxAvgPersonWeight(List<Person> l) {
        Person min = l.get(0);
        Person max = l.get(0);
        double sum = 0;
        for (Person p : l) {
            sum += p.getWeight();
            if (min.getWeight() > p.getWeight()) {
                min = p;
            }
            if (max.getWeight() < p.getWeight()) {
                max = p;
            }
        }
        double avg = sum / l.size();
        System.out.println("Min Max Avg of weights:");
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Avg of weights: %5.3f%n\n", avg);
    }
}
