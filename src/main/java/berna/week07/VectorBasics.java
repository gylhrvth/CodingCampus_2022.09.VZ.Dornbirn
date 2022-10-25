package berna.week07;

import java.util.Random;
import java.util.Vector;

public class VectorBasics {
    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println();
        Vector<Integer> v1 = createVectorRandom(20, 99);
        System.out.println(v1);

        int even = countEvenNumbers(v1);
        System.out.println();
        System.out.println("There are " + even + " even numbers.");

        int smallest = searchSmallestNumber(v1);
        int largest = searchLargestNumber(v1);
        System.out.println("MinValue: " + smallest);
        System.out.println("MaxValue: " + largest);

        System.out.println("Sorted descending:");
        Vector<Integer> sortedVector = bubblesortVector(v1);
        System.out.println(sortedVector);

        System.out.println();
        System.out.println("Vector without uneven numbers:");
        Vector<Integer> evenOnlyVector = deleteUnevens(v1);
        System.out.println(evenOnlyVector);

    }


    private static Vector<Integer> createVectorRandom(int amountNumbers, int MaxRandomNr) {

        Vector<Integer> v = new Vector<>(amountNumbers);
        for (int i = 0; i < amountNumbers; i++) {
            v.add(rand.nextInt(MaxRandomNr + 1));
        }
        return v;
    }

    private static int countEvenNumbers(Vector<Integer> inputVector) {
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

    private static int searchSmallestNumber(Vector<Integer> inputVector) {
        int min = inputVector.get(0);
        for (Integer x : inputVector) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    private static int searchLargestNumber(Vector<Integer> inputVector) {
        int max = inputVector.get(0);
        for (Integer x : inputVector) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    private static Vector<Integer> bubblesortVector(Vector<Integer> inputVector) {
        int smallerValue = inputVector.get(0);
        for (int i = 0; i < inputVector.size() - 1; i++) {
            for (int j = 0; j < inputVector.size() - 1; j++) {
                if (inputVector.get(j) < inputVector.get(j + 1)) {
                    smallerValue = inputVector.get(j);
                    inputVector.set(j, inputVector.get(j + 1));
                    inputVector.set(j + 1, smallerValue);
                }
            }
        }
        return inputVector;
    }

    private static Vector<Integer> deleteUnevens(Vector<Integer> inputVector) {

        Vector<Integer> evensOnly = new Vector<>();
        for (Integer x : inputVector) {
            if (x % 2 == 0) {
                evensOnly.add(x);
            }
        }
        return evensOnly;
    }

}
