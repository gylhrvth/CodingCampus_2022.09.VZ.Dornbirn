package franz.week07;

import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class ExampleMergeVector {
    private static Random rand = new Random();

    public static void main(String[] args) {
        Vector<Integer> v1 = generateRandomVector(100);
        v1.sort(Comparator.naturalOrder());
        Vector<Integer> v2 = generateRandomVector(100);
        v2.sort(Comparator.naturalOrder());
        System.out.println("V1:" + v1);
        System.out.println("V2:" + v2);

        Vector<Integer> v3 = merge(v1, v2);
        System.out.println("V3:" + v3);

    }

    public static Vector<Integer> merge(Vector<Integer> a, Vector<Integer> b) {
        Vector<Integer> result = new Vector<>();
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.size() && indexB < b.size()) {
            if (a.get(indexA) < b.get(indexB)) {
                result.add(a.get(indexA));
                ++indexA;
            } else {
                result.add(b.get(indexB));
                ++indexB;
            }
        }
        while (indexA < a.size()) {
            result.add(a.get(indexA));
            ++indexA;
        }
        while (indexB < b.size()) {
            result.add(b.get(indexB));
            ++indexB;
        }

        return result;
    }

    public static Vector<Integer> generateRandomVector(int size) {
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt(200));
        }
        return result;
    }

}
