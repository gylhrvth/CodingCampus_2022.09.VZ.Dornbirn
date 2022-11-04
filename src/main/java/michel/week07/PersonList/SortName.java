package michel.week07.PersonList;

import java.util.Comparator;

public class SortName implements Comparator<Person> {
    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}
