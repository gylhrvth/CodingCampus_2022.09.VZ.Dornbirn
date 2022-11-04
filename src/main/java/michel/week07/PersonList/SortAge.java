package michel.week07.PersonList;


import java.util.Comparator;

public class SortAge implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getAge() - b.getAge();
    }
}
