package patric.week07.DynamischeDatenstrukturen;

import java.util.Random;
import java.util.Vector;

public class VectorErstellen {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> num = new Vector<>();

        for (int i = 0; i < 20; i++) {

            num.add(random.nextInt(1, 99));
        }

        System.out.println(num);
    }






}

