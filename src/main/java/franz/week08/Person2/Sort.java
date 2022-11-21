package franz.week08.Person2;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    enum sortingBy {height, age, name, weight}

    public static void sort(ArrayList<Person2> list, sortingBy b) {
        switch (b) {
            case height -> Collections.sort(list, new SortHeight());

        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayList<Person2> list = new ArrayList<>();

        Person2 p1 = new Person2(180, 45, "Peter", 80);
        Person2 p2 = new Person2(190, 19, "Person_09", 90);
        Person2 p3 = new Person2(180, 18, "Person_08", 80);
        Person2 p4 = new Person2(170, 17, "Person_07", 70);
        Person2 p5 = new Person2(160, 16, "Person_06", 60);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);


        sort(list, sortingBy.height);
    }
}

