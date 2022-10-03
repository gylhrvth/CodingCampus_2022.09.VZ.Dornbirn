package viktor.week03;

import java.util.Arrays;
import java.util.Random;

public class Bubble {

    public static void sortAsc(int[] myArray) {

        int temp1 = 0;
        for (int h = 0; h < myArray.length - 1; h++) {
            for (int i = 0; i < myArray.length - 1 - h; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    temp1 = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp1;
                }
            }
        }
        System.out.println("Sorted Array (asc): " + Arrays.toString(myArray));
    }


    public static void sortDesc(int[] array) {
        int temp2 = 0;
        for (int h = 0; h < array.length - 1; h++) {
            for (int i = 0; i < array.length - 1 - h; i++) {
                if (array[i] < array[i + 1]) {
                    temp2 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp2;
                }
            }
        }
        System.out.println("Sorted Array (desc): " + Arrays.toString(array));
    }

    public static boolean isArraySortedAsc(int[] array) {
        for (int h = 0; h < array.length - 1; h++) {
            if (array[h] > array[h + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySortedDesc(int[] array) {
        for (int h = 0; h < array.length - 1; h++) {
            if (array[h] < array[h + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int size = ArrayExample1.readSize();
        int[] myArray = new int[size];
        int[] myArray2 = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myArray[i] = randomNumber;
            myArray2[i] = randomNumber;
        }
        System.out.println("Array:" + Arrays.toString(myArray));
        System.out.println();

        long start = System.currentTimeMillis();
        sortAsc(myArray);

        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println("Took: " + duration + "ms.");
        System.out.println("Is really sorted (asc): " + isArraySortedAsc(myArray));
        myArray[0] = myArray[myArray.length - 1];
        System.out.println("Should not be sorted: " + isArraySortedAsc(myArray));

        System.out.println();
        start = System.currentTimeMillis();
        sortDesc(myArray2);
        end = System.currentTimeMillis();
        duration = end - start;

        System.out.println("Took: " + duration + "ms.");
        System.out.println("Is really sorted (desc): " + isArraySortedDesc(myArray2));
        myArray2[0] = myArray2[myArray.length - 1];
        System.out.println("Should not be sorted: " + isArraySortedDesc(myArray2));


    }
}
