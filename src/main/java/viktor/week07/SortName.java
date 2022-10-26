package viktor.week07;

import java.util.Comparator;

public class SortName implements Comparator<PersonTwoPointNull> {

    public int compare(PersonTwoPointNull p1, PersonTwoPointNull p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
