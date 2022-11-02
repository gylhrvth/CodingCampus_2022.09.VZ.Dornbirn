package berna.week07.Person;

import java.util.Comparator;

public class PersonCompBySize implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("Ich vergleiche nach Größe " + o1.getName() + " und " + o2.getName());
        return o1.getSize() - o2.getSize();
    }
}
