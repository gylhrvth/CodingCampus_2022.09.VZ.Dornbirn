package patric.week07.DynamischeDatenstrukturen;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class VectorErstellenExtended {
    public static void main(String[] args) {
        Random random = new Random();
        Vector<Integer> num = new Vector<>();

        for (int i = 0; i < 20; i++) {

            num.add(random.nextInt(0, 100));
        }
        System.out.println(num);

        int counting = countingOfStraightNumbers(num);
        System.out.println("gerade Zahlen: " + counting);
        System.out.println("kleinste Zahl: " + getMin(num));
        System.out.println("grösste Zahl: " + getMax(num));
        sortVector(num);
        deleteUnstraightNumbers(num);
    }

    private static Integer countingOfStraightNumbers(Vector<Integer> v) {
        int count = 0;

        for (int i = 0; i < v.size(); i++) {

            if (v.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;

    }
    private static Integer getMin(Vector<Integer> v) {

        int min = v.get(0);
        if (min == 0) {
            return 0;
        } else {

            for (int i = 0; i < v.size(); i++) {

                if (min > v.get(i)) {
                    min = v.get(i);
                }
            }
            return min;
        }
    }
    private static Integer getMax(Vector<Integer> v) {
        int max = v.get(0);
        if (max == 0) {

            return 0;
        } else {

            for (int i = 0; i < v.size(); i++) {
                if (max < v.get(i)) {
                    max = v.get(i);
                }
            }
            return max;
        }
    }
    private static void sortVector(Vector<Integer> v) {

        Comparator<Object> comparator = Collections.reverseOrder();
        Collections.sort(v, comparator);
        System.out.println("abstigend Sortiert: " + v);

    }
    private static void deleteUnstraightNumbers(Vector<Integer> v) {

        int i = 0;

        while (i < v.size()) {

            if (v.get(i) % 2 != 0) {
                v.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Nur noch gerade Zahlen: " + v);

    }


}
