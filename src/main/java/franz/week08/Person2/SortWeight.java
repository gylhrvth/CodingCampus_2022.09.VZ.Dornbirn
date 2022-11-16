package franz.week08.Person2;

import java.util.Comparator;

public class SortWeight implements Comparator<Person2> {

    @Override
    public int compare(Person2 p1, Person2 p2) {

        return (int) (p1.getHeight() - p2.getWeight());
    }
}
