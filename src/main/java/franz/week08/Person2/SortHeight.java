package franz.week08.Person2;

import java.util.Comparator;

public class SortHeight implements Comparator<Person2> {

    public int compare(Person2 a, Person2 b) {
        return a.getHeight() - b.getHeight();
    }
}
