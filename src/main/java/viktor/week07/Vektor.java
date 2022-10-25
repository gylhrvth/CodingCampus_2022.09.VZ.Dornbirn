package viktor.week07;

import java.util.*;

public class Vektor {


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


    private static void sortDescAndPrint(Vector<Integer> v) {

        Comparator<Object> comparator = Collections.reverseOrder();
        Collections.sort(v, comparator);
        System.out.println("Desc: " + v);

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


    private static void deleteAllUnstraightNumbers(Vector<Integer> v) {

        int i = 0;

        while (i < v.size()) {

            if (v.get(i) % 2 != 0) {
                v.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Nur gerade Zahlen: " + v);

    }


    public static void main(String[] args) {


        Random random = new Random();
        Vector<Integer> num = new Vector<>();

        for (int i = 0; i < 20; i++) {

            num.add(random.nextInt(1, 99));
        }

        System.out.println(num);

        int counting = countingOfStraightNumbers(num);
        System.out.println("Zahl der geraden Zahlen: " + counting);
        System.out.println("Minimum: " + getMin(num));
        System.out.println("Maximum: " + getMax(num));
        sortDescAndPrint(num);
        deleteAllUnstraightNumbers(num);

    }
}
