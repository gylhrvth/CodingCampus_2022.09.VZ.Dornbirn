package mase.week08.Person;

import java.util.Comparator;

public class SortWeight implements Comparator<Person2> {
    public int compare(Person2 a, Person2 b){return a.getWeight()-b.getWeight();}
}
