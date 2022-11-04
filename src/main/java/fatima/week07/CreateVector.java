package fatima.week07;

import java.util.*;


public class CreateVector {
    private static Random rand = new Random();

    public static void main(String[] args) {
        Vector<Integer> numbers = createRandomVector(20);
        System.out.println(numbers);
        System.out.println("total number of even numbers: " + countEvenNumbers(numbers));
        System.out.println("min: " + searchMin(numbers));
        System.out.println("max: " + searchMax(numbers));

        System.out.print("sorted (desc): ");
        sortDescending(numbers);

        System.out.print("odd numbers removed: ");
        removeOddNumbers(numbers);
    }

    public static Vector<Integer> createRandomVector(int size) {
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt(100));
        }
        return result;
    }

    private static int countEvenNumbers(Vector<Integer> v) {
        int count = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int searchMin(Vector<Integer> v) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) < min) {
                min = v.get(i);
            }
        }
        return min;
    }

    private static int searchMax(Vector<Integer> v) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) > max) {
                max = v.get(i);
            }
        }
        return max;
    }

    public static void sortDescending(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size() - 1; j++) {
                if (v.get(j) < v.get(j + 1)) {
                    int temp = v.get(j);
                    v.set(j, v.get(j + 1));
                    v.set(j + 1, temp);
                }
            }
        }
        System.out.println(v);
    }

    private static void removeOddNumbers(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 != 0) {
                v.remove(i);
                --i;
            }
        }
        System.out.println(v);
    }
}

