package viktor.week07;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class SortByHeightAgeWeight {

    enum sortingBy {height, age, weight, name}


    public static void sort(ArrayList<PersonTwoPointNull> list, sortingBy b) {

        switch (b) {
            case height:
                Collections.sort(list, new SortHeight());
                break;
            case age:
                Collections.sort(list,new SortAge());
                break;
            case weight:
                Collections.sort(list,new SortWeight());
                break;
            case name:
                Collections.sort(list, new SortName());
        }
        System.out.println(list);

    }


    public static void main(String[] args) {

        ArrayList<PersonTwoPointNull> list = new ArrayList<>();

        PersonTwoPointNull p1 = new PersonTwoPointNull(180, 45, "Peter", 80);
        PersonTwoPointNull p2 = new PersonTwoPointNull(190, 40, "Jörg", 85);
        PersonTwoPointNull p3 = new PersonTwoPointNull(200, 50, "Johanna", 95);
        PersonTwoPointNull p4 = new PersonTwoPointNull(165, 35, "Stephan", 65);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        sort(list,sortingBy.name);

    }
}
