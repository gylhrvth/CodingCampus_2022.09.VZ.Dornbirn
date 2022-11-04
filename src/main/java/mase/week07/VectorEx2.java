package mase.week07;

import java.util.Random;
import java.util.Vector;

public class VectorEx2 {
    public static Random randy = new Random();

    public static void main(String[] args) {

        Vector<Integer> ints = new Vector<>();

        for (int i = 0; i < 20; i++) {
            int random = randy.nextInt(0, 100);
            ints.add(i, random);
        }

        Vector<Integer> one = generateRandomVector(20);
        Vector<Integer> two = generateRandomVector(20);
        sortNum(two);
        sortNum(one);
        System.out.println(one);
        System.out.println(two);
        Vector<Integer> three = merge(one, two);
        System.out.println(three);
        System.out.println("========MERGE=========");
        System.out.println(ints);
        evenNum(ints);
        minNum(ints);
        System.out.println("Die maximal Zahl ist :" + maxNum(ints));
        sortNum(ints);
        System.out.println(ints);
        deleteNum(ints);

        System.out.println(ints);
    }

    public static void evenNum(Vector<Integer> ints) {
        int count = 0;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {
                count++;

            }
        }
        System.out.println("Anzahl der geraden Zahlen : " + count);
    }

    public static int minNum(Vector<Integer> ints) {
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) < minvalue)
                minvalue = ints.get(i);
        }
        System.out.println("Die kleinste NR: " + minvalue);
        return minvalue;
    }

    public static int maxNum(Vector<Integer> ints) {
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) > maxvalue)
                maxvalue = ints.get(i);
        }
        return maxvalue;
    }

    public static void sortNum(Vector<Integer> ints) {
        for (int i = 1; i < ints.size(); i++) {
            for (int j = 0; j < ints.size() - i; j++) {
                if (ints.get(j) < ints.get(j + 1)) {
                    int value = ints.get(j);
                    ints.set(j, ints.get(j + 1));
                    ints.set(j + 1, value);
                }
            }
        }
    }


    public static void deleteNum(Vector<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 != 0) {
                ints.remove(i);
                i--;
            }
        }
        System.out.println(ints);
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
            while (indexA < one.size()) {
                result.add(one.get(indexA));
                indexA++;
            }
            while (indexB < two.size()) {
                result.add(two.get(indexB));
                indexB++;
            }

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

}