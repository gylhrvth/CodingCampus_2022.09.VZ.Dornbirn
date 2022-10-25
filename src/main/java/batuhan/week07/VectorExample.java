package batuhan.week07;


import java.util.Random;
import java.util.Vector;

public class VectorExample {
    private static Random rand = new Random();

    public static void main(String[] args) {
        Vector<Integer> value = new Vector<>();
        for (int i = 0; i < 20; i++) {
            value.add(rand.nextInt(99));
        }

        System.out.println(value);
        System.out.println("1. Zählen der geraden Zahlen: " + countEvenNumber(value));
        System.out.println("2. Suchen nach der kleinstens Zahl: " + smallstNumber(value));
        System.out.println("3. Suchen nach der größten Zahl: " + largestNumber(value));
        bubblesort(value);
        deleteEvenNumber(value);
        System.out.println(value);


    }


    public static int countEvenNumber(Vector<Integer> v) {
        int count = 0;
        for (Integer value : v) {
            if (value % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    public static Integer smallstNumber(Vector<Integer> x) {
        int min = x.get(0);
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) < min) {
                min = x.get(i);
            }

        }
        return min;
    }

    public static Integer largestNumber(Vector<Integer> x) {
        int max = x.get(0);
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) > max) {
                max = x.get(i);
            }

        }
        return max;
    }

    public static void bubblesort(Vector<Integer> x) {
        int value = x.get(0);
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.size() - 1; j++) {
                if (x.get(j) < x.get(j + 1)) {
                    int temp = x.get(j);
                    x.set(j, x.get(j + 1));
                    x.set(j + 1, temp);

                }


            }

        }
        System.out.println("4. Sortiere absteigend: " + x);

    }

    public static void deleteEvenNumber(Vector<Integer> v) {

        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 != 0){
                v.remove(i);
                --i;
            }

        }


    }
}
