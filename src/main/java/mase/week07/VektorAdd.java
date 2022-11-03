package mase.week07;

import java.util.Random;
import java.util.Vector;

public class VektorAdd {
    private static Random randy = new Random();

    public static void main(String[] args) {
        Vector<Integer> a = generateRandomVector(20);
        sortVector(a);
        System.out.println(a);
        Vector<Integer> b = generateRandomVector(20);
        sortVector(b);
        System.out.println(b);
        Vector<Integer> c = merge(a, b);
        System.out.println(c);
    }

    public static Vector<Integer> merge(Vector<Integer> one, Vector<Integer> two) {
        Vector<Integer> result = new Vector<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < one.size() && indexB < two.size()) {
            if (one.get(indexA) < two.get(indexB)) {
                result.add(one.get(indexA));
                indexA++;
            } else {
                result.add(two.get(indexB));
                indexB++;
            }
        }
            while (indexA < one.size()) {
                result.add(one.get(indexA));
                indexA++;
            }
            while (indexB < two.size()) {
                result.add(two.get(indexB));
                indexB++;
            }


        return result;
    }

    public static Vector<Integer> generateRandomVector(int generate) {
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < generate; i++) {
            result.add(randy.nextInt(100));
        }
        return result;
    }
    public static void sortVector(Vector<Integer>sort){
        for (int i = 1; i < sort.size(); i++) {
            for (int j = 0; j < sort.size() - i; j++) {
                if (sort.get(j) < sort.get(j + 1)) {
                    int value = sort.get(j);
                    sort.set(j, sort.get(j + 1));
                    sort.set(j + 1, value);
                }
            }
        }
    }
}
