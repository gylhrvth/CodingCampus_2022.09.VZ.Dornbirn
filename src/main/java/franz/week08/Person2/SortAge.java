package franz.week08.Person2;

import java.util.Comparator;

public class SortAge implements Comparator<Person2> {
    @Override
    public int compare(Person2 c, Person2 d) {
        return c.getAge() - d.getAge();
    }
}
