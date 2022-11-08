package stefan.week07.SortEmu;


import stefan.week07.Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class PersonsimutationV2 {
    public enum Personensort {
        Weight,
        Age,
        Height,
    }

    public static void main(String[] args) {
        for (Personensort people : Personensort.values()) {
            sort(new ArrayList<>(),people);
        }
        sort(new ArrayList<>(), Personensort.Age);

    }

    public static void sort(List<Person> people, Personensort sortAfter) {
        switch (sortAfter) {
            case Age -> System.out.println("Sorting after age");
        }
    }

    public static int coamparePersonByCriteria(Person lhs, Person rhs, Personensort people) {
        if (people == Personensort.Age) {
           return lhs.getAge()- rhs.getAge();
        }

    throw new UnsupportedOperationException();
    }
}
