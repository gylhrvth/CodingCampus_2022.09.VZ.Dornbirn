package berna.week03;

import java.util.Arrays;

import static berna.week03.ArraysBasics.createRandomArray;
//TODO Separate functions, definitions, blabla

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = createRandomArray(1, 100);
        //System.out.println("Array created : " + Arrays.toString(arr));
        System.out.println("\n");
        bubblesort(false, arr);
        System.out.println(Arrays.toString(arr));
        testIfSorted(false, arr);

    }

    public static int[] bubblesort(boolean ascending, int[] arr) {
//        In a bubble sort algorithm, array is traversed from first element to last element.
//        The current element is compared with the next element.
//        If the current element is greater than the next element, it is swapped.

        int smallvalue = 0;     //to store one of the swapped values
        int i = 0;

        long start = System.currentTimeMillis();
        int comparison = 0;

        while (i < arr.length - 1) {

            if (ascending) {

                for (int j = 0; j < arr.length - 1; j++) {  //to optimize say (arr.length - 1-i)
                    if (arr[j] > arr[j + 1]) {      //if true, swap values
                        smallvalue = arr[j];        //store the bigger value
                        arr[j] = arr[j + 1];        //replace value j with smaller value
                        arr[j + 1] = smallvalue;    //bring back the bigger value
                    }
                    comparison++;       // counts the number of comparisons
                }
            } else {
                for (int j = 0; j < arr.length - 1; j++) {

                    if (arr[j] < arr[j + 1]) {      //if true, swap values
                        smallvalue = arr[j];        //store the smaller value
                        arr[j] = arr[j + 1];        //replace value j with bigger value
                        arr[j + 1] = smallvalue;    //bring back the smaller value
                    }
                    comparison++;       // counts the number of comparisons
                }
            }
            i++;        //counter for the while loop!!!
        }

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Comparisons: " + comparison + " took: " + duration + "ms");

        return arr;
    }


    public static void testIfSorted(boolean ascending, int[] arr) {

//        int startValue = arr[0];
//        for (
//                int value : arr) {
//            if (value < startValue) {
//                System.out.println("UNSORTED!!!!!111: " + startValue + " is bigger than " + value);
//                break;
//            }
//            startValue = value;
//        }
        if (ascending) {
            for (
                    int j = 0;
                    j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("UNSORTED!!!!!: " + arr[j] + " is bigger than " + arr[j + 1]);
                    break;
                }
            }
        } else {
            for (
                    int j = 0;
                    j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    System.out.println("UNSORTED!!!!!: " + arr[j] + " is smaller than " + arr[j + 1]);
                    break;
                }
            }
        }
    }
}