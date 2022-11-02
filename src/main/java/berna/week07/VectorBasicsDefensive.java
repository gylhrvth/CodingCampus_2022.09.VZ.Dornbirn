package berna.week07;

import com.sun.jdi.event.VMDeathEvent;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VectorBasicsDefensive {
    /* make it more defensive:
    1) no empty vector!
    2) very large vectors!
     */
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println();
        Vector<Integer> v1 = createVectorRandom(0, 999999);



        int even = countEvenNumbersDefensive(v1);
        System.out.println();
        System.out.println("There are " + even + " even numbers.");

        Integer smallest = searchSmallestNumberDefensive(v1);
        ++smallest;
        System.out.println("MinValue: " + (smallest != null ? smallest : "Hello World!"));

        //Integer largest = searchLargestNumberDefensive(v1);
        //System.out.println("MaxValue: " + largest);
//
//        System.out.println("Sorted descending:");
//        Vector<Integer> sortedVector = bubblesortVectorDefensive(v1);
//        System.out.println(sortedVector);
//
//        System.out.println();
//        System.out.println("Vector without uneven numbers:");
//        Vector<Integer> evenOnlyVector = deleteUnevensDefensive(v1);
//        System.out.println(evenOnlyVector);

    }


    public static Vector<Integer> createVectorRandom(int amountNumbers, int maxRandomNr) {

        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < amountNumbers; i++) {
            v.add(rand.nextInt(maxRandomNr + 1));
        }
        return v;
    }

    public static int countEvenNumbersDefensive(Vector<Integer> inputVector) {
        int counter = 0;
        for (Integer x : inputVector) {
            if (x % 2 == 0) {
                ++counter;
            }
        }
        return counter;

//        for (int i = 0; i < inputVector.size(); i++) {
//            if (inputVector.get(i) % 2 == 0) {
//                ++counter;
//            }
//        }
//        return counter;

    }

    public static Integer searchSmallestNumberDefensive(Vector<Integer> inputVector) {
        if (inputVector.isEmpty()) { return null;}

        Integer min = inputVector.get(0);
        for (Integer x : inputVector) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int searchLargestNumberDefensive(Vector<Integer> inputVector) {
        int max = inputVector.get(0);
        for (Integer x : inputVector) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static Vector<Integer> bubblesortVectorDefensive(Vector<Integer> inputVector) {
        Vector<Integer> result = new Vector<>();
        result.addAll(inputVector);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j) < result.get(j + 1)) {
                    Integer tempValue = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, tempValue);
                }
            }
        }
        return result;
    }

    public static Vector<Integer> deleteUnevensDefensive(Vector<Integer> inputVector) {

        Vector<Integer> evensOnly = new Vector<>();
        for (Integer x : inputVector) {
            if (x % 2 == 0) {
                evensOnly.add(x);
            }
        }
        return evensOnly;
    }

}
