package gyula.week07;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
        /*
        Integer[] values = {1, 2, 3, 4, 5, 6};
        Vector<Integer> sizes = new Vector<>(Arrays.asList(values));
         */
        names.add("Alfred");
        names.add("Beatrix");
        names.add(0, "Zorro");

        System.out.println(names);
        for (String name : names){
            System.out.println("Name: " + name);
        }
        System.out.println("=======");
        for (int i = 0; i < names.size(); i++) {
            System.out.println( i +". Name: "  + names.get(i));
        }

        names.remove("Beatrix");
        names.remove(0);
        System.out.println(names);
    }
}
