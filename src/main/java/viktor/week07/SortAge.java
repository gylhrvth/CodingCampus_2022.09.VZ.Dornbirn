package viktor.week07;

import java.util.Comparator;

public class SortAge implements Comparator<PersonTwoPointNull> {
    public int compare(PersonTwoPointNull a, PersonTwoPointNull b){
        return a.getAge() - b.getAge();
    }
}
