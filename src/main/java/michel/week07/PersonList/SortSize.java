package michel.week07.PersonList;

import viktor.week07.PersonTwoPointNull;

import java.util.Comparator;

public class SortSize implements Comparator<Person> {

    public int compare(Person a, Person b) {
        return a.getSize() - b.getSize();

    }
}
