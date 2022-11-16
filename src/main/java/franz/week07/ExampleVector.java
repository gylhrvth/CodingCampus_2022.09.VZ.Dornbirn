package franz.week07;

import java.util.Random;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {

        Random random = new Random();
        Vector<Integer> numVector = new Vector<>();

        for (int i = 0; i < 20; i++) {
            numVector.add(random.nextInt(1, 99));
        }
        System.out.println(numVector);
    }


}





