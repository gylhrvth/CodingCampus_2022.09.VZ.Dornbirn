package michel.week07.PersonList;

import java.util.Comparator;

public class SortWeight implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return (int) (a.getWeight() - b.getWeight());
    }
}
