package stefan.week07;

import java.util.Random;
import java.util.Vector;

public class VectorErstellen {
    public static void main(String[] args) {
       int size=100;


        Vector<Integer>name= rondomVector(size);
        System.out.println(name);
    }

    public static Vector<Integer> rondomVector(int size) {
        Random randy = new Random();
        Vector<Integer> name = new Vector<>();
        for (int i = 0; i <size ; i++) {
            name.add(randy.nextInt(100));
        }
    return name;
    }
}
