package milan.week07;

import java.util.Random;
import java.util.Vector;

public class VectorCreateV1 {
    public static void main(String[] args) {

        Vector<Integer> zahlen = vectorWithRandomNum(20);
        System.out.println(zahlen);

    }

    public static Vector<Integer> vectorWithRandomNum(int size) {

        Vector<Integer> zahlen = new Vector<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            zahlen.add(random.nextInt(100));
        }
        return zahlen;

    }
}
