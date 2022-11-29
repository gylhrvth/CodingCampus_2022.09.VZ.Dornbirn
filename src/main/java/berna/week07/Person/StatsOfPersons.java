package berna.week07.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class StatsOfPersons {

    private Vector<Person> list;

    public StatsOfPersons() {
        this.list = new Vector<>();
    }

    public Vector<Person> addPerson(Person... personList) {
        for (Person p : personList) {
            list.add(p);
        }
        return list;
    }
    public Person getMinSize2() {
        return Collections.min(list, new PersonCompBySize());
    }

    public void sortBySize(){
        list.sort(new PersonCompBySize());
        System.out.println(list);
    }
    //2.11.22 TODO: sortByAge, sortByWeight


    public Person getMinSize() {
        Person smallest = null;
        for (Person p : list) {
            if (smallest == null || smallest.getSize() > p.getSize()) {
                smallest = p;
            }
        }
        return smallest;
    }

    public Person getMaxSize() {
        Person bestPerson = null;
        for (Person p : list) {
            if (bestPerson == null || p.getSize() > bestPerson.getSize()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public Person getMaxSize2() {
        return Collections.max(list, new PersonCompBySize());
    }

    public Person getMaxAge() {
        Person bestPerson = null;
        for (Person p : list) {
            if (bestPerson == null || p.getAge() > bestPerson.getAge()) {
                bestPerson = p;
            }
        }
        return bestPerson;
    }

    public Person getMinAge() {
        Person youngest = null;
        for (Person p : list) {
            if (youngest == null || p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        return youngest;
    }

    public Person getMinWeight() {
        Person lightest = null;
        for (Person p : list) {
            if (lightest == null || p.getWeight() < lightest.getWeight()) {
                lightest = p;
            }
        }
        return lightest;
    }

    public Person getMaxWeight() {
        Person heaviest = null;
        for (Person p : list) {
            if (heaviest == null || p.getWeight() > heaviest.getWeight()) {
                heaviest = p;
            }
        }
        return heaviest;
    }

    public int getAvgAge() {
        int sum = 0;
        for (Person p : list) {
            sum = sum + p.getAge();
        }
        return sum / list.size();
    }

    public int getAvgSize() {
        int sum = 0;
        for (Person p : list) {
            sum = sum + p.getSize();
        }
        return sum / list.size();
    }

    public int getAvgWeight() {
        int sum = 0;
        for (Person p : list) {
            sum = sum + p.getWeight();
        }
        return sum / list.size();
    }

    @Override
    public String toString() {
        return "\n Some statistics: " + "\n" + "\n" +
                "youngest: " + getMinAge().getName() + " (age:" + getMinAge().getAge() + ")\n" +
                "oldest: " + getMaxAge().getName() + " (age:" + getMaxAge().getAge() + ")\n" +
                "smallest: " + getMinSize().getName() + " (size:" + getMinSize().getSize() + ")\n" +
                "tallest: " + getMaxSize().getName() + " (size:" + getMaxSize().getSize() + ")\n" +
                "lightest: " + getMinWeight().getName() + " (weight:" + getMinWeight().getWeight() + ")\n" +
                "heaviest: " + getMaxWeight().getName() + " (weight:" + getMaxWeight().getWeight() + ")\n" +
                "\n" +
                "average age: " + getAvgAge() + "\n" +
                "average size: " + getAvgSize() + "\n" +
                "average weight: " + getAvgWeight() + "\n";

    }
}
