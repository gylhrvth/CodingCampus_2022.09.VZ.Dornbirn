package viktor.week07;

import java.util.Comparator;

public class SortWeight implements Comparator<PersonTwoPointNull> {

    public int compare(PersonTwoPointNull p1, PersonTwoPointNull p2){
        return p1.getWeight() - p2.getWeight();
    }

}
